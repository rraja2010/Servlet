package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Amit extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		out.println("Amit start");
		
		String name = request.getParameter("name");
		StringBuffer bf = new StringBuffer(name);
		String rev = bf.reverse().toString();
		
		request.setAttribute("reverse",rev);
		
		RequestDispatcher rd = request.getRequestDispatcher("Raja");	
		rd.forward(request, response);
		//rd.include(request, response);
		
		
		/*ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/Raja");
		//rd.forward(request, response);
		rd.include(request, response);*/
		
		out.println("Amit end");
		
	}

}
