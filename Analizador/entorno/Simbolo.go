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
	Valor         interface{}
	EsReferencia  bool
	Referencia    interface{}
	Tipo          TipoDato
	Constante     bool
	EsFuncion     bool
	ListaParams   *arraylist.List
	EsMutable     bool
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
		Valor:         nil,
		EsReferencia:  false,
		EsMutable:     true,
	}
}

func NuevoSimboloIdentificadorValor(linea int, columna int, identificador string, valor interface{}, dato TipoDato, esMutable bool) Simbolo {
	e := Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     false,
		Valor:         valor,
		Tipo:          dato,
		EsReferencia:  false,
		EsMutable:     esMutable,
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
		Valor:         nil,
		Tipo:          tipoRet,
		ListaParams:   nil,
		EsReferencia:  false,
		EsMutable:     true,
	}
	return e
}

func NuevoSimboloFuncion(linea int, columna int, identificador string, tipoRet TipoDato, listParametros *arraylist.List) Simbolo {
	e := Simbolo{
		Linea:         linea,
		Columna:       columna,
		Identificador: identificador,
		Constante:     false,
		EsFuncion:     true,
		Valor:         nil,
		Tipo:          tipoRet,
		ListaParams:   listParametros,
		EsReferencia:  false,
		EsMutable:     true,
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
		Valor:         nil,
		Tipo:          tipoDatos,
		ListaParams:   nil,
		EsReferencia:  false,
		EsMutable:     true,
	}
	return e
}

// IMPLEMENTANDO INTERFAZ
func (s Simbolo) GetTipo() TipoDato {
	return s.Tipo
}
