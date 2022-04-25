package funcionesNativas

import "p1/packages/Analizador/entorno"

type  ValorAbs struct {
	ID 	  string
	Linea int
	Columna int
}

func NewValorAbs(id string, linea int, columna int) *ValorAbs {
	return &ValorAbs{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

func (va ValorAbs) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	resultadoNuevo := entorno.Result3D{}
	return resultadoNuevo

}

func (this ValorAbs) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
