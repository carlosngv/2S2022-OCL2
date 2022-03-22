package instrucciones

import (
	"fmt"
	"p1/packages/Analizador"
	analizador "p1/packages/Analizador"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
)

type Imprimir struct {
	Expresiones interfaces.Expresion
}

func NuevoImprimir(val interfaces.Expresion) Imprimir {
	e := Imprimir{val}
	return e
}

func (p Imprimir) Ejecutar(ent entorno.Entorno) interface{} {

	retornoExpr := p.Expresiones.ObtenerValor(ent)


	/*
		Validación &str
		No imprime expresiones de tipo &str, se espera imprimir los otros tipos.
	*/
	if retornoExpr.Tipo == entorno.STRING2 {
		nuevoError := Analizador.NewErrorSemantico(
			3,
			14,
			"Error Semántico, el valor de tipo &str no puede imprimirse. Se sugiere utilizar la función nativa to_string()",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return  nil
	}


	conSalto := fmt.Sprintf("%v", retornoExpr.Valor)
	conSalto = conSalto + "\n"
	analizador.Salida += ">> " + conSalto

	return nil
}
