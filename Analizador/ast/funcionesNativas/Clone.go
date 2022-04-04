package funcionesNativas

type  ValorClone struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorClone(id string, linea int, columna int) *ValorClone {
	return &ValorClone{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}
