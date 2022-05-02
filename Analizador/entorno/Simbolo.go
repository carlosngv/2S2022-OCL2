package entorno

import (
	"github.com/colegno/arraylist"
)

type SimboloAbstracto interface {
	GetTipo() TipoDato
}

type Simbolo struct {
	Linea         int
	Columna       int
	Identificador string
	EsReferencia  bool
	Referencia    interface{}
	Tipo          TipoDato
	Constante     bool
	EsFuncion     bool
	ListaParams   *arraylist.List
	Posicion     int

	Temporal_REF string

	Valor interface{}
}

/**
 * @comentario  Constructor que se utiliza solo para guardar un ID en un simbolo
 * @param       identificador  -> Identificador del Simbolo.
 */
/*
	int d =  x + y;
*/

func NewSimboloIdentificador(linea int, columna int, identificador string) *Simbolo {
	return &Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     false,
		Posicion:     0,
		EsReferencia:  false,
		Valor: 	   nil,
	}
}

func NewSimboloIdentificadorValor(linea int, columna int, identificador string, dato TipoDato) Simbolo {
	e := Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     false,
		Posicion:     0,
		Tipo:          dato,
		EsReferencia:  false,
		Valor: 	   nil,
	}
	return e
}

func NewSimboloObjeto(linea int, columna int, identificador string, tipoRet TipoDato) Simbolo {
	e := Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     true,
		Posicion:     0,
		Tipo:          tipoRet,
		ListaParams:   nil,
		EsReferencia:  false,
		Valor: 	   nil,
	}
	return e
}

func NewSimboloFuncion(linea int, columna int, identificador string, tipoRet TipoDato, listParametros *arraylist.List) Simbolo {
	e := Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     true,
		Posicion:     0,
		Tipo:          tipoRet,
		ListaParams:   listParametros,
		EsReferencia:  false,
	}
	return e
}
func NewSimboloArreglo(linea int, columna int, identificador string, tipoDatos TipoDato) Simbolo {
	e := Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     true,
		Posicion:     0,
		Tipo:          tipoDatos,
		ListaParams:   nil,
		EsReferencia:  false,
	}
	return e
}

// IMPLEMENTANDO INTERFAZ
func (s Simbolo) GetTipo() TipoDato {
	return s.Tipo
}
