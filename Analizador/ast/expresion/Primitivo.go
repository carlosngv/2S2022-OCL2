package expresion

import "p1/packages/Analizador/entorno"

type Primitivo struct {
	Valor interface{}
	Tipo entorno.TipoDato
}

func (p Primitivo) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {
	return entorno.TipoRetorno {
		Valor: p.Valor,
		Tipo: p.Tipo,
	}
}

func NuevoPrimitivo(val interface{}, tipo entorno.TipoDato) Primitivo {
	nuevoPrimitivo := Primitivo{val, tipo}
	return nuevoPrimitivo
}
