package expresion

import (
	"p1/packages/Analizador/entorno"
	"reflect"
)

type Identificador struct {
	Identificador string
}

func NuevoIdentificador(identificador string) Identificador {
	return Identificador{Identificador: identificador}
}

func (ide Identificador) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	var encontrado bool = ent.ExisteSimbolo(ide.Identificador)

	if encontrado == false {
		return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
	}

	simbo := ent.ObtenerSimbolo(ide.Identificador)

	if (reflect.TypeOf(simbo) == reflect.TypeOf(entorno.Simbolo{})) {
		dato := simbo.(entorno.Simbolo)
		return entorno.TipoRetorno{Valor: dato.Valor, Tipo: dato.Tipo}
	}

	return entorno.TipoRetorno{Valor: -1, Tipo: entorno.NULL}

}

func (ide Identificador) ObtenerReferencia(ent entorno.Entorno) entorno.TipoRetorno {

	var encontrado bool = ent.ExisteSimbolo(ide.Identificador)

	if !encontrado {
		return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
	}

	simbo := ent.ObtenerSimboloRef(ide.Identificador)

	if simbo == nil {
		return entorno.TipoRetorno{Valor: -1, Tipo: entorno.NULL}
	}

	return entorno.TipoRetorno{Valor: simbo, Tipo: entorno.NULL}

}
