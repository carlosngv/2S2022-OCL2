package Accesos

import (
	arrayList "github.com/colegno/arraylist"
)

type AccessoArr struct {
	Identificador string
	Dimensiones   *arrayList.List
}

func NewAccessoArr(identificador string, dimensiones *arrayList.List) AccessoArr {
	return AccessoArr{Identificador: identificador, Dimensiones: dimensiones}
}
