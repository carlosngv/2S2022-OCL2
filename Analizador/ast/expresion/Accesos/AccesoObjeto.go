package Accesos

import (
	arrayList "github.com/colegno/arraylist"
)

type AccesoObjeto struct {
	ListaAccesos *arrayList.List
}

func NewAccesoObjeto(listaAccesos *arrayList.List) AccesoObjeto {
	return AccesoObjeto{ListaAccesos: listaAccesos}
}
