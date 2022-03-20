package expresion2

import (
	"encoding/json"
	"fmt"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"

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

func (i InstanciaArreglo) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	ListaIntDimensiones := i.ObtenerIntDimensiones(ent) // Lista de valores enteros

	valors := i.agregarValores(ListaIntDimensiones) // Ya devuelve un arreglo con arreglos

	data, err := json.MarshalIndent(valors, "", "  ")
	if err != nil {
		panic(err)
	}

	stringEsQuery := string(data)
	fmt.Printf(" data %v ", stringEsQuery)


	objeto := Simbolos.NewObjetoArray("", entorno.INTEGER, valors, ListaIntDimensiones)

	// Se almacena un TipoRetorno dentro de otro TipoRetorno para definir que es un arreglo
	objetoVal := entorno.TipoRetorno{
		Valor: objeto,
		Tipo:  entorno.INTEGER,
	}

	return entorno.TipoRetorno{Valor: objetoVal, Tipo: entorno.ARREGLO}
}

func (i InstanciaArreglo) ObtenerIntDimensiones(ent entorno.Entorno) *arraylist.List {

	/*
		Declara una listaDimensiones auxiliar que va a almacenar
		todos los valores retornados de las expresiones por cada
		dimensión de la lista de la instancia.

		Ejemplo:
			[3*3] -> se almacena el valor de 9 en listaDimensiones.

		listaDimensiones unicamente almacena valores.
	*/

	listaDimensiones := arraylist.New()

	for x := 0; x < i.Dimensiones.Len(); x++ {
		dime := i.Dimensiones.GetValue(x)

		valorRet := dime.(interfaces.Expresion).ObtenerValor(ent)

		// Validar que el indice sea unicamente entere (u64)
		if valorRet.Tipo != entorno.INTEGER {
			return nil
		}

		listaDimensiones.Add(valorRet.Valor)
	}

	return listaDimensiones

}

func (i InstanciaArreglo) agregarValores(list *arraylist.List) []interface{} {

	/*
		De la copia, se obtiene el primer valor y se remueve.
		Así recursivamente vamos trabajando dimensión por dimensión.
		Cada vez reduciendolos.

		Ejemplo, viene [6, 5]
	*/

	nuevaLista := list.Clone()

	anchoPiv := nuevaLista.GetValue(0).(int) // Pasada 1: anchoPiv = 6
	nuevaLista.RemoveAtIndex(0)				 // Pasada 1: lista = [5], se remueve el 6

	s := make([]interface{}, anchoPiv)		// Pasada 1: Se inicializa un arreglo de interfaces de tamaño anchoPiv (6)

	if nuevaLista.Len() > 0 {
		// Si hay  más dimensiones
		for x := 0; x < anchoPiv; x++ {	// Se itera 6 veces
			s[x] = i.agregarValores(nuevaLista) // Se llama recursivamente y se pasa [5] como argumento, se almacena un arreglo que retorna la llamada recursiva en s[x]
		}
	} else {
		for x := 0; x < anchoPiv; x++ {
			s[x] = -1 	// Valor por defecto si es integer, si es bool ponemos false, si es un String un cadena vacía
						// En la pasada 2: cuando nuevaLista.len() es < 0, se rellena de -1 la lista de la posición 0 a la posición menor a 5 (anchoPiv)
		}
	}

	return s

}
