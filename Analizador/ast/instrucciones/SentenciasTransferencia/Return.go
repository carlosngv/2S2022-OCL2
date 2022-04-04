package SentenciasTransferencia

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
)

type Return struct {
	Tipo   entorno.TipoDato
	Salida interfaces.Expresion
}


func NewReturn(tipo entorno.TipoDato, salida interfaces.Expresion) Return {

	if salida != nil {
		return Return{
			Tipo:   tipo,
			Salida: salida,
		}
	}

	return Return{
		Tipo:   tipo,
		Salida: nil,
	}
}
