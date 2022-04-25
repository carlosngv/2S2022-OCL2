package funcionesNativas

import "p1/packages/Analizador/entorno"

type  ValorClone struct {
	ID 	  string
	Linea int
	Columna int
}

func NewValorClone(id string, linea int, columna int) *ValorClone {
	return &ValorClone{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}


func (clone ValorClone) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	resultadoNuevo := entorno.Result3D{}
	return resultadoNuevo

}

func (this ValorClone) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}
