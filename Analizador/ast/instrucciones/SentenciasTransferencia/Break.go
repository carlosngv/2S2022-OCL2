package SentenciasTransferencia

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
)

type Break struct {
	Tipo   entorno.TipoDato
	Salida interfaces.Expresion
}


func NewBreak(tipo entorno.TipoDato, salida interfaces.Expresion) Break {

	if salida != nil {
		return Break{
			Tipo:   tipo,
			Salida: salida,
		}
	}

	return Break{
		Tipo:   tipo,
		Salida: nil,
	}
}
