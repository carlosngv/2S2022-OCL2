package Definicion

import (
	"fmt"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"

	"github.com/colegno/arraylist"
)

type DeclararObjeto struct {
	ValorInicializacion interfaces.Expresion
	TipoVariables       string
	ListaVars           *arraylist.List
}

//   Clase  ID  = NEW Clase();

func NewDeclararObjeto(tipoVariables string, listaVars *arraylist.List, valor interfaces.Expresion) DeclararObjeto {
	return DeclararObjeto{TipoVariables: tipoVariables, ListaVars: listaVars, ValorInicializacion: valor}
}

func (dec DeclararObjeto) Ejecutar(ent entorno.Entorno) interface{} {

	/*

		int a,b,c,d;

	*/

	INSTANCIA := dec.ValorInicializacion.ObtenerValor(ent)

	if dec.ListaVars.Len() > 1 {
		return nil
	}

	tipoExpresion := INSTANCIA.Tipo
	tipoDeclaracion := entorno.OBJETO

	if tipoDeclaracion != tipoExpresion {
		// ERROR ********************
		return nil
	}

	for i := 0; i < dec.ListaVars.Len(); i++ {

		varDeclarar := dec.ListaVars.GetValue(i).(expresion.Identificador)

		if ent.ExisteSimbolo(varDeclarar.Identificador) {
			fmt.Printf("Errror, variable %s ya declarada", varDeclarar.Identificador)
		} else {

			OBJETO := INSTANCIA.Valor.(Simbolos.Objecto)
			OBJETO.Identificador = varDeclarar.Identificador

			ent.AgregarSimbolo(OBJETO.Identificador, OBJETO)
		}

	}

	return nil
}
