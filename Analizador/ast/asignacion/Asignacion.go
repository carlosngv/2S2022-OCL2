package asignacion

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"reflect"
)

type Asignacion struct {
	ID           	string
	NuevoValor 		interfaces.Expresion
	Valor 			interface{} //asignacion con un valor objeto pasado desde alguna instruccion
	Linea			int
	Columna			int

}

func NuevaAsignacion(id string, nuevoValor interfaces.Expresion, linea int, columna int ) *Asignacion{
	return &Asignacion{
		ID:				id,
		NuevoValor:		nuevoValor,
		Valor:			nil,
		Linea:			linea,
		Columna:		columna,
	}
}

func NuevaAsignacionValor(id string, valor interface{} ) *Asignacion{
	return &Asignacion{
		ID:				id,
		NuevoValor:		nil,
		Valor:			valor,
		Linea:			0,
		Columna:		0,
	}
}

func (asignacion *Asignacion) Ejecutar(ent entorno.Entorno) interface{} {

	// Validar existencia de simbolo
	if !ent.ExisteSimbolo(asignacion.ID) {
		fmt.Println("Error Semántico, el identificador" + asignacion.ID + " no está definido.")
		nuevoError := Analizador.NewErrorSemantico(
			asignacion.Linea,
			asignacion.Columna,
			"Error Semántico, el identificador" + asignacion.ID + " no está definido.",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return nil
	}

	simbolo := ent.ObtenerSimbolo(asignacion.ID)

	// Validar si es tipo Simbolo
	if reflect.TypeOf(simbolo) == reflect.TypeOf(entorno.Simbolo{}) {

		simboloPrimitivo := simbolo.(entorno.Simbolo)
		fmt.Printf("\nSimbolo primitivo: %v\n", simboloPrimitivo)

		var valorAsignacion entorno.TipoRetorno

		if !simboloPrimitivo.EsMutable {
			fmt.Println("Error Semántico, la variable " + asignacion.ID + " no es mutable.")
			nuevoError := Analizador.NewErrorSemantico(
				asignacion.Linea,
				asignacion.Columna,
				"Error Semántico, la variable " + asignacion.ID + " no es mutable.",
			)
			Analizador.ListaErrores.Add(nuevoError)
			return nil
		}


		if asignacion.NuevoValor != nil {
			valorAsignacion = asignacion.NuevoValor.ObtenerValor(ent)
		} else {
			valorAsignacion.Valor = asignacion.Valor
		}

		if simboloPrimitivo.EsReferencia && asignacion.NuevoValor != nil { // Es referencia y trae NuevoValor

			if valorAsignacion.Tipo != simboloPrimitivo.Tipo {
				fmt.Println("Error Semántico, el tipo del nuevo valor de " + asignacion.ID + " no coincide.")
				nuevoError := Analizador.NewErrorSemantico(
					asignacion.Linea,
					asignacion.Columna,
					"Error Semántico, el tipo del nuevo valor de " + asignacion.ID + " no coincide.",
				)
				Analizador.ListaErrores.Add(nuevoError)
				return nil
			}

			simboloPrimitivo.Valor = valorAsignacion.Valor
			ent.CambiarValor(simboloPrimitivo.Identificador, simboloPrimitivo)

			valRef := NewValorRefEjecutar(simboloPrimitivo.Referencia)
			valRef.Ejecutar(ent, valorAsignacion.Valor)

		} else if simboloPrimitivo.EsReferencia && asignacion.NuevoValor == nil { // Es referencia y no trae NuevoValor

			simboloPrimitivo.Valor = valorAsignacion.Valor
			ent.CambiarValor(simboloPrimitivo.Identificador, simboloPrimitivo)

			valRef := NewValorRefEjecutar(simboloPrimitivo.Referencia)
			valRef.Ejecutar(ent, valorAsignacion.Valor)

		} else if !simboloPrimitivo.EsReferencia && asignacion.NuevoValor != nil { // No es referencia y trae NuevoValor

			if valorAsignacion.Tipo != simboloPrimitivo.Tipo {
				fmt.Println("Error Semántico, el tipo del nuevo valor de " + asignacion.ID + " no coincide.")
				nuevoError := Analizador.NewErrorSemantico(
					asignacion.Linea,
					asignacion.Columna,
					"Error Semántico, el tipo del nuevo valor de " + asignacion.ID + " no coincide.",
				)
				Analizador.ListaErrores.Add(nuevoError)
				return nil
			}

			simboloPrimitivo.Valor = valorAsignacion.Valor
			ent.CambiarValor(simboloPrimitivo.Identificador, simboloPrimitivo)

		} else if !simboloPrimitivo.EsReferencia && asignacion.NuevoValor == nil { // No es referencia y no trae NuevoValor

			simboloPrimitivo.Valor = valorAsignacion.Valor
			ent.CambiarValor(simboloPrimitivo.Identificador, simboloPrimitivo)
		}

	}

	return nil


}
