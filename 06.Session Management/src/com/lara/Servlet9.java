package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet9  extends HttpServlet
{
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException
		{
				PrintWriter out = response.getWriter();
				
				HttpSession session = request.getSession();
				
				String s1 = (String)session.getAttribute("param1");
				String s2 = (String)session.getAttribute("param2");
				
				
				String s3 = request.getParameter("param3");
				String s4 = request.getParameter("param4");
				
				out.println("Parameter1="+s1+"<br>");
				out.println("Parameter2="+s2+"<br>");
				out.println("Parameter3="+s3+"<br>");
				out.println("Parameter4="+s4+"<br>");
				
				out.println("Servlet9-->Session id="+session.getId()+"<br>");
				out.println("isNew="+session.isNew()+"<br>");
		}
}
