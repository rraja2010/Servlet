package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet
{
	//doGet/doPost
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
				PrintWriter out = response.getWriter();
				
				String s1 = request.getParameter("param1");
				String s2 = request.getParameter("param2");
				String s3 = request.getParameter("param3");
				String s4 = request.getParameter("param4");
				
				String s = request.getQueryString();//param1=amit&param2=khalid
				System.out.println("query String="+s);
				String[] x=s.split("&");
				String s11=x[0];
				String s12=x[1];
				System.out.println(Arrays.toString(x));
				
				
				out.println("Paramter1="+s1+"<br>");
				out.println("Paramter2="+s2+"<br>");
				out.println("Paramter3="+s3+"<br>");
				out.println("Paramter4="+s4+"<br>");
				
				System.out.println("Paramter1="+s1);
				System.out.println("Paramter2="+s2);
				System.out.println("Paramter3="+s3);
				System.out.println("Paramter4="+s4);
	}
}
