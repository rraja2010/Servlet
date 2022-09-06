package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();

		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");

		System.out.println("Parameter1=" + s1);
		System.out.println("Parameter2=" + s2);

		out.println("Parameter1=" + s1 + "<br>");
		out.println("Parameter2=" + s2 + "<br>");
		
		response.setContentType("text/html");
		
		out.println("<form action='Servlet3'>");

		out.println("<input type='hidden' name ='param1' value='" + s1 + "'/>");
		out.println("<input type='hidden' name ='param2' value='" + s2 + "'/>");

		out.println("Paramter3:<input type='text' name='param3'/ ></br>");
		out.println("Paramter4:<input type='text' name='param4'/ ></br>");
		out.println("<input type='submit' value='submit'/ >");
		out.println("</form>");

	}
}

/*

Using Hidden Form Field for Session Management

--	Hidden form field can also be used to store session information for a particular client. 
	In case of hidden form field a hidden field is used to store client state. 
	In this case user information is stored in hidden field value and retrieved from another servlet. 

Advantages :

    Does not have to depend on browser whether the cookie is disabled or not.
    Inserting a simple HTML Input field of type hidden is required. Hence, its easier to implement.

Disadvantage :

    Extra form submission is required on every page. This is a big overhead.

Like we created a hidden field in First Servlet, populated the value of user, and sent it to the Second Servlet, 
now Second servlet also has the user information. 
Similarly we will have to keep sending this information, wherever we need this, using hidden fields.

*/
