package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		ServletContext sc = getServletContext();

		String s1 = sc.getInitParameter("name");
		String s2 = sc.getInitParameter("address");
		String s3 = sc.getInitParameter("mobile");

		System.out.println("name=" + s1);
		System.out.println("address=" + s2);
		System.out.println("mobile=" + s3);

		out.println("name=" + s1 + "<br>");
		out.println("address=" + s2 + "<br>");
		out.println("mobile=" + s3 + "<br>");

		System.out.println("done");

	}
}
