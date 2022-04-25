package interfaces

import "p1/packages/Analizador/entorno"



type Expresion interface {
	Obtener3D(ent *entorno.Entorno) entorno.Result3D	// Se encarga de obtener el valor
	Obtener3DRef(ent *entorno.Entorno) entorno.Result3D // Se encarga de obtener la posición, no el valor
}

type Instruccion interface {
	Get3D(ent *entorno.Entorno) string
}
