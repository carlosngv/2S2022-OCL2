package expresion2

import (
	arrayList "github.com/colegno/arraylist"
)

type ValorArreglo struct {
	Expresiones *arrayList.List
}

/*
	Es una expresión. Alternativa a la instancia.
	Unicamente recibe la lista de expresiones, cada expresión puede ser un nuevo arreglo o valores primitivos.

	Se enfoca en la data del arreglo, sus valores.
*/

func NewValorArreglo(expresiones *arrayList.List) ValorArreglo {

	return ValorArreglo{Expresiones: expresiones}

}
