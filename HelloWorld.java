import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.OutputStream;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import java.io.Reader;
import java.io.ByteArrayOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ajax.JSON;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloWorld
{

    public static void main(String[] args) throws Exception
    {
        int port = 3678;
        if (args.length>0) {
            port = Integer.parseInt(args[0]);
        }
        Server server = new Server(port);
        
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");
        context.addServlet(new ServletHolder(new ServletRoute()),"/*");
        System.out.println("context");
        // server.setHandler(context);
       System.out.println("set handler");
        server.start();
              System.out.println("start");
        // server.join();
              System.out.println("Running");
    }
}
