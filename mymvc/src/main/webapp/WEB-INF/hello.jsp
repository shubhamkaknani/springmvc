<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My web</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/displayName" method="get">
<input type ="text" name="firstname">
<input type= "submit" value ="Submit">

</form>
<a href="<%= request.getContextPath() %>/apple"> Apple page </a>
Hello World
</body>
</html>