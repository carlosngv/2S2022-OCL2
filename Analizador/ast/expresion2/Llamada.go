package expresion2

import (
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Llamada struct {
	IdFuncion        string
	ListaExpresiones *arrayList.List
}

func NuevaLlamada(idFuncion string, ListaExpresiones *arrayList.List) Llamada {
	return Llamada{IdFuncion: idFuncion, ListaExpresiones: ListaExpresiones}
}

func (l Llamada) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	hayRuncion := ent.ExisteFuncion(l.IdFuncion)

	if !hayRuncion {
		return entorno.TipoRetorno{Valor: -1, Tipo: entorno.NULL}
	}

	entFunc := entorno.NewEntorno("Funcion", &ent)

	funcion := ent.ObtenerFuncion(l.IdFuncion).(Simbolos.Funcion)
	clonFunc := Simbolos.NuevoFuncion(funcion.Identificador, funcion.ListaParamsDecl.Clone(), funcion.ListaInstrucciones.Clone(), funcion.Tipo)

	completo := clonFunc.EjecutarParametros(entFunc, l.ListaExpresiones)

	if !completo {
		return entorno.TipoRetorno{Valor: -1, Tipo: entorno.NULL}
	}

	val := clonFunc.Ejecutar(entFunc)

	if (reflect.TypeOf(val) != reflect.TypeOf(entorno.TipoRetorno{})) {
		return entorno.TipoRetorno{ Valor: -1, Tipo: entorno.NULL }
	}

	return val.(entorno.TipoRetorno)
}

func (l Llamada) Ejecutar(ent entorno.Entorno) interface{} {

	l.ObtenerValor(ent)

	return nil
}
