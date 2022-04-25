package controller

import (
	"fmt"
	"net/http"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/instrucciones"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"p1/packages/Analizador/parser"
	"p1/packages/utilities"
	"reflect"
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
	Analizador.GeneradorGlobal.Reiniciar()
	AST := listener.Ast // A partir del ast se puede acceder a los no terminales de las producciones

	ENTORNO_GLOBAL := entorno.NewEntorno("Global", nil)

	for i := 0; i < AST.ListaInstrucciones.Len(); i++ {

		r := AST.ListaInstrucciones.GetValue(i)
		if r != nil {
			if reflect.TypeOf(r) == reflect.TypeOf(instrucciones.DefClase{}) {
				def_CLASE := r.(instrucciones.DefClase)
				def_CLASE.Get3D(&ENTORNO_GLOBAL)
			}
		}

	}


	salir := false
	CODIGO_MAIN := ""
	CODIGO_FUNCIONES := "" // Son todas las funciones que vienen arriba del main generado.

	for _, element := range ENTORNO_GLOBAL.TablaClases {

		pivotClass := element.(*entorno.Clase)

		if salir {
			break
		}

		for j := 0; j < pivotClass.Instrucciones.Len(); j++ {

			buscar := pivotClass.Instrucciones.GetValue(j)

			if (reflect.TypeOf(buscar) == reflect.TypeOf(Simbolos.Funcion{})) {

				if buscar.(Simbolos.Funcion).Identificador == "main" {

					CODIGO_FUNCIONES += CREAR_MAIN(*pivotClass, &ENTORNO_GLOBAL)

					MAIN_FN := buscar.(Simbolos.Funcion)

					for x := 0; x < MAIN_FN.ListaInstrucciones.Len(); x++ {
						MAIN_FN_INSTR := MAIN_FN.ListaInstrucciones.GetValue(x)

						CODIGO_TEMPORAL := MAIN_FN_INSTR.(interfaces.Instruccion).Get3D(&ENTORNO_GLOBAL)

						CODIGO_MAIN += Analizador.GeneradorGlobal.Tabular(CODIGO_TEMPORAL)
					}

					salir = true
					break
				}
			}
		}

	}

	CODIGO_FINAL := ""

	CODIGO_FINAL += Analizador.GeneradorGlobal.Encabezado()
	CODIGO_FINAL += CODIGO_FUNCIONES
	CODIGO_FINAL += Analizador.GeneradorGlobal.Funciones + "\n"
	CODIGO_FINAL += "\n\nvoid main() {\n\n"
	CODIGO_FINAL += CODIGO_MAIN
	CODIGO_FINAL += "\treturn;\n"
	CODIGO_FINAL += "}"



	// if Analizador.ListaErrores.Len() > 0 {
	// 	fmt.Printf("\nERRORES PROPIOS: %v\n", Analizador.ListaErrores)
	// 	Analizador.Salida = ""
	// 	var listaAux []Analizador.ErrorSemantico
	// 	for i := 0; i < Analizador.ListaErrores.Len(); i++ {
	// 		errorActual := Analizador.ListaErrores.GetValue(i)
	// 		listaAux = append(listaAux, errorActual.(Analizador.ErrorSemantico))
	// 		// Analizador.Salida += ">> " + errorActual.(Analizador.ErrorSemantico).Msg + "\n"
	// 		Analizador.Salida += ">> " + errorActual.(Analizador.ErrorSemantico).Msg + " Linea " + strconv.Itoa(errorActual.(Analizador.ErrorSemantico).Linea) + ", Columna " + strconv.Itoa(errorActual.(Analizador.ErrorSemantico).Columna) + ".\n"
	// 	}
	// 	listaErrores.Output2 = listaAux
	// 	http.Redirect(w, r, "/errores", http.StatusMovedPermanently)
	// 	return
	// }

	output.Output = CODIGO_FINAL

	//fmt.Printf("\n %v \n", CODIGO_FINAL)

	http.Redirect(w, r, "/", http.StatusMovedPermanently)
}


func CREAR_MAIN(MAIN entorno.Clase, ent *entorno.Entorno) string {

	codigo := ""

	for x := 0; x < MAIN.Instrucciones.Len(); x++ {

		r := MAIN.Instrucciones.GetValue(x)

		if r != nil {
			if reflect.TypeOf(r) == reflect.TypeOf(Simbolos.Funcion{}) {
				func_ := r.(Simbolos.Funcion)

				if !ent.ExisteFuncion(func_.Identificador) {
					ent.AgregarFuncion(func_.Identificador, func_)
				} else {
					//ERROR
				}

			} else {
				codigo += r.(interfaces.Instruccion).Get3D(ent)
			}

		}

	}


	return codigo

}
