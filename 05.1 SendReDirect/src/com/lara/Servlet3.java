package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter(); 
		 
		System.out.println("--------Console : Servlet3 Begin--------"); 
		       out.println("--------Browser : Servlet3 Begin --------<br>"); 
		 
		//Reading Form data by using same request object 
		String s3 = request.getParameter("param1"); 
		System.out.println("Console : Servlet3 : Parameter = " + s3); 
		       out.println("Browser : Servlet3 : Parameter = " + s3 + "<br>"); 
		 
		// Reading the revParam from Servlet1 request object 
		String revParam3 = (String) request.getAttribute("result");   
		 
		System.out.println("Console : Servlet3 : revParam3 = " + revParam3); 
		       out.println("Browser : Servlet3 : revParam3 = " + revParam3 + "<br>");
		 
		System.out.println("--------Console : Servlet3 End--------"); 
		       out.println("--------Browser : Servlet3 End --------<br>"); 
	}
}
