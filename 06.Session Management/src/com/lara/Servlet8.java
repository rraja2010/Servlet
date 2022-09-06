package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet8 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		//ServletOutputStream rs =response.getOutputStream();
		
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		out.println("Parameter1: " + s1 + "<br>");
		out.println("Parameter2: " + s2 + "<br>");

		HttpSession session = request.getSession();

		out.println("Servlet9-->Session id="+session.getId()+"<br>");
		out.println("isNew="+session.isNew()+"<br>");

		session.setAttribute("param1", s1);
		session.setAttribute("param2", s2);
		
		//session.setMaxInactiveInterval(1);//in second
		
		/*  
		  HttpSession internally using the cookies mechanism to handle the
		  session if the cookies are disable then we will not handle the
		  session management through the HttpSession.
		  
		  but through the jsessionid we can handle the HttpSession even though
		  the cookie are disable
		  
		  better to get the url not supply the url to the form action.
		  */

		 String url = response.encodeURL("Servlet9");//3
		  out.println("url="+url);
		  out.println("<form action='"+url+"'>");

		// out.println("<form action='Servlet9'>");//1
		 //out.println("<form action='Servlet9;jsessionid="+session.getId()+" '>");
		//							  Servlet9;jsessionid=FC4CE9F627446889652AC5A22E505D7E
		
		out.println("Parameter3:<input type='text' name='param3'/><br>");
		out.println("Parameter4:<input type='text' name='param4'/><br>");
		out.println("<input type='submit' value='submit'/><br>");
		out.println("</form>");
		System.out.println("done");
	}
}
