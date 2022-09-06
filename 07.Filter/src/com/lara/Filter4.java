package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter4 implements Filter
{
	private FilterConfig c1;

	@Override
	public void init(FilterConfig config) throws ServletException
	{
		c1 = config;
		System.out.println("Filter4-init()");

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		out.println("Filter4-begin</br>");
		System.out.println("Filter4-begin");

		ServletContext context = c1.getServletContext();
		
		
		Enumeration<String> names =context.getInitParameterNames();

		String name, value;

		while (names.hasMoreElements())
		{
			name = names.nextElement();
			value = context.getInitParameter(name);
			out.print(name + " : " + value + "</br>");
			System.out.println(name + "  : " + value);
		}

		chain.doFilter(request, response);
		out.println("Filter4-end</br>");
		System.out.println("Filter4-end");
	}

	@Override
	public void destroy()
	{
		System.out.println("Filter4-destroy()");
	}
}
