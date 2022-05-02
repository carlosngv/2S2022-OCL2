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
	EtiquetaFalsa     string
	EtiquetaVerdadera string
}

func NewOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool, tipoPow entorno.TipoDato) Operacion {

	e := Operacion{Op1, Operador, Op2, unario, tipoPow, "", ""}

	return e
}

func (this Operacion) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	switch this.Operador {

	case "+":
		return this.SUMA(this.Op1, this.Op2, ent)
	case "-":

		if this.Unario {
			return this.RESTA_UNARIA(this.Op1, ent)
		}

		return this.RESTA(this.Op1, this.Op2, ent)
	case "*":
		return this.MULTIPLICACION(this.Op1, this.Op2, ent)
	case "/":
		return this.DIVISION(this.Op1, this.Op2, ent)
	case ">":
		return this.RELACIONAL(this.Op1, this.Op2, ent, this.Operador)
	case "<":
		return this.RELACIONAL(this.Op1, this.Op2, ent, this.Operador)
	case "!=":
		return this.RELACIONAL(this.Op1, this.Op2, ent, this.Operador)
	case ">=":
		return this.RELACIONAL(this.Op1, this.Op2, ent, this.Operador)
	case "<=":
		return this.RELACIONAL(this.Op1, this.Op2, ent, this.Operador)
	case "==":
		return this.RELACIONAL(this.Op1, this.Op2, ent, this.Operador)
	case "&&":
		return this.LOGICA_AND(this.Op1, this.Op2, ent)
	case "||":
		return this.LOGICA_OR(this.Op1, this.Op2, ent)

	}

	return entorno.Result3D{}
}

func (this Operacion) LOGICA_AND(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {
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
		opIzq.EtiquetaVerdadera = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		opIzq.EtiquetaFalsa = this.EtiquetaFalsa
	}

	resultadoIzq := Izq.Obtener3D(ent)

	if reflect.TypeOf(Der) == reflect.TypeOf(Operacion{}) {
		opDer := Der.(Operacion)
		opDer.EtiquetaVerdadera = this.EtiquetaVerdadera
		opDer.EtiquetaFalsa = this.EtiquetaFalsa
	}

	resultadoDer := Der.Obtener3D(ent)

	if resultadoDer.Tipo != entorno.BOOLEAN && resultadoIzq.Tipo != entorno.BOOLEAN {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}

	if resultadoIzq.Temporal == "0" || resultadoIzq.Temporal == "1" {

		etiquetaVerdadera := Analizador.GeneradorGlobal.ObtenerEtiqueta()
		etiquetaFalsa := this.EtiquetaFalsa

		if this.EtiquetaFalsa == "" {
			etiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoIzq.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoIzq.Temporal, etiquetaVerdadera)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaFalsa)

		RESULTADO_FINAL.EtiquetaF = etiquetaFalsa
		RESULTADO_FINAL.EtiquetaV = etiquetaVerdadera

	} else {
		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo
	}

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s: \n", resultadoIzq.EtiquetaV)

	if resultadoDer.Temporal == "0" || resultadoDer.Temporal == "1" {

		etiquetaVerdadera := Analizador.GeneradorGlobal.ObtenerEtiqueta()
		etiquetaFalsa := this.EtiquetaFalsa

		if this.EtiquetaFalsa == "" {
			etiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoDer.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoDer.Temporal, etiquetaVerdadera)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaFalsa)

		RESULTADO_FINAL.EtiquetaF = resultadoIzq.EtiquetaF
		RESULTADO_FINAL.EtiquetaV = etiquetaVerdadera

	} else {
		RESULTADO_FINAL.Codigo = resultadoDer.Codigo
	}

	RESULTADO_FINAL.EtiquetaV = resultadoDer.EtiquetaV
	RESULTADO_FINAL.EtiquetaF = resultadoDer.EtiquetaF
	RESULTADO_FINAL.Tipo = entorno.BOOLEAN

	return RESULTADO_FINAL

}

func (this Operacion) LOGICA_OR(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {
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
		opIzq.EtiquetaVerdadera = this.EtiquetaVerdadera
		opIzq.EtiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	}

	resultadoIzq := Izq.Obtener3D(ent)

	if reflect.TypeOf(Der) == reflect.TypeOf(Operacion{}) {
		opDer := Der.(Operacion)
		opDer.EtiquetaVerdadera = this.EtiquetaVerdadera
		opDer.EtiquetaFalsa = this.EtiquetaFalsa
	}

	resultadoDer := Der.Obtener3D(ent)

	if resultadoDer.Tipo != entorno.BOOLEAN && resultadoIzq.Tipo != entorno.BOOLEAN {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}

	if resultadoIzq.Temporal == "0" || resultadoIzq.Temporal == "1" {

		etiquetaVerdadera := this.EtiquetaVerdadera
		etiquetaFalsa := Analizador.GeneradorGlobal.ObtenerEtiqueta()

		if this.EtiquetaFalsa == "" {
			etiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoIzq.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoIzq.Temporal, etiquetaVerdadera)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaFalsa)

		RESULTADO_FINAL.EtiquetaF = etiquetaFalsa
		RESULTADO_FINAL.EtiquetaV = etiquetaVerdadera

	} else {
		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo
	}

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s: \n", resultadoIzq.EtiquetaF)

	if resultadoDer.Temporal == "0" || resultadoDer.Temporal == "1" {

		etiquetaVerdadera := this.EtiquetaVerdadera
		etiquetaFalsa := this.EtiquetaFalsa

		if this.EtiquetaFalsa == "" {
			etiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		}

		RESULTADO_FINAL.Codigo += resultadoDer.Codigo
		RESULTADO_FINAL.Codigo += fmt.Sprintf("if (%s == 1 ) goto %s;\n", resultadoDer.Temporal, etiquetaVerdadera)
		RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaFalsa)

		RESULTADO_FINAL.EtiquetaF = etiquetaFalsa
		RESULTADO_FINAL.EtiquetaV = etiquetaVerdadera

	} else {
		RESULTADO_FINAL.Codigo = resultadoDer.Codigo
	}

	RESULTADO_FINAL.EtiquetaV = resultadoDer.EtiquetaV
	RESULTADO_FINAL.EtiquetaF = resultadoDer.EtiquetaF
	RESULTADO_FINAL.Tipo = entorno.BOOLEAN

	return RESULTADO_FINAL

}

func (this Operacion) RESTA_UNARIA(operando interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

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

func (this Operacion) RESTA(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoIzq := Izq.Obtener3D(ent)

	resultadoDer := Der.Obtener3D(ent)

	tipoDominante := resta_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	if tipoDominante == entorno.NULL {
		return entorno.Result3D{}
	}

	RESULTADO_FINAL := entorno.Result3D{}
	RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
	RESULTADO_FINAL.Tipo = tipoDominante

	RESULTADO_FINAL.Codigo += resultadoIzq.Codigo + "\n"
	RESULTADO_FINAL.Codigo += resultadoDer.Codigo + "\n"
	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s - %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	return RESULTADO_FINAL

}

func (this Operacion) SUMA(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoIzq := Izq.Obtener3D(ent)

	resultadoDer := Der.Obtener3D(ent)

	RESULTADO_FINAL := entorno.Result3D{}

	tipoDominante := suma_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	if tipoDominante == entorno.INTEGER {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s + %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDominante == entorno.FLOAT {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s + %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDominante == entorno.STRING {

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

			codigo1 = this.SumarCadena(resultadoIzq)
		}

		codigo2 := ""
		if resultadoDer.Tipo != entorno.STRING {
			codigo2 += fmt.Sprintf("Heap[HP] = -1; \n")
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
			codigo2 += fmt.Sprintf("Heap[HP] = %s; \n", resultadoDer.Temporal)
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
		} else {

			codigo2 = this.SumarCadena(resultadoDer)
		}

		RESULTADO_FINAL.Codigo += codigo1
		RESULTADO_FINAL.Codigo += codigo2

		RESULTADO_FINAL.Codigo += fmt.Sprintf("Heap[HP] = 0; /* caracter de escape */ \n")
		RESULTADO_FINAL.Codigo += fmt.Sprintf("HP = HP + 1; ")

	}

	return RESULTADO_FINAL
}

func (this Operacion) MULTIPLICACION(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoIzq := Izq.Obtener3D(ent)

	resultadoDer := Der.Obtener3D(ent)

	RESULTADO_FINAL := entorno.Result3D{}

	tipoDominante := multi_division_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	if tipoDominante == entorno.INTEGER {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s * %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDominante == entorno.FLOAT {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s * %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDominante == entorno.STRING {

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

			//codigo1 = this.SumarCadena(resultadoIzq)
		}

		codigo2 := ""
		if resultadoDer.Tipo != entorno.STRING {
			codigo2 += fmt.Sprintf("Heap[HP] = -1; \n")
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
			codigo2 += fmt.Sprintf("Heap[HP] = %s; \n", resultadoDer.Temporal)
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
		} else {

			//codigo2 = this.SumarCadena(resultadoDer)
		}

		RESULTADO_FINAL.Codigo += codigo1
		RESULTADO_FINAL.Codigo += codigo2

		RESULTADO_FINAL.Codigo += fmt.Sprintf("Heap[HP] = 0; /* caracter de escape */ \n")
		RESULTADO_FINAL.Codigo += fmt.Sprintf("HP = HP + 1; ")

	}

	return RESULTADO_FINAL
}
func (this Operacion) DIVISION(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {

	resultadoIzq := Izq.Obtener3D(ent)

	resultadoDer := Der.Obtener3D(ent)

	RESULTADO_FINAL := entorno.Result3D{}

	tipoDominante := multi_division_dominante[resultadoIzq.Tipo][resultadoDer.Tipo]

	if tipoDominante == entorno.INTEGER {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s / %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDominante == entorno.FLOAT {
		RESULTADO_FINAL.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
		RESULTADO_FINAL.Tipo = entorno.INTEGER

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += fmt.Sprintf("%s= %s / %s; \n", RESULTADO_FINAL.Temporal, resultadoIzq.Temporal, resultadoDer.Temporal)

	} else if tipoDominante == entorno.STRING {

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

			//codigo1 = this.SumarCadena(resultadoIzq)
		}

		codigo2 := ""
		if resultadoDer.Tipo != entorno.STRING {
			codigo2 += fmt.Sprintf("Heap[HP] = -1; \n")
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
			codigo2 += fmt.Sprintf("Heap[HP] = %s; \n", resultadoDer.Temporal)
			codigo2 += fmt.Sprintf("HP = HP + 1;\n")
		} else {

			//codigo2 = this.SumarCadena(resultadoDer)
		}

		RESULTADO_FINAL.Codigo += codigo1
		RESULTADO_FINAL.Codigo += codigo2

		RESULTADO_FINAL.Codigo += fmt.Sprintf("Heap[HP] = 0; /* caracter de escape */ \n")
		RESULTADO_FINAL.Codigo += fmt.Sprintf("HP = HP + 1; ")

	}

	return RESULTADO_FINAL
}

func (this Operacion) RELACIONAL(Izq interfaces.Expresion, Der interfaces.Expresion, ent *entorno.Entorno, relacion string) entorno.Result3D {

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
		etiquetaV := ""
		if this.EtiquetaVerdadera == "" {
			etiquetaV = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		} else {
			etiquetaV = this.EtiquetaVerdadera
		}
		fmt.Println("V (Relacional): " + etiquetaV)
		etiquetaF := ""
		if this.EtiquetaFalsa == "" {
			etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
		} else {
			etiquetaF = this.EtiquetaFalsa
		}
		fmt.Println("F (Relacional): " + etiquetaF)

		RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
		RESULTADO_FINAL.Codigo += "if (" + resultadoIzq.Temporal +" "+ relacion + " " +  resultadoDer.Temporal + ") goto "+ etiquetaV + "; \n";
		RESULTADO_FINAL.Codigo += Analizador.GeneradorGlobal.TabularLinea("goto " + etiquetaF + ";\n",2);

		RESULTADO_FINAL.EtiquetaV = etiquetaV
		RESULTADO_FINAL.EtiquetaF = etiquetaF
		RESULTADO_FINAL.Tipo = entorno.BOOLEAN
		return RESULTADO_FINAL
	} else if resultadoIzq.Tipo == entorno.BOOLEAN && resultadoDer.Tipo == entorno.BOOLEAN &&
		(relacion == "!=" || relacion == "==") {
			etiquetaV := ""
			fmt.Println(etiquetaV)
			if this.EtiquetaVerdadera == "" {
				etiquetaV = Analizador.GeneradorGlobal.ObtenerEtiqueta()
			} else {
				etiquetaV = this.EtiquetaVerdadera
			}
			etiquetaF := ""
			fmt.Println(etiquetaF)
			if this.EtiquetaFalsa == "" {
				etiquetaF = Analizador.GeneradorGlobal.ObtenerEtiqueta()
			} else {
				etiquetaF = this.EtiquetaVerdadera
			}

			RESULTADO_FINAL.Codigo = resultadoIzq.Codigo + resultadoDer.Codigo + "\n"
			RESULTADO_FINAL.Codigo += "if (" + resultadoIzq.Temporal +" "+ relacion + " " +  resultadoDer.Temporal + ") goto "+ etiquetaV + "; \n";
			RESULTADO_FINAL.Codigo += Analizador.GeneradorGlobal.TabularLinea("goto " + etiquetaF + ";\n",2);

			RESULTADO_FINAL.EtiquetaV = etiquetaV
			RESULTADO_FINAL.EtiquetaF = etiquetaF
			RESULTADO_FINAL.Tipo = entorno.BOOLEAN
			return RESULTADO_FINAL
	} else {
		return entorno.Result3D{}
	}

	// ! A PARTIR DE ACA, EL CODIGO NO APLICA

	// etiquetaVerdadera := this.EtiquetaVerdadera
	// etiquetaFalsa := this.EtiquetaVerdadera

	// if this.EtiquetaVerdadera == "" {
	// 	etiquetaVerdadera = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	// }

	// if this.EtiquetaFalsa == "" {
	// 	etiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	// }

	// RESULTADO_FINAL.Codigo += fmt.Sprintf("if ( %s %s %s ) goto %s; \n", resultadoIzq.Temporal, relacion, resultadoDer.Temporal, etiquetaVerdadera)
	// RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;", etiquetaFalsa)

	// RESULTADO_FINAL.EtiquetaV = etiquetaVerdadera
	// RESULTADO_FINAL.EtiquetaF = etiquetaFalsa
	// RESULTADO_FINAL.Tipo = entorno.BOOLEAN

	// return RESULTADO_FINAL

}

func (this Operacion) SumarCadena(exprResultado entorno.Result3D) string {

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

func (this Operacion) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
