package com.lara;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpServlet extends GenericServlet
{
	private static final long serialVersionUID = 1L;
	private static final String METHOD_DELETE = "DELETE";
	private static final String METHOD_HEAD = "HEAD";
	private static final String METHOD_GET = "GET";
	private static final String METHOD_OPTIONS = "OPTIONS";
	private static final String METHOD_POST = "POST";
	private static final String METHOD_PUT = "PUT";
	private static final String METHOD_TRACE = "TRACE";
	private static final String HEADER_IFMODSINCE = "If-Modified-Since";
	private static final String HEADER_LASTMOD = "Last-Modified";
	private static final String LSTRING_FILE = "javax.servlet.http.LocalStrings";
	private static ResourceBundle lStrings = ResourceBundle
			.getBundle("javax.servlet.http.LocalStrings");

	public HttpServlet()
	{
	}

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String protocol = req.getProtocol();
		String msg = lStrings.getString("http.method_get_not_supported");
		if (protocol.endsWith("1.1"))
		{
			resp.sendError(405, msg);
		} else
		{
			resp.sendError(400, msg);
		}
	}

	protected long getLastModified(HttpServletRequest req)
	{
		return -1L;
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String protocol = req.getProtocol();
		String msg = lStrings.getString("http.method_post_not_supported");
		if (protocol.endsWith("1.1"))
		{
			resp.sendError(405, msg);
		} else
		{
			resp.sendError(400, msg);
		}
	}

	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String protocol = req.getProtocol();
		String msg = lStrings.getString("http.method_put_not_supported");
		if (protocol.endsWith("1.1"))
		{
			resp.sendError(405, msg);
		} else
		{
			resp.sendError(400, msg);
		}
	}

	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String protocol = req.getProtocol();
		String msg = lStrings.getString("http.method_delete_not_supported");
		if (protocol.endsWith("1.1"))
		{
			resp.sendError(405, msg);
		} else
		{
			resp.sendError(400, msg);
		}
	}

	private static Method[] getAllDeclaredMethods(Class c)
	{
		if (c.equals(""))//javax / servlet / http / HttpServlet
		{
			return null;
		}
		Method parentMethods[] = getAllDeclaredMethods(c.getSuperclass());
		Method thisMethods[] = c.getDeclaredMethods();
		if (parentMethods != null && parentMethods.length > 0)
		{
			Method allMethods[] = new Method[parentMethods.length
					+ thisMethods.length];
			System.arraycopy(parentMethods, 0, allMethods, 0,
					parentMethods.length);
			System.arraycopy(thisMethods, 0, allMethods, parentMethods.length,
					thisMethods.length);
			thisMethods = allMethods;
		}
		return thisMethods;
	}

	protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		Method methods[] = getAllDeclaredMethods(getClass());
		boolean ALLOW_GET = false;
		boolean ALLOW_HEAD = false;
		boolean ALLOW_POST = false;
		boolean ALLOW_PUT = false;
		boolean ALLOW_DELETE = false;
		boolean ALLOW_TRACE = true;
		boolean ALLOW_OPTIONS = true;
		for (int i = 0; i < methods.length; i++)
		{
			Method m = methods[i];
			if (m.getName().equals("doGet"))
			{
				ALLOW_GET = true;
				ALLOW_HEAD = true;
			}
			if (m.getName().equals("doPost"))
			{
				ALLOW_POST = true;
			}
			if (m.getName().equals("doPut"))
			{
				ALLOW_PUT = true;
			}
			if (m.getName().equals("doDelete"))
			{
				ALLOW_DELETE = true;
			}
		}

		String allow = null;
		if (ALLOW_GET)
		{
			allow = "GET";
		}
		if (ALLOW_HEAD)
		{
			if (allow == null)
			{
				allow = "HEAD";
			} else
			{
				allow = (new StringBuilder()).append(allow).append(", HEAD")
						.toString();
			}
		}
		if (ALLOW_POST)
		{
			if (allow == null)
			{
				allow = "POST";
			} else
			{
				allow = (new StringBuilder()).append(allow).append(", POST")
						.toString();
			}
		}
		if (ALLOW_PUT)
		{
			if (allow == null)
			{
				allow = "PUT";
			} else
			{
				allow = (new StringBuilder()).append(allow).append(", PUT")
						.toString();
			}
		}
		if (ALLOW_DELETE)
		{
			if (allow == null)
			{
				allow = "DELETE";
			} else
			{
				allow = (new StringBuilder()).append(allow).append(", DELETE")
						.toString();
			}
		}
		if (ALLOW_TRACE)
		{
			if (allow == null)
			{
				allow = "TRACE";
			} else
			{
				allow = (new StringBuilder()).append(allow).append(", TRACE")
						.toString();
			}
		}
		if (ALLOW_OPTIONS)
		{
			if (allow == null)
			{
				allow = "OPTIONS";
			} else
			{
				allow = (new StringBuilder()).append(allow).append(", OPTIONS")
						.toString();
			}
		}
		resp.setHeader("Allow", allow);
	}

	protected void doTrace(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String CRLF = "\r\n";
		StringBuilder buffer = (new StringBuilder("TRACE "))
				.append(req.getRequestURI()).append(" ")
				.append(req.getProtocol());
		String headerName;
		for (Enumeration reqHeaderEnum = req.getHeaderNames(); reqHeaderEnum
				.hasMoreElements(); buffer.append(CRLF).append(headerName)
				.append(": ").append(req.getHeader(headerName)))
		{
			headerName = (String) reqHeaderEnum.nextElement();
		}

		buffer.append(CRLF);
		int responseLength = buffer.length();
		resp.setContentType("message/http");
		resp.setContentLength(responseLength);
		ServletOutputStream out = resp.getOutputStream();
		out.print(buffer.toString());
		out.close();
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String method = req.getMethod();
		if (method.equals("GET"))
		{
			long lastModified = getLastModified(req);
			if (lastModified == -1L)
			{
				doGet(req, resp);
			} else
			{
				long ifModifiedSince;
				try
				{
					ifModifiedSince = req.getDateHeader("If-Modified-Since");
				} catch (IllegalArgumentException iae)
				{
					ifModifiedSince = -1L;
				}
				if (ifModifiedSince < (lastModified / 1000L) * 1000L)
				{
					maybeSetLastModified(resp, lastModified);
					doGet(req, resp);
				} else
				{
					resp.setStatus(304);
				}
			}
		} else if (method.equals("HEAD"))
		{
			long lastModified = getLastModified(req);
			maybeSetLastModified(resp, lastModified);
			
		} else if (method.equals("POST"))
		{
			doPost(req, resp);
		} else if (method.equals("PUT"))
		{
			doPut(req, resp);
		} else if (method.equals("DELETE"))
		{
			doDelete(req, resp);
		} else if (method.equals("OPTIONS"))
		{
			doOptions(req, resp);
		} else if (method.equals("TRACE"))
		{
			doTrace(req, resp);
		} else
		{
			String errMsg = lStrings.getString("http.method_not_implemented");
			Object errArgs[] = new Object[1];
			errArgs[0] = method;
			errMsg = MessageFormat.format(errMsg, errArgs);
			resp.sendError(501, errMsg);
		}
	}

	private void maybeSetLastModified(HttpServletResponse resp,
			long lastModified)
	{
		if (resp.containsHeader("Last-Modified"))
		{
			return;
		}
		if (lastModified >= 0L)
		{
			resp.setDateHeader("Last-Modified", lastModified);
		}
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException
	{
		HttpServletRequest request;
		HttpServletResponse response;
		try
		{
			request = (HttpServletRequest) req;
			response = (HttpServletResponse) res;
		} catch (ClassCastException e)
		{
			throw new ServletException("non-HTTP request or response");
		}
		service(request, response);
	}

}
