package Definicion

import (
	"fmt"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
)

type DeclaracionArray struct {
	Tamano        int
	Identificador string
	Inicializar   interfaces.Expresion
	Tipo          entorno.TipoDato
	EsMutable 	  bool
}

func NewDeclaracionArray(tamano int, identificador string, inicializar interfaces.Expresion, tipo entorno.TipoDato, esMutable bool) DeclaracionArray {
	return DeclaracionArray{
		Tamano:        tamano,
		Identificador: identificador,
		Inicializar:   inicializar, // Valores a inicializar
		Tipo:          tipo,
		EsMutable:     esMutable,
	}
}

/*
	La declaración se enfoca en el lado izquierdo al definir una arreglo.
	Ejemplo

		int [][] arr1 = new int[3][5]

		lado izquierdo -> int [][] arr1

	Es por eso que se maneja el identificador acá.

*/

func (d DeclaracionArray) Ejecutar(ent entorno.Entorno) interface{} {

	fmt.Printf("\n SE DECLARA ARRAQY \n")

	valorDec := d.Inicializar.ObtenerValor(ent)

	if valorDec.Tipo != entorno.VOID {
		fmt.Printf("%v ", valorDec)
	}

	if valorDec.Tipo != entorno.ARREGLO {
		// TODO: ALMACENAR ERROR SINTACTICO
		return nil
	}

	// int [][] arr1 = new int[3][¢]
	// Valida si el int izquierdo coincide con el tipo del lado derecho
	// if reflect.TypeOf(valorDec.Valor) != reflect.TypeOf(entorno.TipoRetorno{}) {
	// 	// TODO: ALMACENAR ERROR EN CASO EL TIPO DEL VALOR DEL ARREGLO NO SEA IGUAL AL TIPO DEL VALOR DE DECLARACIÓN
	// 	return nil
	// }

	Objeto := valorDec.Valor.(entorno.TipoRetorno)

	if Objeto.Tipo != d.Tipo {

		fmt.Println("Err3")
		return nil
	}

	// Validando el tamaño de las dimensiones (SE OMITE DE MOMENTO)
	// if Objeto.Valor.(Simbolos.ObjetoArray).ListaIntDimensiones.Len() > d.Tamano {

	// 	fmt.Printf("Errror, variable %s no posible declarar", d.Identificador)
	// 	return nil
	// }

	if ent.ExisteSimbolo(d.Identificador) {

		fmt.Printf("Error, variable %s ya declarada", d.Identificador)

		} else {

		simbol := Objeto.Valor.(Simbolos.ObjetoArray)
		simbol.Identificador = d.Identificador
		ent.AgregarSimbolo(d.Identificador, simbol)

	}

	fmt.Printf("%v ", ent.Tabla)

	return nil

}
