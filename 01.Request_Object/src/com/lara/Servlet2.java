package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		//String[] s1 = request.getParameterValues("habits");
		String[] s1 = request.getParameterValues("add");
		PrintWriter out = response.getWriter();
		System.out.println(Arrays.toString(s1));
		out.print(Arrays.toString(s1));
	}
}

/*
--	The method getParameterValues() will generally came into picture if there is a chance of 
--	getting multiple values for any input parameter, 
--	this method will retrieve all of it values and store as string array.
*/