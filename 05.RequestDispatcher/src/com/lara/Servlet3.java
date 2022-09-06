package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out = response.getWriter();
		
		System.out.println("--------Console : Servlet3 Begin--------");
		       out.println("--------Browser : Servlet3 Begin --------<br>");

		String s1 = request.getParameter("param1");

		System.out.println("Console : Servlet3 : Parameter = " + s1);
		       out.println("Browser : Servlet3 : Parameter = " + s1 + "<br>");

		
		String revParam1 = new StringBuffer(s1).reverse().toString();
		
	
		// Setting the revParam1 in request object
		request.setAttribute("result", revParam1);
		
		
		/*//We can follow any one of the way
		//1. Using Relative way
		 RequestDispatcher rd = request.getRequestDispatcher("Servlet4");
		
		 //Sending the request & response object to Servlet4
		 rd.forward(request, response);
		 rd.include(request, response);*/
		 
		 
		 
		// 2. Using Absolute way
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/Servlet4");
		//RequestDispatcher rd1=getServletContext().getRequestDispatcher("/Servlet4");
		//rd.forward(request, response);
		rd.include(request, response);
		 
		System.out.println("--------Console : Servlet3 End--------");
		       out.println("--------Browser : Servlet3 End --------<br>");
	}

}
