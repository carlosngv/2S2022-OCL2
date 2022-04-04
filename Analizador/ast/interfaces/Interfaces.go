package interfaces

import "p1/packages/Analizador/entorno"



type Expresion interface {
	Obtener3D(ent *entorno.Entorno) entorno.Result3D
}

type Instruccion interface {
	Get3D(ent *entorno.Entorno) string
}
