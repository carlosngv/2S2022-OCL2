package expresion2

import (
	"p1/packages/Analizador/entorno"
)

type InstanciaVector struct {
	ID 			string
	Tipo        entorno.TipoDato
	EsMutable    	    bool
}

/*
	Es una expresión.

	Consta de un tipo y la lista de dimensiones.
	Las dimensiones son los pares de llaves cuadradas.
	new int[3][4][5], no maneja los valores.

	Se le asigna valores por defecto al arreglo.

*/

func NewVector(id string, tipo entorno.TipoDato, esMutable bool) InstanciaVector {
	exp := InstanciaVector{
		id,
		tipo,
		esMutable,
	}
	return exp
}

func (vec InstanciaVector) Get3D(ent *entorno.Entorno) string {
	return ""
}
