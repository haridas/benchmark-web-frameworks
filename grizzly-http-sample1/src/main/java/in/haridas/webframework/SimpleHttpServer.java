package in.haridas.webframework;

import org.glassfish.grizzly.http.server.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by haridas on 8/6/15.
 */
public class SimpleHttpServer {
    private static final Logger logger = LoggerFactory.getLogger(SimpleHttpServer.class);

    public static void main(String[] args ) throws Exception {
        logger.info("Starting the HTTP Server on port 8080.");

        HttpServer server = HttpServer.createSimpleServer();

        server.getServerConfiguration().addHttpHandler(new CurrentTimeHttpHandler(), "/time");
        server.getServerConfiguration().addHttpHandler(new FibonacciHttpHandler(), "/fib");

        try{
            server.start();
            System.out.println("Press any key to stop the server ...");
            System.in.read();
        }catch (Exception e) {
            System.err.println(e);
        }
    }
}
