package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet7 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		Cookie[] x = request.getCookies();
		if (x != null)
		{
			for (Cookie c1 : x)
			{
				out.println(c1.getName() + ":" +c1.getValue());
				System.out.println(c1.getName() + ":" + c1.getValue());
			}
		} else
		{
			out.println("No cookies available");
		}

		String s3 = request.getParameter("param3");
		String s4 = request.getParameter("param4");

		out.println("Param3=" + s3 + " : Param4="+s4);
		System.out.println("Param3=" + s3 + " : Param4="+s4);
	}
}
