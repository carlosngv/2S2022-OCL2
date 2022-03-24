package Analizador

import "p1/packages/Analizador/entorno"

var Salida string

type TablaSimbolos struct {
	ID string
	TipoSimbolo string
	TipoDato entorno.TipoDato
	Ambito string
	Fila	int
	Columna	 int
}

var ListaTablaSimbolos []TablaSimbolos
