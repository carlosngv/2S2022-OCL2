package instrucciones

import (
	"fmt"
	analizador "p1/packages/Analizador"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	"github.com/colegno/arraylist"
)

var tipoDef = [5][5]entorno.TipoDato{
	{entorno.INTEGER, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.STRING, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.BOOLEAN, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
}

type Declaracion struct {
	ValorInicializacion interfaces.Expresion
	ValorInicializacion3D entorno.Result3D
	TipoVariables       entorno.TipoDato
	ListaVars           *arraylist.List
	Referencia          bool
	EntornoRef          *entorno.Entorno
	EsArreglo			bool

	CambiarEntorno  bool
	TemporalEntorno string

	DecFuncion   bool
	Temporal_Ref string // TEMPORAL PARA REFERENCIAS
}

func NewDeclaracion(listaVars *arraylist.List, tipoVariables entorno.TipoDato) *Declaracion {
	return &Declaracion{
		TipoVariables: tipoVariables,
		ListaVars:     listaVars,
		CambiarEntorno:  false,
		TemporalEntorno: "",

	}
}

func NewDeclaracionParametro(listaVars *arraylist.List, tipoVariables entorno.TipoDato, referencia bool) *Declaracion {
	return &Declaracion{
		TipoVariables:   tipoVariables,
		ListaVars:       listaVars,
		Referencia:      referencia,
		CambiarEntorno:  false,
		TemporalEntorno: "",
	}
}



func NewDeclaracionInicializacion(listaVars *arraylist.List, tipoVariables entorno.TipoDato, valInicial interfaces.Expresion ) *Declaracion {
	return &Declaracion{
		TipoVariables:       tipoVariables,
		ListaVars:           listaVars,
		ValorInicializacion: valInicial,
		CambiarEntorno:      false,
		TemporalEntorno:     "",
	}
}


func (dec *Declaracion) Get3D(ent *entorno.Entorno) string {

	PUNTERO_STACK_O_HEAP := "SP"
	STACK_O_HEAP := "Stack"

	if dec.DecFuncion {

		/*
			? PUNTERO_STACK_O_HEAP será igual al temporalEntorno definido en la llamada
		*/

		PUNTERO_STACK_O_HEAP = dec.TemporalEntorno

	} else if dec.CambiarEntorno {
		/*
			? Esta validación se utiliza al definir Structs, ya que el cambio de entorno
			? indica que debe de ir a almacenar las declaraciones al Heap, ya que un struct
			? es un objeto.
		*/
		PUNTERO_STACK_O_HEAP = dec.TemporalEntorno // ? Indica donde empieza el entorno de la clase (Struct)
		STACK_O_HEAP = "Heap"
	}

	CODIGO_SALIDA := "\n\n\n"

	if dec.esInicializado() {

		IDE := dec.ListaVars.GetValue(0).(expresion.Identificador)

		// TODO: VALIDAR SI YA EXISTE EL IDENTIFICADOR EN EL AMBITO

		resultadoExpr := entorno.Result3D{}

		if dec.ValorInicializacion == nil {
			resultadoExpr = dec.ValorInicializacion3D // Valor vacío
		} else {
			resultadoExpr = dec.ValorInicializacion.Obtener3D(ent)
			//dec.TipoVariables = resultadoExpr.Tipo
		}



		if resultadoExpr.Tipo != dec.TipoVariables {
			return ""
		}
		// int a = 10 + 10 ;
		CODIGO_SALIDA += resultadoExpr.Codigo

		posicionRelativa := ent.Tamanio // ? Posición donde empieza el entorno, o a guardarse la declaración

		temporal := analizador.GeneradorGlobal.ObtenerTemporal()

		CODIGO_SALIDA += "\n/* DECLARACIÓN DE VARIABLE INICIALIZADA*/\n"
		//CODIGO_SALIDA += temporal + " = SP + " + fmt.Sprint(posicionRelativa) + ";\n"

		//  TEMPORAL =  SP | HP  + ent.tamano
		CODIGO_SALIDA += fmt.Sprintf("%s = %s + %d;\n", temporal, PUNTERO_STACK_O_HEAP, posicionRelativa)

		// SP + ENT.TAMANIO
		// temporalReferencia + entObjet.TAMANIO

		//CODIGO_SALIDA += "Stack[(int)" + temporal + "] = " + resultadoExpr.Temporal
		CODIGO_SALIDA += fmt.Sprintf("%s[(int) %s]= %s;\n", STACK_O_HEAP, temporal, resultadoExpr.Temporal) // ? Almacenamos el valor|referencia en el stack

		simbolo := entorno.NewSimboloIdentificadorValor(0, 0, IDE.Identificador, dec.TipoVariables)
		simbolo.Posicion = posicionRelativa

		if dec.Temporal_Ref != "" {

			simbolo.Temporal_REF = dec.Temporal_Ref

			if resultadoExpr.ValorEnHeap {
				CODIGO_SALIDA += fmt.Sprintf("%s = 1; /* 1 SIGNIFICA QUE EL VALOR REFERENCIADO ESTA EN EL HEAP */", simbolo.Temporal_REF)
			} else {
				CODIGO_SALIDA += fmt.Sprintf("%s = 0; /* 0 SIGNIFICA QUE EL VALOR REFERENCIADO ESTA EN EL STACK */", simbolo.Temporal_REF)
			}
		}

		if dec.Referencia {
			simbolo.EsReferencia = true
		}
		simbolo.Valor = resultadoExpr
		ent.AgregarSimbolo(simbolo.Identificador, simbolo)
		ent.Tamanio = ent.Tamanio + 1

	} else {

		for i := 0; i < dec.ListaVars.Len(); i++ {
			VARIABLE := dec.ListaVars.GetValue(i).(expresion.Identificador)
			nuevoValor := entorno.Result3D{}


			simbolo := entorno.NewSimboloIdentificadorValor(0, 0, VARIABLE.Identificador, dec.TipoVariables)
			simbolo.Posicion = ent.Tamanio
			simbolo.Valor = nuevoValor

			if dec.Referencia {
				simbolo.EsReferencia = true

				if dec.Temporal_Ref != "" {
					simbolo.Temporal_REF = dec.Temporal_Ref
				}
			}

			ent.AgregarSimbolo(simbolo.Identificador, simbolo)
			ent.Tamanio = ent.Tamanio + 1
		}

	}

	return CODIGO_SALIDA
}

func (dec *Declaracion) esInicializado() bool {

	if dec.ValorInicializacion != nil || dec.ValorInicializacion3D.Temporal != "" {
		return true
	}

	return false
}

func (dec *Declaracion) valorPorDefecto(tipo entorno.TipoDato) entorno.Result3D {

	resultado3D := entorno.Result3D{}

	if tipo == entorno.INTEGER {
		resultado3D.Codigo = ""
		resultado3D.Tipo = entorno.INTEGER
		resultado3D.Temporal = "0"

	} else if tipo == entorno.STRING {

		temp1 := analizador.GeneradorGlobal.ObtenerTemporal()

		resultado3D.Codigo += fmt.Sprintf("%s= HP; \n", temp1)
		resultado3D.Codigo += fmt.Sprintf("Heap[(int)%s] = 0; \n", temp1)
		resultado3D.Codigo += fmt.Sprintf("HP = HP + 1; \n")

		resultado3D.Temporal = temp1
		resultado3D.Tipo = entorno.STRING

	}

	return resultado3D
}
