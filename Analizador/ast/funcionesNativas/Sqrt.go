package funcionesNativas

import "p1/packages/Analizador/entorno"

type  ValorSqrt struct {
	ID 	  string
	Linea int
	Columna int
}

func NewValorSqrt(id string, linea int, columna int) *ValorSqrt {
	return &ValorSqrt{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

func (sqrt ValorSqrt) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	resultadoNuevo := entorno.Result3D{}
	return resultadoNuevo

}

func (this ValorSqrt) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
