package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String param1=request.getParameter("param1");
		String param2=request.getParameter("param2");
		
		//String param3=request.getParameter("param3");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Param1 : "+param1);
		printWriter.println("Param2 : "+param2);
		//printWriter.println("Param3 : "+param3);
		
		System.out.println("Param1:"+param1 + " Param2 : "+param2);
	}
}

/*

public String getParameter(String name)
request.getParameter() method in the servlet class, to retrieve the input values from HTML page.
Returns the value of a request parameter as a String, or null if the parameter does not exist

*/