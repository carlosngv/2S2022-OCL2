package expresion2

import (
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"

	arrayList "github.com/colegno/arraylist"
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

func (p InstanciaVector) Ejecutar(ent entorno.Entorno) interface{} {


	if !ent.ExisteSimbolo( p.ID ) {
		nuevoError := Analizador.NewErrorSemantico(
			0,
			0,
			"Error Semántico, la variable "+ p.ID +" ya está declarada.",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return nil
	}

	tempExp := arrayList.New()

	nuevoValor := entorno.TipoRetorno{
		Valor: tempExp,
		Tipo: p.Tipo,
	}

	return entorno.TipoRetorno{
		Tipo:  entorno.VECTOR,
		Valor: nuevoValor,
	}
}
