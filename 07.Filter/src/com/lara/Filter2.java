package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter2 implements Filter {
	public Filter2() {
		System.out.println("Filter2()");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("Filter2-init");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
				 out.print("Fileter2-begin");
		System.out.println("Filter2-begin");

		chain.doFilter(request, response);

		         out.print("Filter2-end");
		         out.println();
		System.out.println("Filter2-end");
	}

	@Override
	public void destroy() {
		System.out.println("Filter2-destroy()");
	}
}
