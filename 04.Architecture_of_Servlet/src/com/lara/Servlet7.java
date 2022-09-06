package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet7 extends HttpServlet
{

	private ServletConfig config;

	public void init(ServletConfig config)
	{
		this.config = config;
		System.out.println("init(ServletConfig())");
		init();

	}

	public void init()
	{
		System.out.println("init()");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();

		out.print("This is service() method");
		System.out.println("service()");
	}

}
