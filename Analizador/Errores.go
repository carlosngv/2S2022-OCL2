package Analizador

import "github.com/colegno/arraylist"

type ErrorSemantico struct {
	Linea   int
	Columna int
	Msg     string
}

func NewErrorSemantico(linea int, columna int, msg string) ErrorSemantico {
	return ErrorSemantico{Linea: linea, Columna: columna, Msg: msg}
}

var ListaErrores *arraylist.List
