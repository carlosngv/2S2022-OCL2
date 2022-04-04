package Definicion

import (
	"p1/packages/Analizador/ast/interfaces"

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
