package SentenciasTransferencia

import (
	"p1/packages/Analizador/entorno"
)

type Continue struct {
	Tipo   entorno.TipoDato
}


func NewContinue(tipo entorno.TipoDato) Continue {

	return Continue{
		Tipo:   tipo,
	}
}
