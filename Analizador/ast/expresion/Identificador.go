package expresion

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"strings"
)

type Identificador struct {
	Identificador     string
	ObtenerReferencia bool
}

func NewIdentificador(identificador string) Identificador {
	return Identificador{Identificador: identificador}
}

/*
	Según sea necesario, se mandará a traer la dirección o valor del identificador.
	? La dirección cuando se quiera obtener la referencia, caso contrario el valor.
*/

func (this Identificador) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	if this.ObtenerReferencia {
		return this.ObtenerDireccion(ent)

	} else {
		return this.ObtenerValor(ent)
	}



}

func (this Identificador) ObtenerValor(ent *entorno.Entorno) entorno.Result3D {

	RESULTADO_FINAL := entorno.Result3D{}

	temporal1 := Analizador.GeneradorGlobal.ObtenerTemporal()

	RESULTADO_FINAL.Codigo += fmt.Sprintf("/* BUSCANDO UN IDENTIFICADOR  >>> %s <<<*/ \n", this.Identificador)
	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = SP; \n", temporal1) // ? Temporal que almacena la dirección del entorno actual

	idEncontrado := strings.ToLower(this.Identificador)

	for entActual := ent; entActual != nil; entActual = entActual.EntAnterior { //  ? Vamos iterando los entornos hacia atrás

		for key, simboloElement := range entActual.Tabla { // ? Vamos a buscar el id en los entornos anteriores hasta hacer match con el que estamos buscando.
			if key == idEncontrado {

				SIMBOLO := simboloElement.(entorno.Simbolo) // ? Parseamos el simbolo

				temporal2 := Analizador.GeneradorGlobal.ObtenerTemporal()
				temporal3 := Analizador.GeneradorGlobal.ObtenerTemporal()

				RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = %s + %d; \n", temporal2, temporal1, SIMBOLO.Posicion) // ? Se obtiene la posición del identificador... t2 = t1 + Posición relativa del identificador
				RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = Stack[(int)%s]; \n", temporal3, temporal2) // ? Obtenemos el valor del identificador del stack



				if SIMBOLO.EsReferencia {


					/*
					? Si es una referencia, entonces el código anterior unicamente nos trae la posición de las variables.
					? Entonces, ahora tocaría ir a obtener el valor como tal de esa referencia.
					*/

					RESULTADO_FINAL.Codigo += fmt.Sprintf("/* Referencia del indentificador: " + idEncontrado + " encontrado */\n")
					temporal4 := Analizador.GeneradorGlobal.ObtenerTemporal()

					if SIMBOLO.Temporal_REF != "" {

						etiqueta1 := Analizador.GeneradorGlobal.ObtenerEtiqueta()
						etiqueta2 := Analizador.GeneradorGlobal.ObtenerEtiqueta()

						/*
							if(tRef == 1) goto L1;
							t4 = stack[(int) t3]; -- Del stack si es un valor primitivo
							goto L2;
							L1:
								t4 = heap[(int)t3]; -- Del heap si es un atributo de un objeto o arreglo
							L2:
								-- Codigo de salida
						*/

						RESULTADO_FINAL.Codigo += "/* Comprobando posición de referencia */\n"
						RESULTADO_FINAL.Codigo += fmt.Sprintf("if( %s == 1 ) goto %s;\n", SIMBOLO.Temporal_REF, etiqueta1)
						RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = Stack[(int)%s]; /* Valor de la referencia */\n", temporal4, temporal3)
						RESULTADO_FINAL.Codigo += fmt.Sprintf("goto %s;\n", etiqueta2)
						RESULTADO_FINAL.Codigo += fmt.Sprintf("%s: /* Etiqueta = 1 --> Buscar en Heap */ \n", etiqueta1)
						RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = Heap[(int)%s]; /* Valor de la referencia */\n", temporal4, temporal3)
						RESULTADO_FINAL.Codigo += fmt.Sprintf("%s: /* Etiqueta de salida */ \n", etiqueta2)

						RESULTADO_FINAL.Temporal = temporal4
					} else {
						RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = Stack[(int)%s]; /* Valor de la referencia */\n", temporal4, temporal3)
						RESULTADO_FINAL.Temporal = temporal4
					}

				} else {
					RESULTADO_FINAL.Codigo += fmt.Sprintf("/* Identificador: " + idEncontrado + " encontrado */\n")
					RESULTADO_FINAL.Temporal = temporal3
				}

				RESULTADO_FINAL.Tipo = SIMBOLO.Tipo
				return RESULTADO_FINAL
			}
		}

		if entActual.EntAnterior != nil {
			RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = %s - %d;\n /* Nos movemos al entorno anterior */\n", temporal1, temporal1, entActual.Tamanio)
		}

	}

	return RESULTADO_FINAL
}
func (this Identificador) ObtenerDireccion(ent *entorno.Entorno) entorno.Result3D {

	RESULTADO_FINAL := entorno.Result3D{}

	temporal1 := Analizador.GeneradorGlobal.ObtenerTemporal() // ? Hace referencia a la posición del enterno actual en el stack

	RESULTADO_FINAL.Codigo += fmt.Sprintf("/* Buscando un identificador  >>> %s <<< */ \n", this.Identificador)
	RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = SP; \n", temporal1) // ? Se asigna la posición del entorno actual a t1

	idEncontrado := strings.ToLower(this.Identificador)

	for entActual := ent; entActual != nil; entActual = entActual.EntAnterior {

		for key, simboloElement := range entActual.Tabla {
			if key == idEncontrado {

				SIMBOLO := simboloElement.(entorno.Simbolo)

				temporal2 := Analizador.GeneradorGlobal.ObtenerTemporal()
				RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = %s + %d; \n", temporal2, temporal1, SIMBOLO.Posicion) // ? t2 = t1 + posición relativa del simbolo (Identificador)
				RESULTADO_FINAL.Codigo += fmt.Sprintf("/* Identificador: %s encontrado.  */\n", this.Identificador)

				RESULTADO_FINAL.Temporal = temporal2
				RESULTADO_FINAL.Tipo = SIMBOLO.Tipo
				return RESULTADO_FINAL
			}
		}

		if entActual.EntAnterior != nil {
			RESULTADO_FINAL.Codigo += fmt.Sprintf("%s = %s - %d;\n /* Nos movemos al entorno anterior */\n", temporal1, temporal1, entActual.Tamanio)
		}

	}

	return RESULTADO_FINAL
}

func (this Identificador) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {

	this.ObtenerReferencia = true
	return this.Obtener3D(ent)
}
