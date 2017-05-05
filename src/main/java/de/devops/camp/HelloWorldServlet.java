package de.devops.camp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet 
{
  public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
	
	HelloWorldBuilder hwb = new HelloWorldBuilder();  
	String output = hwb.getOutput();  
	  
    PrintWriter out = res.getWriter();
    out.println( output );
    out.close();
  }
}
