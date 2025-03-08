<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.*"%>
      <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
<h1>Help page</h1>
<%
String name=(String)request.getAttribute("name");
Integer roll=(Integer)request.getAttribute("rollNumber");

%>
<h1>name is <%=name%></h1>
<h1>number is <%=roll%></h1>
<%-- method 2 using jsp expression language --%>
${name}
${rollNumber}

</body>
</html>