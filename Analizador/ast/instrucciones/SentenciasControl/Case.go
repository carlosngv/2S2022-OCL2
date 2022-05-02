package SentenciasControl

import (
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

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

func (mc MatchCase) Get3D(ent *entorno.Entorno) string {
	codigo := ""
	for i := 0; i < mc.ListaInstrucciones.Len(); i++ {
		instruccionActual := mc.ListaInstrucciones.GetValue(i)
		codigo += instruccionActual.(interfaces.Instruccion).Get3D(ent) + "\n"
	}

	return Analizador.GeneradorGlobal.Tabular(codigo)
}
