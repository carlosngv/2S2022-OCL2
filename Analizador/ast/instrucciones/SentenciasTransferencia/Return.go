package SentenciaTransferencia

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

func (r Return) Ejecutar(ent entorno.Entorno) interface{} {

	if r.Tipo == entorno.VOID {
		return entorno.TipoRetorno{Tipo: entorno.VOID, Valor: 0}
	}

	retExpresion := r.Salida.ObtenerValor(ent)

	return retExpresion

}
