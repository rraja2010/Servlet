package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet
{	
	
		
		@Override
		public void init(ServletConfig config) throws ServletException
		{
				System.out.println("init(ServletConfig config)");
		}
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
		{
					System.out.println("doGet()");
					doPerform(request,response);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException
			{
						System.out.println("doPost()");
						doPerform(request,response);
			}
		
		
		public void doPerform(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
				System.out.println("doPerform()");
		}
		
		
		@Override
		public void destroy()
		{
				System.out.println("destroy()");
		}
		
		
}	
