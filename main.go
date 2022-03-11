package main

import (
	"fmt"
	"log"
	"net/http"
	"p1/packages/routes"
	"time"

	"github.com/gorilla/mux"
	"github.com/rs/cors"
)
type Todo struct {
	Item string
	Done bool
}



func main() {
	router := mux.NewRouter()

	routes.UseRoutes(router)

	corsWrapper := cors.New(cors.Options{
		AllowedMethods: []string{"GET", "POST"},
		AllowedHeaders: []string{"Content-Type", "Origin", "Accept", "*"},
	})

	server := &http.Server{
		Handler:      corsWrapper.Handler(router),
		Addr:         ":3000",
		WriteTimeout: 15 * time.Second,
		ReadTimeout:  15 * time.Second,
	}

	fmt.Println("Server running on port 3000")
	log.Fatal(server.ListenAndServe())


	//tmpl := template.Must(template.ParseFiles("templates/index.gohtml"))
	//mux.HandleFunc("/todo", todo)
}
