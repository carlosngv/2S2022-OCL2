package Analizador

import (
	"time"

	"github.com/colegno/arraylist"
)

type ErrorSemantico struct {
	Linea   int
	Columna int
	Msg     string
	Time    time.Time
}

func NewErrorSemantico(linea int, columna int, msg string) ErrorSemantico {
	return ErrorSemantico{Linea: linea, Columna: columna, Msg: msg, Time: time.Now(),}
}

var ListaErrores *arraylist.List
