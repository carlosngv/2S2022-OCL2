package expresion2

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"

	arrayList "github.com/colegno/arraylist"
)

type Llamada struct {
	IdFuncion        string
	ListaExpresiones *arrayList.List
}

func NewLlamada(idFuncion string, ListaExpresiones *arrayList.List) Llamada {
	return Llamada{IdFuncion: idFuncion, ListaExpresiones: ListaExpresiones}
}

func (this Llamada) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	SALIDA_FINAL := entorno.Result3D{}

	hayFuncion := ent.ExisteFuncion(this.IdFuncion)
	if !hayFuncion {
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	Entorno_fun := entorno.NewEntorno("Funcion", ent)

	Funcion := ent.ObtenerFuncion(this.IdFuncion).(Simbolos.Funcion)
	clonFunc := Simbolos.NewFuncion(Funcion.Identificador, Funcion.ListaParamsDecl.Clone(), Funcion.ListaInstrucciones.Clone(), Funcion.Tipo)

	this.ValidarFuncionGenerada(ent, &Funcion) // ? Se encarga de generar el C3D de la función en caso no lo esté

	Entorno_fun.Tamanio = 1 // ? Empieza en 1 porque en la posición 0 siempre irá el return de una función
	// * STACK_FUNCION [ --retorno--  , -- param1--, -- param2--, -- paramN--, -- VariableFuncion ( ...... )--  ]

	temporalEntorno := Analizador.GeneradorGlobal.ObtenerTemporal() // ? Almacenará la posición en donde empezará la llamada a función

	// ? temporalEntorno = SP + tamaño del entorno desde donde llamamos la función
	// ? Es decir, se almacenará la posición donde empezará la función (Que es luego del entorno)
	SALIDA_FINAL.Codigo += fmt.Sprintf("%s = SP + %d; /* Cambiando a siguiente entorno */\n", temporalEntorno, ent.Tamanio)

	seEjecuto, codigoParametros := clonFunc.EjecutarParametros(&Entorno_fun, this.ListaExpresiones, temporalEntorno, ent)
	if !seEjecuto {
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	SALIDA_FINAL.Codigo += codigoParametros
	SALIDA_FINAL.Codigo += fmt.Sprintf("/* Cambiando entorno */; \n")

	SALIDA_FINAL.Codigo += fmt.Sprintf("SP = SP + %d; /* Cambio de entorno al siguiente */\n", ent.Tamanio) // ? Cambio de ámbito
	SALIDA_FINAL.Codigo += fmt.Sprintf("%s();\n", this.IdFuncion)
	SALIDA_FINAL.Codigo += fmt.Sprintf("SP = SP - %d; /* Cambio de enterno al anterior */\n", ent.Tamanio)

	return SALIDA_FINAL
}

func (this Llamada) Get3D(ent *entorno.Entorno) string {

	VALOR := this.Obtener3D(ent)

	return VALOR.Codigo
}

func (l Llamada) ValidarFuncionGenerada(ent *entorno.Entorno, funcion *Simbolos.Funcion) {

	if funcion.Generado == false {
		funcion.Generado = true
		ent.CambiarFuncionGenerada(funcion.Identificador, *funcion)

		CODIGO := funcion.Get3D(ent)
		Analizador.GeneradorGlobal.GenerarFuncion(CODIGO)
	}

}

func (this Llamada) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
