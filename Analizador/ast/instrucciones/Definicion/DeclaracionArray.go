package Definicion

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
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

func (dec DeclaracionArray) Get3D(ent *entorno.Entorno) string {
	return ""
}

/*
	La declaración se enfoca en el lado izquierdo al definir una arreglo.
	Ejemplo

		int [][] arr1 = new int[3][5]

		lado izquierdo -> int [][] arr1

	Es por eso que se maneja el identificador acá.

*/
