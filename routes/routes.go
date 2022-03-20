package routes

import (
	"net/http"
	"p1/packages/controller"

	"github.com/gorilla/mux"
)

func UseRoutes(router *mux.Router) {
	router.HandleFunc("/", controller.Index).Methods(http.MethodGet)
	router.HandleFunc("/api/parse", controller.ProcessData).Methods(http.MethodPost)
}
