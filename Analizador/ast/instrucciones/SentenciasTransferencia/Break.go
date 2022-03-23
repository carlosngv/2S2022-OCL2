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

func (b Break) Ejecutar(ent entorno.Entorno) interface{} {

	if b.Tipo == entorno.VOID {
		return entorno.TipoRetorno{Tipo: entorno.VOID, Valor: 0}
	}

	breakExpresion := b.Salida.ObtenerValor(ent)

	return breakExpresion

}
