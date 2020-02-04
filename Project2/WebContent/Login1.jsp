<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 String message = (String)request.getAttribute("error");
 if(message != null){
 out.println(message); 
 }%>
      
      
      <form action="login" method="post">



		<table>
			<tr>
				<td><font face="verdana" size="2px">Name:</font></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><font face="verdana" size="2px">Password:</font></td>
				<td><input type="password" name="Password"></td>
			</tr>
		</table>
		<input type="submit" value="Login">
	</form>

</body>
</html>