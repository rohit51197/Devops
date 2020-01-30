<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Upload Example</title>
<script language="JavaScript">
function Validate()
{
var image =document.getElementById("image").value;
if(image==''){
alert("Please enter Image Path");
document.getElementById("image").focus();
return false;
}
}
</script>
</head>
<body bgcolor="#FF8040">
<form:form modelAttribute="uploadItem" name="frm" method="post"
enctype="multipart/form-data" onSubmit="return Validate();">
<fieldset><legend>Upload File</legend>
<table>
<tr>
<td><form:label for="fileData" path="fileData">File</form:label><br />
</td>
<td><form:input path="fileData" id="image" type="file" /></td>
</tr>
<tr>
<td><br />
</td>
<td><input type="submit" value="Upload" /></td>
</tr>
</table>
</fieldset>
</form:form>
</body>
</html>
