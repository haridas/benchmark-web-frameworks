package in.haridas.webframework;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

import java.util.Date;

/**
 * Created by haridas on 8/6/15.
 */
public class FibonacciHttpHandler extends HttpHandler {
    @Override
    public void service(Request request, Response response) throws Exception {
        int number = Integer.parseInt(request.getParameter("number"));
        response.getWriter().write("Grizzly: fib(" + number + ") = " + fib(number) + " At: " + new Date(System.currentTimeMillis()));
    }

    private int fib(int n) {
        if (n == 0) {
            return  0;
        }else if ( n == 1) {
            return 1;
        }else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
