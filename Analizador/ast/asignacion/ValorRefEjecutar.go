package asignacion

import "p1/packages/Analizador/entorno"

type ValorRefEjecutar struct {
	referencia interface{}
}

func NewValorRefEjecutar(referencia interface{}) ValorRefEjecutar {
	return ValorRefEjecutar{referencia: referencia}
}


func (valRef ValorRefEjecutar) Get3D(ent *entorno.Entorno) string {
	return ""
}
