# benchmark-web-frameworks
SparkJava vs Grizzly vs golang's net/http


# Run the test

We used `wrk` command to run the load test.

$ ./wrk -c64 -d30s <URL>

This test will run for 30s with 64 connections on 2 threads (default).
