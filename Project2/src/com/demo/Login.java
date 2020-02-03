package com.demo;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet  
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		res.setContentType("text/html");
		String username=req.getParameter("username");
		String password=req.getParameter("Password");
		LoginService ls=new LoginService();
		String result= ls.validateLogin(username, password);
		RequestDispatcher rd = null;
		
		rd = req.getRequestDispatcher("Result.jsp");
		
		req.setAttribute("result", result);
		rd.forward(req, res);
		
	}
  
}