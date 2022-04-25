package funcionesNativas

import "p1/packages/Analizador/entorno"

type  ValorStr struct {
	ID 	  string
	Linea int
	Columna int
}

func NewValorStr(id string, linea int, columna int) *ValorStr {
	return &ValorStr{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

func (str ValorStr) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	resultadoNuevo := entorno.Result3D{}
	return resultadoNuevo

}

func (this ValorStr) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
