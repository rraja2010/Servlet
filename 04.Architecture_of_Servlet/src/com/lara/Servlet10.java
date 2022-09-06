package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet10 extends HttpServlet
{
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		
		super.init(config);
		System.out.print("This is init((ServletConfig config)");
		
		ServletContext context =  getServletConfig().getServletContext(); 
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
                   throws ServletException, IOException 
      {

		PrintWriter out = response.getWriter();

		System.out.println("This is doGet() method");
	}

}
