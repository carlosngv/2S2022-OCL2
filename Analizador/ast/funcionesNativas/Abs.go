package funcionesNativas

type  ValorAbs struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorAbs(id string, linea int, columna int) *ValorAbs {
	return &ValorAbs{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}
