package Accesos

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type AccesoObjeto struct {
	ListaAccesos *arrayList.List
	ObtenerReferencia bool
}

func NewAccesoObjeto(listaAccesos *arrayList.List) AccesoObjeto {
	return AccesoObjeto{ListaAccesos: listaAccesos}
}

func (a AccesoObjeto) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	EXPR_INICIAL := a.ListaAccesos.GetValue(0)

	/*
		? La lista de accesos es el: obj.atr.atr.atr.
		=============================================
		! No puede ser diferente a un identificador.
	*/

	if reflect.TypeOf(EXPR_INICIAL) != reflect.TypeOf(expresion.Identificador{}) {
		// TODO: ERROR, el atributo no es una expresión válida.
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	// ? Se válida que exista el objeto

	ID := EXPR_INICIAL.(expresion.Identificador)
	existeEnEntorno := ent.ExisteSimbolo(ID.Identificador)

	if !existeEnEntorno {
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	// ? Se trae al objeto

	OBJETO := ent.ObtenerSimbolo(ID.Identificador).(entorno.SimboloAbstracto)

	if OBJETO.GetTipo() == entorno.OBJETO {

		nuevaLista := a.ListaAccesos.Clone()
		nuevaLista.RemoveAtIndex(0)

		VALOR := OBJETO.(Simbolos.Objecto) // ? El valor del objeto como tal

		RESULTADO_FINAL := entorno.Result3D{}

		temporalStack := Analizador.GeneradorGlobal.ObtenerTemporal()
		temporalHeap := Analizador.GeneradorGlobal.ObtenerTemporal()

		RESULTADO_FINAL.Codigo += "\n/* ACCEDIENDO AL OBJETO: " + ID.Identificador + " */ \n"

		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = SP + %d;  /* Direccion en Stack del objeto */ \n", temporalStack, VALOR.Posicion)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = Stack[(int) %s]; \n", temporalHeap, temporalStack)

		BUSQUEDA := a.ObtenerValorRecursivo(ent, nuevaLista, VALOR, temporalHeap)

		RESULTADO_FINAL.Codigo += BUSQUEDA.Codigo
		RESULTADO_FINAL.Tipo = BUSQUEDA.Tipo
		RESULTADO_FINAL.Temporal = BUSQUEDA.Temporal
		RESULTADO_FINAL.ValorEnHeap = BUSQUEDA.ValorEnHeap

		return RESULTADO_FINAL
	}

	return entorno.Result3D{Tipo: entorno.NULL}
}

func (a AccesoObjeto) ObtenerValorRecursivo(ent *entorno.Entorno, ListaAccesos *arrayList.List, OBJETO Simbolos.Objecto, DIR_HEAP string) entorno.Result3D {

	EXPR_INI := ListaAccesos.GetValue(0)

	// ? Se valida que sea un identificador
	if reflect.TypeOf(EXPR_INI) != reflect.TypeOf(expresion.Identificador{}) {
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	ID := EXPR_INI.(expresion.Identificador)

	// ? Valida que el atributo exista en el entorno de la clase (struct)
	existeAtributo := OBJETO.EntornoPropio.ExisteSimbolo(ID.Identificador)
	if !existeAtributo {
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	simboloAtributo := OBJETO.EntornoPropio.ObtenerSimbolo(ID.Identificador).(entorno.Simbolo)

	RESULTADO_FINAL := entorno.Result3D{}
	temporalHeap := Analizador.GeneradorGlobal.ObtenerTemporal()
	temporalAux := Analizador.GeneradorGlobal.ObtenerTemporal() // ? Temporal que contendrá el valor del atributo

	// ? Se obtiene la posición del atributo temporalHeap = posición heap actual + posición relativa del atributo
	RESULTADO_FINAL.Codigo  += fmt.Sprintf("%s = %s  + %d;\n", temporalHeap, DIR_HEAP, simboloAtributo.Posicion)

	if a.ObtenerReferencia {
		RESULTADO_FINAL.Temporal = temporalHeap
		RESULTADO_FINAL.ValorEnHeap = true
	} else {

		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = Heap[(int) %s]; /* CAPTURANDO VARIABLE %s */;\n ", temporalAux, temporalHeap, ID.Identificador)
		RESULTADO_FINAL.Temporal = temporalAux
	}

	RESULTADO_FINAL.Tipo = simboloAtributo.Tipo

	return RESULTADO_FINAL
}

func (this AccesoObjeto) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	this.ObtenerReferencia = true

	return this.Obtener3D(ent)
}
