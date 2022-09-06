package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5A extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");

		System.out.println("--------Console : Servlet5A Begin--------");
		       out.println("--------Browser : Servlet5A Begin --------<br>");

		System.out.println("Console : Servlet5A : Parameter = " + s1);
		       out.println("Browser : Servlet5A : Parameter = " + s1 + "<br>");

		String revParam5A = new StringBuffer(s1).reverse().toString();
		// Setting the revParam1 in response object
		request.setAttribute("result", revParam5A);

		// By Using Relative way
		RequestDispatcher rd = request.getRequestDispatcher("Servlet5B");
		// Sending the request & response object to Servlet2
		//rd.forward(request, response);
		rd.include(request, response);
		System.out.println("--------Console : Servlet5A End--------");
		       out.println("--------Browser : Servlet5A End --------<br>");

	}
}
