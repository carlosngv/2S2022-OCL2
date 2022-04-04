package SentenciasCiclicas

import (
	"p1/packages/Analizador/ast/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type WhileInstruccion struct {
	Condicion          interfaces.Expresion
	ListaInstrucciones *arrayList.List
}

func NewWhileInstruccion(condicion interfaces.Expresion, listaInstrucciones *arrayList.List) WhileInstruccion {
	return WhileInstruccion{
		Condicion:  condicion,
		ListaInstrucciones: listaInstrucciones,
	}
}
