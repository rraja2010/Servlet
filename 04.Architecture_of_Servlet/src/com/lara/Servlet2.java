package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		System.out.println("from doPost()");

		out.println("from doPost()<br>");
		out.println("s1=" + s1 + "<br>");
		out.println("s3=" + s2 + "<br>");

		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);

	}
}
