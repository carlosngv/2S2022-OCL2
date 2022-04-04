package SentenciasCiclicas

import (
	arrayList "github.com/colegno/arraylist"
)

/*

	Es un búcle infinito. Unicamente puede
	pararse con sentencias de transferencia.


*/

type LoopInstruccion struct {
	ListaInstrucciones *arrayList.List
}

func NewLoopInstruccion(listaInstrucciones *arrayList.List) LoopInstruccion {
	return LoopInstruccion{
		ListaInstrucciones: listaInstrucciones,
	}
}
