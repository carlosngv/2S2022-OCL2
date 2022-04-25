package SentenciasTransferencia

import (
	"p1/packages/Analizador"
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

func (br Break) Get3D(ent *entorno.Entorno) string {
	// ? Este será sustituido con la etiqueta de salida del loop actual

	codigo := "#BREAK"

	return Analizador.GeneradorGlobal.Tabular(codigo)
}
