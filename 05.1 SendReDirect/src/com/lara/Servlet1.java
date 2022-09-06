package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter(); 
		String s1 = request.getParameter("param1"); 
		 
		System.out.println("--------Console : Servlet1 Begin--------");
		System.out.println("Console : Servlet1 : Parameter = " + s1); 
		
		out.println("--------Browser : Servlet1 Begin --------<br>"); 
		out.println("Browser : Servlet1 : Parameter = " + s1 + "<br>");
		 
		String revParam = new StringBuffer(s1).reverse().toString(); 
		 
		request.setAttribute("result", revParam); 
		 
		response.sendRedirect("Servlet2"); 
		 
		System.out.println("--------Console : Servlet1 End--------"); 
		out.println("--------Browser : Servlet1 End --------<br>"); 
	}

}
