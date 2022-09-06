package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5C extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();

		System.out.println("--------Console : Servlet5C Begin--------");
		       out.println("--------Browser : Servlet5C Begin --------<br>");

		// Reading Form data by using same request object
		String s3 = request.getParameter("param1");

		System.out.println("Console : Servlet5C : Parameter = " + s3);
		       out.println("Browser : Servlet5C : Parameter = " + s3 + "<br>");

		// Reading the revParam from Servlet1 request object
		String revParam3 = (String) request.getAttribute("result");

		System.out.println("Console : Servlet5C : revParam5C = " + revParam3);
		       out.println("Browser : Servlet5C : revParam5C = " + revParam3 + "<br>");

		System.out.println("--------Console : Servlet5C End--------");
		       out.println("--------Browser : Servlet5C End --------<br>");
	}

}
