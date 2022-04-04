package funcionesNativas

type  ValorStr struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorStr(id string, linea int, columna int) *ValorStr {
	return &ValorStr{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}
