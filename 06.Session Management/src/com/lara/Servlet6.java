package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet6 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		Cookie c1 = new Cookie("param1", s1);
		Cookie c2 = new Cookie("param2", s2);
		
		/*c1.setComment("Cookies Program ");
		c1.setDomain("HTTP");
		c1.setSecure(true);
		c1.setVersion(1);
		*/
		response.addCookie(c1);
		response.addCookie(c2);
		
		
		 c1.setMaxAge(5);//in second
		 c2.setMaxAge(5);
	
		//Creating and adding more cookies object in the response.
		/*Cookie c3 =null;
		
		for (int i = 0; i < 10; i++)
		{
			c3 = new Cookie("Cookie"+i, "amitCookies->"+i);
			response.addCookie(c3);
		}*/
		
		out.println("<form action='Servlet7'>");
		out.println("Paramter3:<input type='text' name='param3'/ ></br>");
		out.println("Paramter4:<input type='text' name='param4'/ ></br>");
		out.println("<input type='submit' value='submit'/ >");
		out.println("</form>");
		
		System.out.println("******* Cookies information ************");
		System.out.println("Commetns 	:"+c1.getComment());
		System.out.println("Domain		:"+c1.getDomain());
		System.out.println("Max Age 	:"+c1.getMaxAge());
		System.out.println("Name		:"+c1.getName());
		System.out.println("Path		:"+c1.getPath());
		System.out.println("Value		:"+c1.getValue());
		System.out.println("Version		:"+c1.getVersion());
		System.out.println("Class		:"+c1.getClass().getName());
		System.out.println("Secure		:"+c1.getSecure());
	}
}
