package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		/*Map map = request.getParameterMap();// returns all the values into the map 
											// with having the same key.

		String[] personName = (String[]) map.get("personName");
		String[] habits = (String[])map.get("habits");
		
		PrintWriter out = response.getWriter();
		
		System.out.println(Arrays.toString(personName));
		System.out.println(Arrays.toString(habits));
		out.println(Arrays.toString(personName));
		out.println(Arrays.toString(habits));
 */
	}
}
