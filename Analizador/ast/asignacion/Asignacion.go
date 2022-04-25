package asignacion

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
)

type Asignacion struct {
	ID           	string
	NuevoValor 		interfaces.Expresion
	Valor 			interface{} //asignacion con un valor objeto pasado desde alguna instruccion
	Linea			int
	Columna			int

}

func NewAsignacion(id string, nuevoValor interfaces.Expresion, linea int, columna int ) Asignacion{
	return Asignacion{
		ID:				id,
		NuevoValor:		nuevoValor,
		Valor:			nil,
		Linea:			linea,
		Columna:		columna,
	}
}

func NewAsignacionValor(id string, valor interface{} ) Asignacion{
	return Asignacion{
		ID:				id,
		NuevoValor:		nil,
		Valor:			valor,
		Linea:			0,
		Columna:		0,
	}
}


func (asignacion Asignacion) Get3D(ent *entorno.Entorno) string {
	return ""
}
