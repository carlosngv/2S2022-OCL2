package instrucciones

import (
	"fmt"
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
	fmt.Printf("\nVALOR: %v", retornoExpr)
	conSalto := fmt.Sprintf("%v", retornoExpr.Valor)
	conSalto = conSalto + "\n"
	analizador.Salida += ">> " + conSalto

	return nil
}
