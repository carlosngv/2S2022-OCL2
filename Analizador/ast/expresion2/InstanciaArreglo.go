package expresion2

import (
	"p1/packages/Analizador/entorno"

	"github.com/colegno/arraylist"
)

type InstanciaArreglo struct {
	Tipo        entorno.TipoDato
	Dimensiones *arraylist.List
}

/*
	Es una expresión.

	Consta de un tipo y la lista de dimensiones.
	Las dimensiones son los pares de llaves cuadradas.
	new int[3][4][5], no maneja los valores.

	Se le asigna valores por defecto al arreglo.

*/

func NewInstanciaArreglo(tipo entorno.TipoDato, dimensiones *arraylist.List) InstanciaArreglo {

	return InstanciaArreglo{Tipo: tipo, Dimensiones: dimensiones}
}
