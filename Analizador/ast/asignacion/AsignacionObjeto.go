package asignacion

import (
	"fmt"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"reflect"

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

func (a AsignacionObjeto) Ejecutar(ent entorno.Entorno) interface{} {

	// ID .   ID
	EXPR_INICIAL := a.ListaAccesos.GetValue(0)

	if (reflect.TypeOf(EXPR_INICIAL) == reflect.TypeOf(expresion.Identificador{})) {

		ID := EXPR_INICIAL.(expresion.Identificador).Identificador

		if !ent.ExisteSimbolo(ID) {
			fmt.Printf("No existe OBJETOOOOOO")
			return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
		}

		OBJETO := ent.ObtenerSimbolo(ID).(entorno.SimboloAbstracto)

		if OBJETO.GetTipo() == entorno.OBJETO {

			VALOR := OBJETO.(Simbolos.Objecto)

			nuevaLista := a.ListaAccesos.Clone()
			nuevaLista.RemoveAtIndex(0)

			return a.CambiarValorRecursivo(ent, nuevaLista, VALOR)

		}

	}

	return nil
}

func (a AsignacionObjeto) CambiarValorRecursivo(ent entorno.Entorno, ListaAccesos *arraylist.List, OBJETO Simbolos.Objecto) entorno.TipoRetorno {

	// PERSONA.CASA.TELEVISOR

	EXPR_INICIAL := ListaAccesos.GetValue(0)
	nuevaLista := a.ListaAccesos.Clone()
	nuevaLista.RemoveAtIndex(0)

	if (reflect.TypeOf(EXPR_INICIAL) == reflect.TypeOf(expresion.Identificador{})) {

		ID := EXPR_INICIAL.(expresion.Identificador).Identificador

		if !OBJETO.EntornoPropio.ExisteSimbolo(ID) {
			fmt.Printf("No existe OBJETOOOOOO")
			return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
		}

		simbolo := OBJETO.EntornoPropio.ObtenerSimbolo(ID)

		if reflect.TypeOf(simbolo) != reflect.TypeOf(entorno.Simbolo{}) {
			//return entorno.TipoRetorno{Valor: -1, Tipo: entorno.NULL}
			SUB_OBJETO := simbolo.(Simbolos.Objecto)
			return a.CambiarValorRecursivo(ent, nuevaLista, SUB_OBJETO)
		}

		var expresionValor entorno.TipoRetorno

		if a.Expr != nil {
			expresionValor = a.Expr.ObtenerValor(ent)
		} else {
			expresionValor.Valor = a.Valor
		}

		if a.Valor != nil {
			if expresionValor.Tipo != simbolo.(entorno.Simbolo).Tipo {
				return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
			}

			simb := simbolo.(entorno.Simbolo)
			simb.Valor = expresionValor.Valor
			OBJETO.EntornoPropio.CambiarValor(simb.Identificador, simb)

		}

		return entorno.TipoRetorno{Valor: true, Tipo: simbolo.(entorno.Simbolo).Tipo}

	}

	return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
}
