package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.ws.Response;

public class Filter1 implements Filter {

	String company = null;

	public Filter1() {
		System.out.println("Filter1()");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("From Filter1 init(-)");

		company = config.getInitParameter("Company");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		       
		      out.println("Fileter1-begin");
		System.out.println("Filter1-begin");
		
		//Before doFilter Pre - Execution
		chain.doFilter(request, response);
		//After doFilter post - Execution
		
			   out.println("Filter1-end>");
		System.out.println("Filter1-end");
	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
}
