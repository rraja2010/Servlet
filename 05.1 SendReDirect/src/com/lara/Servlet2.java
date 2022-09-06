package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out = response.getWriter(); 
		 
		System.out.println("--------Console : Servlet2 Begin--------");
		       out.println("--------Browser : Servlet2 Begin --------<br>");   
		//Reading form data 
		String s2 = request.getParameter("param1"); 
		 
		System.out.println("Console : Servlet2 : Parameter = " + s2); 
		       out.println("Browser : Servlet2 : Parameter = " + s2 + "<br>");
		//response.sendRedirect("http://www.javatpoint.com"); 
		response.sendRedirect("Servlet3");
		 
		System.out.println("--------Console : Servlet2 End--------"); 
		       out.println("--------Browser : Servlet2 End --------<br>"); 
	}

}
