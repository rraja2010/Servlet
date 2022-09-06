package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{
	//doGet/doPost
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		out.println("Parameter1=" + s1 + "<br>");
		out.println("Parameter2=" + s2 + "<br>");

		System.out.println("Parameter1=" + s1);
		System.out.println("Parameter2=" + s2);

		response.setContentType("text/html");
		
		out.println("<form action='Servlet5?param1=" + s1 + "&param2=" + s2
				+ "'  method ='GET'>");//METHOD = GET/POST
		out.println("Paramter3:<input type='text' name='param3'/ ></br>");
		out.println("Paramter4:<input type='text' name='param4'/ ></br>");
		out.println("<input type='submit' value='submit'/ >");
		out.println("</form>");

	}
}
