package expresion

import (
	"p1/packages/Analizador/entorno"
)

type Identificador struct {
	Identificador string
}

func NuevoIdentificador(identificador string) Identificador {
	return Identificador{Identificador: identificador}
}

func (ide Identificador) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	var encontrado bool = ent.ExisteSimbolo(ide.Identificador)

	if !encontrado {
		// TODO: ALMACENAR ERROR SINTACTICO
		return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
	}

	simbo := ent.ObtenerSimbolo(ide.Identificador)

	return entorno.TipoRetorno{Valor: simbo.Valor, Tipo: simbo.Tipo}

}
