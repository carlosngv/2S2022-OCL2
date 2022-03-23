package expresion2

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	arrayList "github.com/colegno/arraylist"
)

type InstanciaVector struct {
	ID 			string
	Tipo        entorno.TipoDato
	ListExp  	*arrayList.List // es una expresion con una lista de
}

/*
	Es una expresión.

	Consta de un tipo y la lista de dimensiones.
	Las dimensiones son los pares de llaves cuadradas.
	new int[3][4][5], no maneja los valores.

	Se le asigna valores por defecto al arreglo.

*/

func NewVector(id string, tipo entorno.TipoDato, list *arrayList.List) InstanciaVector {
	exp := InstanciaVector{
		id,
		tipo,
		list,
	}
	return exp
}

func (p InstanciaVector) Ejecutar(ent entorno.Entorno) interface{} {


	tempExp := arrayList.New()

	for _, s := range p.ListExp.ToArray() {
		tempExp.Add(s.(interfaces.Expresion).ObtenerValor(ent))
	}

	return entorno.TipoRetorno{
		Tipo:  entorno.VECTOR,
		Valor: tempExp,
	}
}
