package com.lara;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet6 extends HttpServlet
{
		@Override
		public void init(ServletConfig config) throws ServletException
		{
			super.init(config);
			System.out.println("init(ServletConfig config)");
		}
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
		{
				System.out.println("doGet()");
				
				ServletContext sc = getServletContext();
				
				System.out.println("done");
		}
}
