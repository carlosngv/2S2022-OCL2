package expresion

import (
	"fmt"
	"p1/packages/Analizador"
	interfaces "p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"reflect"
)

var suma_dominante = [5][5]entorno.TipoDato{
	{entorno.INTEGER, entorno.FLOAT, entorno.STRING, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.STRING, entorno.NULL, entorno.NULL},
	{entorno.STRING, entorno.STRING, entorno.STRING, entorno.STRING, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.STRING, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
}

var multi_division_dominante = [5][5]entorno.TipoDato{
	{entorno.INTEGER, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
}
var resta_dominante = [5][5]entorno.TipoDato{
	{entorno.INTEGER, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
}

var relacional_dominante = [5][5]entorno.TipoDato{
	{entorno.INTEGER, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
}


type Operacion struct {
	Op1      interfaces.Expresion
	Operador string
	Op2      interfaces.Expresion
	Unario   bool
	TipoPow  entorno.TipoDato
	EtiquetaF     string
	EtiquetaV string
}

func NuevaOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool, tipoPow entorno.TipoDato) Operacion {

	e := Operacion{Op1, Operador, Op2, unario, tipoPow, "", ""}

	return e
}

func (op Operacion) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	switch op.Operador {

	case "+":
		return op.SUMA(op.Op1, op.Op2, ent)
	case "-":

		if op.Unario {
			return op.RESTA_UNARIA(op.Op1, ent)
		}

		return op.RESTA(op.Op1, op.Op2, ent)

	case "!=":
	case ">=":
	case "<=":
	case "==":
	case ">":
		return op.RELACIONAL(op.Op1, op.Op2, ent, op.Operador)
	case "<":
		return op.RELACIONAL(op.Op1, op.Op2, ent, op.Operador)
	}

	return entorno.Result3D{}
}

func (op Operacion) LOGICA_AND(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {
	/*
	 * if ( x < 100 || x > 200 && x != y ) x = 0;
	 *
	 *          if x < 100  goto L2
	 *          goto L3
	 *  L3:     if x > 200  goto L4
	 *          goto L1
	 *  L4:     if x!= y    goto L2
	 *          goto L1
	 *  L2:     x=0
	 *  L1:
	 *
	 */

	if reflect.TypeOf(Izq) == reflect.TypeOf(Operacion{}) {
		opIzq := Izq.(Operacion)
		opIzq.EtiquetaV = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		opIzq.EtiquetaF = op.EtiquetaF
	}

	resultadoIzq := Izq.Obtener3D(ent)

	if reflect.TypeOf(Der) == reflect.TypeOf(Operacion{}) {
		opDer := Der.(Operacion)
		opDer.EtiquetaV = op.EtiquetaV
		opDer.EtiquetaF = op.EtiquetaF
	}

	resultadoDer := Der.Obtener3D(ent)

	if resultadoDer.Tipo != entorno.BOOLEAN && resultadoIzq.Tipo != entorno.BOOLEAN {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}

	if resultadoIzq.Temporal == "0" || resultadoIzq.Temporal == "1" {

		EtiquetaV := Analizador.GeneradorGlobal.ObtenerEtiqueta()
		etiquetaF := op.EtiquetaF

		if op.EtiquetaF == "" {
			etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoIzq.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoIzq.Temporal, EtiquetaV)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaF)

		RESULTADO_FINAL.EtiquetaF = etiquetaF
		RESULTADO_FINAL.EtiquetaV = EtiquetaV

	} else {
		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo
	}

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s: \n", resultadoIzq.EtiquetaV)

	if resultadoDer.Temporal == "0" || resultadoDer.Temporal == "1" {

		EtiquetaV := Analizador.GeneradorGlobal.ObtenerEtiqueta()
		etiquetaF := op.EtiquetaF

		if op.EtiquetaF == "" {
			etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoDer.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoDer.Temporal, EtiquetaV)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaF)

		RESULTADO_FINAL.EtiquetaF = resultadoIzq.EtiquetaF
		RESULTADO_FINAL.EtiquetaV = EtiquetaV

	} else {
		RESULTADO_FINAL.Codigo = resultadoDer.Codigo
	}

	RESULTADO_FINAL.EtiquetaV = resultadoDer.EtiquetaV
	RESULTADO_FINAL.EtiquetaF = resultadoDer.EtiquetaF
	RESULTADO_FINAL.Tipo = entorno.BOOLEAN

	return RESULTADO_FINAL

}

func (op Operacion) LOGICA_OR(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {
	/*
	 * if ( x < 100 || x > 200 && x != y ) x = 0;
	 *
	 *          if x < 100  goto L2
	 *          goto L3
	 *  L3:     if x > 200  goto L4
	 *          goto L1
	 *  L4:     if x!= y    goto L2
	 *          goto L1
	 *  L2:     x=0
	 *  L1:
	 *
	 */

	if reflect.TypeOf(Izq) == reflect.TypeOf(Operacion{}) {
		opIzq := Izq.(Operacion)
		opIzq.EtiquetaV = op.EtiquetaV
		opIzq.EtiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	}

	resultadoIzq := Izq.Obtener3D(ent)

	if reflect.TypeOf(Der) == reflect.TypeOf(Operacion{}) {
		opDer := Der.(Operacion)
		opDer.EtiquetaV = op.EtiquetaV
		opDer.EtiquetaF = op.EtiquetaF
	}

	resultadoDer := Der.Obtener3D(ent)

	if resultadoDer.Tipo != entorno.BOOLEAN && resultadoIzq.Tipo != entorno.BOOLEAN {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}

	if resultadoIzq.Temporal == "0" || resultadoIzq.Temporal == "1" {

		EtiquetaV := op.EtiquetaV
		etiquetaF := Analizador.GeneradorGlobal.ObtenerEtiqueta()

		if op.EtiquetaF == "" {
			etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoIzq.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoIzq.Temporal, EtiquetaV)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaF)

		RESULTADO_FINAL.EtiquetaF = etiquetaF
		RESULTADO_FINAL.EtiquetaV = EtiquetaV

	} else {
		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo
	}

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s: \n", resultadoIzq.EtiquetaF)

	if resultadoDer.Temporal == "0" || resultadoDer.Temporal == "1" {

		EtiquetaV := op.EtiquetaV
		etiquetaF := op.EtiquetaF

		if op.EtiquetaF == "" {
			etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoDer.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoDer.Temporal, EtiquetaV)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaF)

		RESULTADO_FINAL.EtiquetaF = etiquetaF
		RESULTADO_FINAL.EtiquetaV = EtiquetaV

	} else {
		RESULTADO_FINAL.Codigo = resultadoDer.Codigo
	}

	RESULTADO_FINAL.EtiquetaV = resultadoDer.EtiquetaV
	RESULTADO_FINAL.EtiquetaF = resultadoDer.EtiquetaF
	RESULTADO_FINAL.Tipo = entorno.BOOLEAN

	return RESULTADO_FINAL

}

func (op Operacion) RESTA_UNARIA(operando interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoOperando := operando.Obtener3D(ent)

	if resultadoOperando.Tipo != entorno.INTEGER || resultadoOperando.Tipo != entorno.FLOAT {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}
	RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
	RESULTADO_FINAL.Tipo = resultadoOperando.Tipo

	RESULTADO_FINAL.Codigo += resultadoOperando.Codigo
	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = 0 - %s", RESULTADO_FINAL.Temporal, resultadoOperando.Temporal)

	return RESULTADO_FINAL

}

func (op Operacion) RESTA(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoIzq := Izq.Obtener3D(ent)

	resultadoDer := Der.Obtener3D(ent)

	tipoDominante := resta_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	if tipoDominante == entorno.NULL {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}
	RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
	RESULTADO_FINAL.Tipo = tipoDominante

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s - %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	return RESULTADO_FINAL

}

func (op Operacion) SUMA(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoIzq := Izq.Obtener3D(ent)

	resultadoDer := Der.Obtener3D(ent)

	RESULTADO_FINAL := entorno.Result3D{}

	tipoDiminante := suma_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	if tipoDiminante == entorno.INTEGER {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s + %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDiminante == entorno.FLOAT {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s + %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDiminante == entorno.STRING {

		RESULTADO_FINAL.Codigo += resultadoIzq.Codigo
		RESULTADO_FINAL.Codigo += resultadoDer.Codigo + "\n"

		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.STRING

		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = HP; /* nueva posicion de string */ \n", RESULTADO_FINAL.Temporal)

		codigo1 := ""
		if resultadoIzq.Tipo != entorno.STRING {
			codigo1 += fmt.Sprintf("Heap[HP] = -1; \n")
			codigo1 += fmt.Sprintf("HP = HP + 1;\n")
			codigo1 += fmt.Sprintf("Heap[HP] = %s; \n", resultadoIzq.Temporal)
			codigo1 += fmt.Sprintf("HP = HP + 1;\n")
		} else {

			codigo1 = op.SumarCadena(resultadoIzq)
		}

		codigo2 := ""
		if resultadoDer.Tipo != entorno.STRING {
			codigo2 += fmt.Sprintf("Heap[HP] = -1; \n")
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
			codigo2 += fmt.Sprintf("Heap[HP] = %s; \n", resultadoDer.Temporal)
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
		} else {

			codigo2 = op.SumarCadena(resultadoDer)
		}

		RESULTADO_FINAL.Codigo += codigo1
		RESULTADO_FINAL.Codigo += codigo2

		RESULTADO_FINAL.Codigo += fmt.Sprintf("Heap[HP] = 0; /* caracter de escape */ \n")
		RESULTADO_FINAL.Codigo += fmt.Sprintf("HP = HP + 1; ")

	}

	return RESULTADO_FINAL
}

func (op Operacion) RELACIONAL(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno, relacion string) entorno.Result3D {

	/*
	 * if a < b goto B.true
	 * goto B.false
	 *
	 */

	RESULTADO_FINAL := entorno.Result3D{}
	resultadoIzq := Izq.Obtener3D(ent)
	resultadoDer := Der.Obtener3D(ent)

	/* Prueba para ver si los datos son numeros, no se suman, solo es prueba*/

	dominante := suma_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	// RELACIONAL ENTRE NUMEROS
	if dominante != entorno.NULL {

	} else if resultadoIzq.Tipo == entorno.BOOLEAN && resultadoDer.Tipo == entorno.BOOLEAN &&
		(relacion == "!=" || relacion == "==") {

	} else {
		return entorno.Result3D{}
	}

	EtiquetaV := op.EtiquetaV
	etiquetaF := op.EtiquetaV

	if op.EtiquetaV == "" {
		EtiquetaV = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	}

	if op.EtiquetaF == "" {
		etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	}

	RESULTADO_FINAL.Codigo += fmt.Sprintf("if ( %s %s %s ) goto %s; \n", resultadoIzq.Temporal, relacion, resultadoDer.Temporal, EtiquetaV)
	RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaF)

	RESULTADO_FINAL.EtiquetaV = EtiquetaV
	RESULTADO_FINAL.EtiquetaF = etiquetaF
	RESULTADO_FINAL.Tipo = entorno.BOOLEAN

	return RESULTADO_FINAL

}

func (op Operacion) SumarCadena(exprResultado entorno.Result3D) string {

	CODIGO_SALIDA := ""

	etiquetaCiclo := Analizador.GeneradorGlobal.ObtenerEtiqueta()
	etiquetaSalida := Analizador.GeneradorGlobal.ObtenerEtiqueta()
	CARACTER := Analizador.GeneradorGlobal.ObtenerTemporal()

	CODIGO_SALIDA += fmt.Sprintf("%v:/*Etiqueta para ciclado de copia */\n\n", etiquetaCiclo)
	CODIGO_SALIDA += fmt.Sprintf("	%s = Heap[(int)%s]; /*Tomando un caracter*/\n", CARACTER, exprResultado.Temporal)

	CODIGO_SALIDA += fmt.Sprintf("	if( %s == 0) goto %s; /* Caracter de escape, saltar a salida*/ \n", CARACTER, etiquetaSalida)
	CODIGO_SALIDA += fmt.Sprintf("		Heap[HP] = %s; /*Copiando caracter */ \n", CARACTER)
	CODIGO_SALIDA += fmt.Sprintf("		HP = HP + 1; \n")
	CODIGO_SALIDA += fmt.Sprintf("		%s = %s + 1; \n", exprResultado.Temporal, exprResultado.Temporal)
	CODIGO_SALIDA += fmt.Sprintf("		goto %s; \n", etiquetaCiclo)

	CODIGO_SALIDA += fmt.Sprintf("%s: /*Etiqueta de salida*/ \n", etiquetaSalida)

	return CODIGO_SALIDA

}
