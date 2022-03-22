package funcionesNativas

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"strconv"
)

type  ValorStr struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorStr(id string, linea int, columna int) *ValorStr {
	return &ValorStr{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

func (v ValorStr) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {
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
	tipoDato = entorno.STRING
	if simbolo.Tipo == entorno.INTEGER {
		str := strconv.Itoa(simbolo.Valor.(int))
		return entorno.TipoRetorno {
			Valor: str,
			Tipo: tipoDato,
		}
	} else if simbolo.Tipo == entorno.FLOAT {
		str := fmt.Sprintf("%f", simbolo.Valor)
		return entorno.TipoRetorno {
			Valor: str,
			Tipo: tipoDato,
		}
	} else if simbolo.Tipo == entorno.BOOLEAN {
		str := strconv.FormatBool(simbolo.Valor.(bool))
		return entorno.TipoRetorno {
			Valor: str,
			Tipo: tipoDato,
		}
	} else {
		nuevoError := Analizador.NewErrorSemantico(
			v.Linea,
			v.Columna,
			"Error Semántico, no se puede volver string el valor de " + v.ID + ".",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return entorno.TipoRetorno{ Tipo: entorno.NULL, Valor: nil}
	}

}
