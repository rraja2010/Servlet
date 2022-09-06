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
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

public class Filter3 implements Filter
{
	private FilterConfig c1;

	@Override
	public void init(FilterConfig config) throws ServletException
	{
		c1 = config;
		System.out.println("Filter3-init()");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		out.println("Filter3-begin</br>");
		System.out.println("Filter3-begin");

		Enumeration<String> names = c1.getInitParameterNames();

		String name, value;

		while (names.hasMoreElements())
		{
			name = names.nextElement();
			value = c1.getInitParameter(name);
			out.print(name + ":" + value + "</br>");
			System.out.println(name + ":" + value);
		}

		chain.doFilter(request, response);
		
		out.println("Filter3-end</br>");
		System.out.println("Filter3-end");
	}

	@Override
	public void destroy()
	{
		System.out.println("Filter3-destroy()");
	}
}
