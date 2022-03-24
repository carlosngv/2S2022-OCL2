package controller

import (
	"fmt"
	"net/http"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"p1/packages/Analizador/parser"
	"p1/packages/utilities"
	"reflect"
	"strconv"
	"text/template"

	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/colegno/arraylist"
)

type Input struct {
	Data string `json:"data"`
}

type Response struct {
	Status int `json:"status"`
	Msg string `json:"msg"`
}

type Output struct {
	Output string
}

type ReporteErrores struct {
	// Output
	Output []utilities.CustomSyntaxError
	Output2 []Analizador.ErrorSemantico
}
type ReporteTS struct {
	Output []Analizador.TablaSimbolos
}

var output Output
var listaErrores ReporteErrores

var templates = template.Must(template.ParseGlob("templates/*"))


func Index(w http.ResponseWriter, r *http.Request) {
	templates.ExecuteTemplate(w, "index", output)
}
func VistaTS(w http.ResponseWriter, r *http.Request) {
	templates.ExecuteTemplate(w, "ts", Analizador.ListaTablaSimbolos)
}

func VistaErrores(w http.ResponseWriter, r *http.Request) {
	if len(listaErrores.Output) > 0 {
		templates.ExecuteTemplate(w, "errors", listaErrores.Output)
	} else if len(listaErrores.Output2) > 0 {
		templates.ExecuteTemplate(w, "errors", listaErrores.Output2)
	}
}




func ProcessData(w http.ResponseWriter, r *http.Request) {
	var input string
	if r.Method == "POST" {
		input = r.FormValue("input")
	}

	w.Header().Set("content-type", "application/json")

	// err := json.NewDecoder(r.Body).Decode(&input)
	// if err != nil {
	// 	w.WriteHeader(http.StatusBadRequest)
	// 	json.NewEncoder(w).Encode(map[string]interface{}{"status": http.StatusBadRequest, "msg": "Error, revise los datos ingresados."})
	// 	return
	// }

	// fmt.Println(input.Data)

	errores := &utilities.CustomErrorListener{}
	Analizador.ListaErrores = arraylist.New()

	is := antlr.NewInputStream(input)


	// Creación de lexer
	lexer := parser.NewParserLexer(is)
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(errores)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)


	// Creando el parser
	p := parser.NewParser(stream)
	p.RemoveErrorListeners()
	p.AddErrorListener(errores)

	p.BuildParseTrees = true
	tree := p.Start()

	Analizador.Salida = ""

	var listener *utilities.TreeShapeListener = utilities.NewTreeShapeListener()


	listaErrores.Output = nil
	if len(errores.Errors) == 0 {
		antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	}else{
		antlr.ParseTreeWalkerDefault.Walk(listener, tree)
		listaErrores.Output = errores.Errors
		fmt.Printf("\nERRORES: %v\n", errores)

		http.Redirect(w, r, "/errores", http.StatusMovedPermanently)
		return
	}

	Analizador.ListaTablaSimbolos = []Analizador.TablaSimbolos{}
	AST := listener.Ast // A partir del ast se puede acceder a los no terminales de las producciones

	ENTORNO_GLOBAL := entorno.NewEntorno("Global", nil)
	ListFunciones := arraylist.New()

	for i := 0; i < AST.ListaInstrucciones.Len(); i++ {

		r := AST.ListaInstrucciones.GetValue(i)
		if r != nil {
			if reflect.TypeOf(r) == reflect.TypeOf(Simbolos.Funcion{}) {
				ListFunciones.Add(r.(Simbolos.Funcion))
				ENTORNO_GLOBAL.AgregarFuncion(r.(Simbolos.Funcion).Identificador, r)
			}
		}
	}

	for i := 0; i < ListFunciones.Len(); i++ {
		funcion := ListFunciones.GetValue(i).(Simbolos.Funcion)

		if funcion.Identificador == "main" {
			funcion.Ejecutar(ENTORNO_GLOBAL)
		}

	}



	if Analizador.ListaErrores.Len() > 0 {
		fmt.Printf("\nERRORES PROPIOS: %v\n", Analizador.ListaErrores)
		Analizador.Salida = ""
		var listaAux []Analizador.ErrorSemantico
		for i := 0; i < Analizador.ListaErrores.Len(); i++ {
			errorActual := Analizador.ListaErrores.GetValue(i)
			listaAux = append(listaAux, errorActual.(Analizador.ErrorSemantico))
			// Analizador.Salida += ">> " + errorActual.(Analizador.ErrorSemantico).Msg + "\n"
			Analizador.Salida += ">> " + errorActual.(Analizador.ErrorSemantico).Msg + " Linea " + strconv.Itoa(errorActual.(Analizador.ErrorSemantico).Linea) + ", Columna " + strconv.Itoa(errorActual.(Analizador.ErrorSemantico).Columna) + ".\n"
		}
		listaErrores.Output2 = listaAux
		http.Redirect(w, r, "/errores", http.StatusMovedPermanently)
		return
	}

	output.Output = Analizador.Salida

	fmt.Printf("\n %v \n", Analizador.Salida)

	http.Redirect(w, r, "/", http.StatusMovedPermanently)
}
