package expresion2

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"reflect"
)

type InstanciaObjeto struct {
	Id string
}

func NewInstanciaObjeto(id string) InstanciaObjeto {
	return InstanciaObjeto{Id: id}
}

func (i InstanciaObjeto) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	existeClase := ent.ExisteClase(i.Id)

	if !existeClase {
		return entorno.TipoRetorno{Valor: nil, Tipo: entorno.NULL}
	}

	clasePlantilla := ent.ObtenerClase(i.Id).(*entorno.Clase)

	ENTORNO_OBJETO := entorno.NewEntorno("OBJETO", nil)

	for i := 0; i < clasePlantilla.Instrucciones.Len(); i++ {

		pivoteInstr := clasePlantilla.Instrucciones.GetValue(i)

		if reflect.TypeOf(pivoteInstr) == reflect.TypeOf(Simbolos.Funcion{}) {
			// FUNCIONES
			func_ := pivoteInstr.(Simbolos.Funcion)

			if !ENTORNO_OBJETO.ExisteFuncion(func_.Identificador) {
				ENTORNO_OBJETO.AgregarFuncion(func_.Identificador, func_)
			}

		} else {
			// DECLARACIONE

			//pivoteInstr.(definicion.Declaracion).ValorObjeto = ?
			pivoteInstr.(interfaces.Instruccion).Ejecutar(ENTORNO_OBJETO)
		}

	}

	OBJETO_SIMBOLO := Simbolos.NewObjecto("", ENTORNO_OBJETO, i.Id)

	return entorno.TipoRetorno{Valor: OBJETO_SIMBOLO, Tipo: entorno.OBJETO}
}
