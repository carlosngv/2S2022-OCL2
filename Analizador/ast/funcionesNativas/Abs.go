package funcionesNativas

import (
	"fmt"
	"math"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"strconv"
)

type  ValorAbs struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorAbs(id string, linea int, columna int) *ValorAbs {
	return &ValorAbs{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

func (v ValorAbs) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {
	if !ent.ExisteSimbolo(v.ID) {
		nuevoError := Analizador.NewErrorSemantico(
			v.Linea,
			v.Columna,
			"Error Semántico, la variable " + v.ID + " no se encuentra definida.",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return entorno.TipoRetorno{ Tipo: entorno.NULL, Valor: nil}
	}

	var tipoDato entorno.TipoDato


	simbolo := ent.ObtenerSimbolo(v.ID).(entorno.Simbolo)

	if simbolo.Tipo == entorno.INTEGER {
		tipoDato = entorno.INTEGER
		val, _ := strconv.ParseFloat(fmt.Sprintf("%v", simbolo.Valor.(int)), 64)
		valorAbs := math.Abs(val)
		return entorno.TipoRetorno {
			Valor: int(valorAbs),
			Tipo: tipoDato,
		}
	} else if simbolo.Tipo == entorno.FLOAT {
		tipoDato = entorno.FLOAT
		valorAbs := math.Abs(simbolo.Valor.(float64))
		return entorno.TipoRetorno {
			Valor: valorAbs,
			Tipo: tipoDato,
		}
	} else {
		nuevoError := Analizador.NewErrorSemantico(
			v.Linea,
			v.Columna,
			"Error Semántico, no se puede obtener el valor absoluto de " + v.ID + ".",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return entorno.TipoRetorno{ Tipo: entorno.NULL, Valor: nil}
	}

}
