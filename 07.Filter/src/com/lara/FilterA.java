package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterA implements Filter
{
	@Override
	public void init(FilterConfig config) throws ServletException
	{
		System.out.println(config.getFilterName());
		System.out.println(config.getInitParameter("fname"));
		System.out.println(config.getInitParameter("lname"));

		// Enumeration e = config.getInitParameterNames();
		// while(e.hasMoreElements())
		// {
		// System.out.println(e.nextElement());
		// }

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException
	{
		System.out.println("doFilter()");
		PrintWriter out = response.getWriter();
		out.print("from doFileter()");
	}

	@Override
	public void destroy()
	{
		System.out.println("destroy()");
	}
}
