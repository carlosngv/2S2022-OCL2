package SentenciasCiclicas

import (
	"p1/packages/Analizador/entorno"

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


func (lp LoopInstruccion) Get3D(ent *entorno.Entorno) string {
	return ""
}
