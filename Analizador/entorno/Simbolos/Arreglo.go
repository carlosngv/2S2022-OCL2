package Simbolos

import (
	"fmt"
	"p1/packages/Analizador/entorno"
	"reflect"

	"github.com/colegno/arraylist"
)

type ObjetoArray struct {
	entorno.Simbolo
	Valores             []interface{}
	ListaIntDimensiones *arraylist.List
}

func NewObjetoArray(identificador string, Tipo entorno.TipoDato, valores []interface{}, ListaIntDimensiones *arraylist.List) ObjetoArray {

	simb := entorno.NewSimboloArreglo(0, 0, identificador, Tipo)
	return ObjetoArray{Simbolo: simb, Valores: valores, ListaIntDimensiones: ListaIntDimensiones}
}

func (Ob ObjetoArray) ObtenerValor(lista *arraylist.List, indiceNivel int, valores []interface{}) interface{} {


	/*

	*/

	listaClon := lista.Clone()

	indicePiv := listaClon.GetValue(0).(int)
	tamaNivel := Ob.ListaIntDimensiones.GetValue(indiceNivel).(int)
	listaClon.RemoveAtIndex(0)

	fmt.Printf("%v -> %v", indicePiv, indiceNivel)

	if listaClon.Len() > 0 {

		if indicePiv > tamaNivel-1 {
			fmt.Println("ERROR, se intentó acceder a una posición inválida.")
			return nil
		} else {

			subArray := valores[indicePiv]

			if reflect.TypeOf(subArray) != reflect.TypeOf([]interface{}{}) {

				fmt.Println("ERROR, los tipos no coinciden. No es arreglo.")
				return nil
			} else {
				return Ob.ObtenerValor(listaClon, indiceNivel+1, subArray.([]interface{}))
			}

		}

	} else {

		if indicePiv > tamaNivel-1 {
			fmt.Println("ERROR, se intentó acceder a una posición inválida.")
			return nil
		}

		return valores[indicePiv] // Retorna el valor completo recursivamente.
	}

}

func (Ob ObjetoArray) CambiarValor(lista *arraylist.List, indiceNivel int, valores []interface{}, nuevoValor interface{}) {

	// 1  2  0

	listaClon := lista.Clone()

	indicePiv := listaClon.GetValue(0).(int)
	tamaNivel := Ob.ListaIntDimensiones.GetValue(indiceNivel).(int)
	listaClon.RemoveAtIndex(0)

	fmt.Printf("%v -> %v", indicePiv, indiceNivel)

	if listaClon.Len() > 0 {

		if indicePiv > tamaNivel-1 {
			fmt.Println("Error1")
		} else {

			subArray := valores[indicePiv]

			if reflect.TypeOf(subArray) != reflect.TypeOf([]interface{}{}) {

				fmt.Println("Error2")
			} else {
				Ob.CambiarValor(listaClon, indiceNivel+1, subArray.([]interface{}), nuevoValor)
			}

		}

	} else {
		if indicePiv > tamaNivel-1 {

			fmt.Println("Error3")
			return
		}
		valores[indicePiv] = nuevoValor
	}

}
