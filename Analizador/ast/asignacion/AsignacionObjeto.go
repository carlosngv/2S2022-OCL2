package asignacion

import (
	"p1/packages/Analizador/ast/interfaces"

	"github.com/colegno/arraylist"
)

type AsignacionObjeto struct {
	ListaAccesos *arraylist.List
	Expr         interfaces.Expresion
	Valor        interface{}
}

func NewAsignacionObjeto(listaAccesos *arraylist.List, expr interfaces.Expresion) AsignacionObjeto {
	return AsignacionObjeto{ListaAccesos: listaAccesos, Expr: expr}
}

func NewAsignacionObjetoValor(listaAccesos *arraylist.List, valor interface{}) AsignacionObjeto {
	return AsignacionObjeto{ListaAccesos: listaAccesos, Valor: valor}
}
