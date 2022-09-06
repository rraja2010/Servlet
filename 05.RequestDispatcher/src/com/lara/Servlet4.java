package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request1,HttpServletResponse response1)
			throws ServletException, IOException
	{

		PrintWriter out = response1.getWriter();

		System.out.println("--------Console : Servlet4 Begin--------");
		       out.println("--------Browser : Servlet4 Begin --------<br>");

		
		
		// Reading Form data by using same request object
		String s2 = request1.getParameter("param1");

		
		System.out.println("Console : Servlet4 : Parameter = " + s2);
		       out.println("Browser : Servlet4 : Parameter = " + s2 + "<br>");

		
		
		// Reading the revParam from Servlet3 request object
		String revParam2 = (String) request1.getAttribute("result");

		System.out.println("Console : Servlet4 : revParam = " + revParam2);
		       out.println("Browser : Servlet4 : revParam = " + revParam2 + "<br>");

		System.out.println("--------Console : Servlet4 End--------");
		       out.println("--------Browser : Servlet4 End --------<br>");
	}

}
