package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		out.print("Servlet2-begin<br>");
		System.out.println("Servlet2-begin");
		
		//RequestDispatcher rd = request.getRequestDispatcher("Servlet3");
		//rd.forward(request, response);
		//rd.include(request, response);
		
		ServletContext sc = getServletContext();
		RequestDispatcher rd1=sc.getRequestDispatcher("/Servlet3");
		rd1.forward(request, response);
		//rd1.include(request, response);
		
		out.println("Servlet2-end</br>");
		System.out.println("servlet2-end");
	}
}
