package funcionesNativas

import (
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
)

type  ValorClone struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorClone(id string, linea int, columna int) *ValorClone {
	return &ValorClone{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

func (v ValorClone) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {
	if !ent.ExisteSimbolo(v.ID) {
		nuevoError := Analizador.NewErrorSemantico(
			v.Linea,
			v.Columna,
			"Error Semántico, la variable " + v.ID + " no se encuentra definida.",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return entorno.TipoRetorno{ Tipo: entorno.NULL, Valor: nil}
	}


	simbolo := ent.ObtenerSimbolo(v.ID).(entorno.Simbolo)

	if simbolo.Tipo != entorno.NULL {
		return entorno.TipoRetorno {
			Tipo: simbolo.Tipo,
			Valor: simbolo.Valor,
		}
	} else {
		nuevoError := Analizador.NewErrorSemantico(
			v.Linea,
			v.Columna,
			"Error Semántico, no se puede clonar el valor de " + v.ID + ".",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return entorno.TipoRetorno{ Tipo: entorno.NULL, Valor: nil}
	}

}
