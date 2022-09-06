package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		String s1 = getInitParameter("name");
		String s2 = getInitParameter("add");
		String s3 = getInitParameter("mobile");
		String s4 = getInitParameter("gender");

		System.out.println("name=" + s1);
		System.out.println("add=" + s2);
		System.out.println("mobile=" + s3);
		System.out.println("gender=" + s4);

		out.println("name=" + s1 + "<br>");
		out.println("add=" + s2 + "<br>");
		out.println("mobile=" + s3 + "<br>");
		out.println("gender=" + s4 + "<br>");
		
		System.out.println("=====================");
		
		ServletConfig sc = getServletConfig();
		String s11 = sc.getInitParameter("name");
		String s21 = sc.getInitParameter("add");
		String s31 = getInitParameter("mobile");
		String s41 = getInitParameter("gender");
		System.out.println(s11);
		System.out.println(s21);
		System.out.println(s31);
		System.out.println(s41);
		
		System.out.println("==============================");
		
		Enumeration <String>em = sc.getInitParameterNames();
		String name ,value;
		
		System.out.println("==="+em.toString());
		while(em.hasMoreElements())
		{
			name = em.nextElement();
			value= sc.getInitParameter(name);
			System.out.println(name+"::"+value);
		}
		
		System.out.println("done");
	}
}
