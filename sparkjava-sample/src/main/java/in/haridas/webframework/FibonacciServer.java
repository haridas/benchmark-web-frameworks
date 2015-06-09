package in.haridas.webframework;

import java.util.Date;

import static spark.Spark.get;
/**
 * Created by haridas on 8/6/15.
 */
public class FibonacciServer {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/test", (req, res) -> "Test Response");
        get("/fib/:number", (req, res) -> {
            int number = Integer.parseInt(req.params(":number"));
            return "Sparkjava: fib(" + number + ") = " + fib(number) + " At: " + new Date(System.currentTimeMillis());

        });
    }

    public static int fib(int n) {



        if (n == 0) {
            return 0;
        }else if(n == 1) {
            return 1;
        }else {
            return fib(n - 1) + fib(n - 2);
        }
    }


}

