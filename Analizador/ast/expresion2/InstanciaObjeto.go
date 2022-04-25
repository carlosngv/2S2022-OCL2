package expresion2

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/instrucciones"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"
	"reflect"
)

type InstanciaObjeto struct {
	Id string
}

func NewInstanciaObjeto(id string) InstanciaObjeto {
	return InstanciaObjeto{Id: id}
}

func (this InstanciaObjeto) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	RESULTADO_FINAL := entorno.Result3D{}

	existe := ent.ExisteClase(this.Id)

	if !existe {
		return entorno.Result3D{Tipo: entorno.NULL}
	}

	clasePlantilla := ent.ObtenerClase(this.Id).(*entorno.Clase)

	RESULTADO_FINAL.Codigo += "/* **** VAMOS A DECLARAR UN OBJETO *************/\n"

	temporalStack := Analizador.GeneradorGlobal.ObtenerTemporal()
	temporalHeap := Analizador.GeneradorGlobal.ObtenerTemporal()

	tamanioEntornoActual := ent.Tamanio

	tamanioClase := this.tamano(clasePlantilla) // ? Obtiene el tamaño de la clase, es decir, cuantas variables lo definen (Se omite contar funciones)

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = HP; /* DIRECCIÓN INICIAL EN HEAP*/ \n ", temporalHeap) // ? Almacenamos la posición actual en el heap en un temporal
	RESULTADO_FINAL.Codigo += fmt.Sprintf("HP = HP + %s; \n", tamanioClase) // ? Reserva el tamaño de la clase en el Heap. Desde la posición actual a la actual + tamaño de la clase

	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = SP + %d; /* DIRECCION EN STACK*/\n", temporalStack, tamanioEntornoActual) // ? Acá se apuntará la referencia del objeto
	RESULTADO_FINAL.Codigo += fmt.Sprintf("Stack[(int) %s] = %s  ;\n ", temporalStack, temporalHeap) // ? Almacena el valor de la referencia al objeto en el heap

	ENTORNO_OBJETO := entorno.NewEntorno("OBJETO", ent)

	for i := 0; i < clasePlantilla.Instrucciones.Len(); i++ {

		/*

		? 	Acá se declaran las variables de la clase (Struct)

		*/

		INSTRU_PIVOTE := clasePlantilla.Instrucciones.GetValue(i)

		if reflect.TypeOf(INSTRU_PIVOTE) != reflect.TypeOf(Simbolos.Funcion{}) {


			declaracion := INSTRU_PIVOTE.(*instrucciones.Declaracion)

			declaracion.CambiarEntorno = true // ? Cambia entorno
			declaracion.TemporalEntorno = temporalHeap // ? Indica donde comienza el entorno de la clase (Struct)

			RESULTADO_FINAL.Codigo += declaracion.Get3D(&ENTORNO_OBJETO)

		}

	}

	posicionRelativa := tamanioEntornoActual

	OBJETO_SIMBOLO := Simbolos.NewObjecto("", ENTORNO_OBJETO, clasePlantilla.Id)
	OBJETO_SIMBOLO.Posicion = posicionRelativa

	RESULTADO_FINAL.Tipo = entorno.OBJETO
	RESULTADO_FINAL.Valor = OBJETO_SIMBOLO

	return RESULTADO_FINAL
}

func (this InstanciaObjeto) tamano(clase *entorno.Clase) string {

	tamano := 0

	for i := 0; i < clase.Instrucciones.Len(); i++ {
		if reflect.TypeOf(clase.Instrucciones.GetValue(i)) != reflect.TypeOf(Simbolos.Funcion{}) {
			tamano = tamano + 1
		}
	}

	return fmt.Sprintf("%d", tamano)
}

func (this InstanciaObjeto) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
