package Accesos

import (
	"fmt"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"

	arrayList "github.com/colegno/arraylist"
)

type AccessoArr struct {
	Identificador string
	Dimensiones   *arrayList.List
}

func NewAccessoArr(identificador string, dimensiones *arrayList.List) AccessoArr {
	return AccessoArr{Identificador: identificador, Dimensiones: dimensiones}
}

func (a AccessoArr) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	existe := ent.ExisteSimbolo(a.Identificador)

	if !existe {
		// TODO: Agregar a lista de errores
		fmt.Println("no existe el arreglo")
		return entorno.TipoRetorno{Valor: 0, Tipo: entorno.NULL}
	}

	simbol := ent.ObtenerSimbolo(a.Identificador)

	fmt.Printf("\n SIMBOLO ACCARR: %v \n", simbol)

	// Valida si es de tipo arreglo
	// if reflect.TypeOf(simbol) != reflect.TypeOf(Simbolos.ObjetoArray{}) {

	// 	fmt.Println("no es un arreglo")
	// 	return entorno.TipoRetorno{Valor: 0, Tipo: entorno.NULL}
	// }

	objetoArr := simbol.(Simbolos.ObjetoArray)

	// if objetoArr.ListaIntDimensiones.Len() != a.Dimensiones.Len() {
	// 	fmt.Println("Dimensiones no coinciden")
	// 	return entorno.TipoRetorno{Valor: 0, Tipo: entorno.NULL}
	// }

	dimensiones := a.ObtenerIntDimensiones(ent) // Se obtiene la lista de enteros para las posiciones (Expresiones)

	val := objetoArr.ObtenerValor(dimensiones, 0, objetoArr.Valores) // me mandan dimensiones, indiceNivel, valores. Retorna valor en los indices indicados

	return entorno.TipoRetorno{Valor: val, Tipo: objetoArr.Tipo}
}

func (a AccessoArr) ObtenerIntDimensiones(ent entorno.Entorno) *arrayList.List {

	listaDimensiones := arrayList.New()

	for x := 0; x < a.Dimensiones.Len(); x++ {
		dime := a.Dimensiones.GetValue(x)

		valorRet := dime.(interfaces.Expresion).ObtenerValor(ent)

		if valorRet.Tipo != entorno.INTEGER {
			return nil
		}

		listaDimensiones.Add(valorRet.Valor)
	}

	return listaDimensiones

}
