package main

import (
	"fmt"
	"log"
	"net/http"
	"strconv"
	"time"
)

func main() {
	mux := http.NewServeMux()

	mux.HandleFunc("/fib", func(w http.ResponseWriter, req *http.Request) {
		number, _ := strconv.Atoi(req.FormValue("number"))
		// Another way.
		//number1 := req.URL.Query().Get("number")
		msg := fmt.Sprintf("Message From Go code, Fibnacii of %d, At: %s",
			fib(number), time.Now().Format("20060102150405"))
		w.Write([]byte(msg))
	})

	// Start the server.
	log.Fatal(http.ListenAndServe(":8080", mux))

}

// Get the n'th Fibonacci seriese using recursion.
func fib(n int) int {
	if n == 0 {
		return 0
	} else if n == 1 {
		return 1
	} else {
		return fib(n-1) + fib(n-2)
	}
}
