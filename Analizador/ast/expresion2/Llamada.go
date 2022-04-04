package expresion2

import (
	arrayList "github.com/colegno/arraylist"
)

type Llamada struct {
	IdFuncion        string
	ListaExpresiones *arrayList.List
}

func NuevaLlamada(idFuncion string, ListaExpresiones *arrayList.List) Llamada {
	return Llamada{IdFuncion: idFuncion, ListaExpresiones: ListaExpresiones}
}
