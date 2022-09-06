package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		String revString1 = (String) request.getAttribute("result1");
		String revString2 = (String) request.getAttribute("result2");

		System.out.println("Servlet2-begin-sop");
		System.out.println("param1=" + s1);
		System.out.println("param2=" + s2);
		System.out.println("revString1=" + revString1);
		System.out.println("revString2=" + revString2);

		out.println("Servlet2-begin-out</br>");
		out.println("param1=" + s1 + "</br>");
		out.println("param2=" + s2 + "</br>");
		out.println("revString1=" + revString1 + "</br>");
		out.println("revString2=" + revString2 + "</br>");

		System.out.println("Servlet2-end-sop");
		out.println("Servlet2-end-out</br>");
	}
}
