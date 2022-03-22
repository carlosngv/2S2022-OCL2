package SentenciaTransferencia

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

func (c Continue) Ejecutar(ent entorno.Entorno) interface{} {

	if c.Tipo == entorno.VOID {
		return entorno.TipoRetorno{Tipo: entorno.VOID, Valor: 0}
	}

	return c

}
