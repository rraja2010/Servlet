package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter5 implements Filter
{
		@Override
		public void init(FilterConfig arg0) throws ServletException
		{
			System.out.println("Filter5-init()");
		}
		
		
		@Override
		public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
		{
			PrintWriter out = response.getWriter();
			
			System.out.println("Filter5-begin");
			out.println("Filter5-begin</br>");
			
			chain.doFilter(request, response);
			
			System.out.println("Filter5-end");
			out.print("Filter5-end</br>");
		}
		
		
		@Override
		public void destroy()
		{
				System.out.println("destroy()");
		}
}
