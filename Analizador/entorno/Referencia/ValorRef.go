package Referencia

import (
	"p1/packages/Analizador/entorno"
)

type ValorRef struct {
	Entorno *entorno.Entorno
	ID      interface{}
}
