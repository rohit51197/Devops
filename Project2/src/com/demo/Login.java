package com.demo;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
String userName = request.getParameter("username");
String password = request.getParameter("Password");

LoginPojo loginPojo = new LoginPojo();
loginPojo.setUsername(userName);
loginPojo.setPassword(password);

LoginService loginservice = new LoginService();
loginPojo = loginservice.validateLogin(loginPojo);

if (loginPojo.getRole() == null) {
RequestDispatcher requestdispatcher = request.getRequestDispatcher("Login1.jsp");
request.setAttribute("error", "Invalid Username/Password");
requestdispatcher.forward(request, response);

} else {
RequestDispatcher requestDispatcher = request.getRequestDispatcher("Result.jsp");
request.setAttribute("loginDetails", loginPojo);
requestDispatcher.forward(request, response);
}

// PrintWriter out = response.getWriter();
/*
* RequestDispatcher requestDispatcher= null; requestDispatcher =
* request.getRequestDispatcher("Result.jsp");
*
* LoginService loginService = new LoginService(); String result =
* loginService.validateLogin(userName , password);
* request.setAttribute("result", result); requestDispatcher.forward(request,
* response);
*/

/*
* if (userName.equals("admin") && password.equals("admin")) {
* request.setAttribute("result", "success"); //requestDispatcher =
* request.getRequestDispatcher("Success.html");
* //out.println("<h2><font color='green'>Login Suceess!!</font></h2>");
*
* } else { request.setAttribute("result", "failure"); //requestDispatcher =
* request.getRequestDispatcher("Failure.html");
* //out.println("<h2><font color='red'>Login Failed!!!</font></h2>"); }
*/

}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}