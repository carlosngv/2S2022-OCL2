package interfaces

import "p1/packages/Analizador/entorno"

type Expresion interface{
	ObtenerValor(entorno entorno.Entorno) entorno.TipoRetorno
}

type Instruccion interface{
	Ejecutar(entorno entorno.Entorno) interface{}
}
