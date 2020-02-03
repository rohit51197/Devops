<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<BODY>
<%
	String resultdata = (String) request.getAttribute("result");
	if(resultdata.equals("success"))
	{
		out.println("Successful");
	}
	else
	{
		out.println("failed");
	}
%>
</BODY>
</html>