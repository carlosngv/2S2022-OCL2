package Simbolos

import (
	"p1/packages/Analizador/entorno"

	"github.com/colegno/arraylist"
)

type ObjetoArray struct {
	entorno.Simbolo
	Valores             []interface{}
	ListaIntDimensiones *arraylist.List
}

func NewObjetoArray(identificador string, Tipo entorno.TipoDato, valores []interface{}, ListaIntDimensiones *arraylist.List) ObjetoArray {

	simb := entorno.NewSimboloArreglo(0, 0, identificador, Tipo)
	return ObjetoArray{Simbolo: simb, Valores: valores, ListaIntDimensiones: ListaIntDimensiones}
}
