package asignacion

import (
	"p1/packages/Analizador/ast/interfaces"
)

type Asignacion struct {
	ID           	string
	NuevoValor 		interfaces.Expresion
	Valor 			interface{} //asignacion con un valor objeto pasado desde alguna instruccion
	Linea			int
	Columna			int

}

func NuevaAsignacion(id string, nuevoValor interfaces.Expresion, linea int, columna int ) Asignacion{
	return Asignacion{
		ID:				id,
		NuevoValor:		nuevoValor,
		Valor:			nil,
		Linea:			linea,
		Columna:		columna,
	}
}

func NuevaAsignacionValor(id string, valor interface{} ) Asignacion{
	return Asignacion{
		ID:				id,
		NuevoValor:		nil,
		Valor:			valor,
		Linea:			0,
		Columna:		0,
	}
}
