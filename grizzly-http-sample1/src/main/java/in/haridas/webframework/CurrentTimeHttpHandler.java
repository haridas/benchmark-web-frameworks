package in.haridas.webframework;


import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by haridas on 8/6/15.
 */
public class CurrentTimeHttpHandler extends HttpHandler {
    @Override
    public void service(Request request, Response response) throws Exception {
        final SimpleDateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        final String date = format.format(new Date(System.currentTimeMillis()));

        response.setContentType("text/plain");
        response.setContentLength(date.length());
        response.getWriter().write(date);
    }
}
