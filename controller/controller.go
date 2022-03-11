package controller

import (
	"encoding/json"
	"fmt"
	"net/http"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"p1/packages/Analizador/parser"
	"p1/packages/utilities"
	"reflect"

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

func ProcessData(w http.ResponseWriter, r *http.Request) {

	w.Header().Set("content-type", "application/json")
	var input Input

	err := json.NewDecoder(r.Body).Decode(&input)
	if err != nil {
		w.WriteHeader(http.StatusBadRequest)
		json.NewEncoder(w).Encode(map[string]interface{}{"status": http.StatusBadRequest, "msg": "Error, revise los datos ingresados."})
		return
	}

	fmt.Println(input.Data)

	errores := &utilities.CustomErrorListener{}


	is := antlr.NewInputStream(input.Data)


	// Creación de lexer
	fmt.Println("Entra LEXER")
	lexer := parser.NewParserLexer(is)
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(errores)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	fmt.Println("Sale LEXER")

	// Creando el parser
	fmt.Println("Entra PARSER")
	p := parser.NewParser(stream)
	p.RemoveErrorListeners()
	p.AddErrorListener(errores)
	fmt.Println("Sale LEXER")
	p.BuildParseTrees = true
	tree := p.Start()

	var listener *utilities.TreeShapeListener = utilities.NewTreeShapeListener()

	if len(errores.Errors) == 0 {
		antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	}

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

	fmt.Println("SALIDA: " + Analizador.Salida)

	json.NewEncoder(w).Encode(map[string]interface{}{"val": Analizador.Salida})

	// w.WriteHeader(http.StatusOK)

	// response.Status = http.StatusOK
	// response.Msg = "Entrada procesada con exito."

	// jsonResponse, err := json.Marshal(response)

	// if err != nil { return }

	// w.Write(jsonResponse)

}
