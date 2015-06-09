# benchmark-web-frameworks
SparkJava vs Grizzly vs golang's net/http


# How to build

## For java projects

- $ mvn clean compile
- $ mvn exec:java

- Spark application is running on the URL - `http://localhost:4567/fib/10`
- Grizzly application is running on the URL - `http://localhost:8080/fib?number=10`

## For Go project

- $ go build
- $ ./go-simple-http
- Go application running on - `http://localhost:8080/fib?number=10`


# Run the test

We used `wrk` command to run the load test.

$ ./wrk -c64 -d30s <URL>

This test will run for 30s with 64 connections on 2 threads (default).
