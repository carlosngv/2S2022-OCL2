package SentenciasControl

import (
	"p1/packages/Analizador/ast/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type MatchInstruccion struct {
	Condicion                   interfaces.Expresion
	ListaCases *arrayList.List
}

func NewMatchInstruccion(condicion interfaces.Expresion, listaCases *arrayList.List) MatchInstruccion {
	return MatchInstruccion{
		Condicion:  condicion,
		ListaCases: listaCases,
	}
}
