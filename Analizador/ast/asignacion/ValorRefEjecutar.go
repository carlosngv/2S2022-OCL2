package asignacion

import (
	"fmt"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/ast/expresion/Accesos"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Referencia"
	"reflect"
)

type ValorRefEjecutar struct {
	referencia interface{}
}

func NewValorRefEjecutar(referencia interface{}) ValorRefEjecutar {
	return ValorRefEjecutar{referencia: referencia}
}

func (v ValorRefEjecutar) Ejecutar(ent entorno.Entorno, valor interface{}) interface{} {

	valorRef := v.referencia.(Referencia.ValorRef)

	// un identificador puede ser referencia de un simbolo primitivo, objeto o arreglo

	if reflect.TypeOf(valorRef.ID) == reflect.TypeOf(expresion.Identificador{}) {

		asignacion := NuevaAsignacionValor(valorRef.ID.(expresion.Identificador).Identificador, valor)
		asignacion.Ejecutar(*valorRef.Entorno)

	} else if reflect.TypeOf(valorRef.ID) == reflect.TypeOf(Accesos.AccesoObjeto{}) {

		lista := valorRef.ID.(Accesos.AccesoObjeto)

		asignaObjeto := NewAsignacionObjetoValor(lista.ListaAccesos, valor)
		asignaObjeto.Ejecutar(*valorRef.Entorno)
	}

	fmt.Printf("%v", valorRef)

	return nil
}
