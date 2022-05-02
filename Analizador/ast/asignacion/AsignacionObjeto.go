package asignacion

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	"github.com/colegno/arraylist"
)

type AsignacionObjeto struct {
	ListaAccesos *arraylist.List
	Expr         interfaces.Expresion
	Valor        interface{}
}

func NewAsignacionObjeto(listaAccesos *arraylist.List, expr interfaces.Expresion) AsignacionObjeto {
	return AsignacionObjeto{ListaAccesos: listaAccesos, Expr: expr, Valor: nil}
}

func NewAsignacionObjetoValor(listaAccesos *arraylist.List, valor interface{}) AsignacionObjeto {
	return AsignacionObjeto{ListaAccesos: listaAccesos, Valor: valor}
}

func (asignacion AsignacionObjeto) Get3D(ent *entorno.Entorno) string {
	return ""
}
