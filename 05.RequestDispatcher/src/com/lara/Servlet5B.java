package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5B extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();

		System.out.println("--------Console : Servlet5B Begin--------");
		       out.println("--------Browser : Servlet5B Begin --------<br>");
 
		// Reading Form data by using same request object
		String s2 = request.getParameter("param1");

		System.out.println("Console : Servlet5B : Parameter = " + s2);
		       out.println("Browser : Servlet5B : Parameter = " + s2 + "<br>");

		// By using Absolute way.
		RequestDispatcher rd1 = getServletContext().getRequestDispatcher("/Servlet5C");
		//rd1.forward(request, response);
		rd1.include(request, response);
		System.out.println("--------Console : Servlet5B End--------");
		       out.println("--------Browser : Servlet5B End --------<br>");
	}

}
