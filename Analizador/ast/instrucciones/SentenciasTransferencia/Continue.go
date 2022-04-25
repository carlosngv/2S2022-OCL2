package SentenciasTransferencia

import (
	"p1/packages/Analizador"
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

func (cont Continue) Get3D(ent *entorno.Entorno) string {
	// ? En un loop este será sustituido con la etiqueta de inicio del loop
	codigo := "#CONTINUE"
	return Analizador.GeneradorGlobal.Tabular(codigo)
}
