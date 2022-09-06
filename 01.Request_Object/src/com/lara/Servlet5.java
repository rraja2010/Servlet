package com.lara;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		Enumeration names = request.getParameterNames();

		String name, value;
		//String[] values;

		while (names.hasMoreElements())
		{
			name = (String) names.nextElement();
			value = request.getParameter(name);

			out.print(name + "  :  " + value);
			System.out.println(name + " : " + value);

			/*values = request.getParameterValues(name);

			for (String s4 : values)
			{
				out.print(s4 + "<br>");
				System.out.println(s4);
			}
			System.out.println(Arrays.toString(values));
			out.print(Arrays.toString(values) + "<br>");
			System.out.println("......................");*/
		}
	}
}
