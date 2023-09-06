<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>
its home page <br/>
<a href="<%=request.getContextPath()%>/controller?page=login" >Login</a><br/>
<a href="<%=request.getContextPath()%>/controller?page=Signup" >Sign up</a><br/>
<a href="<%=request.getContextPath()%>/controller?page=About" >About</a><br/>


</body>
</html>