<%@page import="com.demo.LoginPojo" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<BODY>
<%
LoginPojo user =(LoginPojo)request.getAttribute("loginDetails");

//out.println("<h2><font color='green'>Login Suceess!!</font></h2>");
%>
<h2>
<font color='green'>Welcome <%=user.getRole()%>!!! Login Successful!!!
</font>
</h2>

</BODY>
</html>