<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FF8040">
<h2><a href="uploadfile.jsp">Upload any file in define</a></h2>
<%
if(session.getAttribute("uploadFile")!=null
&&!(session.getAttribute("uploadFile")).equals("")){
%>
<h3>Upload File</h3>
<br>
<%=session.getAttribute("success") %>
<br>
<%=session.getAttribute("uploadFile") %>
<%session.removeAttribute("uploadFile");
}
%>
</body>
</html>