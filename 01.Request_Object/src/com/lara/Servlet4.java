package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String qs = request.getQueryString();
		out.print("query String: " + qs);
		// query String: param1=amit&param1=kumar&param1=ranchi

		System.out.println("queryString=" + qs);

		String[] s1 = qs.split("&");

		System.out.println(Arrays.toString(s1));
		out.println(Arrays.toString(s1));
	}
}
