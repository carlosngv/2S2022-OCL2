package main

import (
	"net/http"
	"text/template"
)
type Todo struct {
	Item string
	Done bool
}



func main() {
	mux := http.NewServeMux()
	tmpl := template.Must(template.ParseFiles("templates/index.gohtml"))
	mux.HandleFunc("/todo", todo)
}
