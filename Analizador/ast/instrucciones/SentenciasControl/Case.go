package SentenciasControl

import (
	arrayList "github.com/colegno/arraylist"
)

type MatchCase struct {
	ListaExpresiones *arrayList.List
	ListaInstrucciones *arrayList.List
}

func NewMatchCase(listaExpresiones *arrayList.List, listaInstrucciones *arrayList.List) MatchCase {
	return MatchCase{
		ListaExpresiones: listaExpresiones,
		ListaInstrucciones: listaInstrucciones,
	}
}
