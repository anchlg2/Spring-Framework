<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.*"%>
      <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<h1>Index page</h1>
<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
List<String> friends=(List<String>)request.getAttribute("list");
%>
<h1>Name is <%=name%> </h1>
<h1>Id is <%=id%> </h1>
<h1>friends are</h1>
<%

for(String s:friends)
{
%>

<p><%=s%></p>
<%
}
%>

<%-- method 2 using jsp expression language --%>
${name}
${id}
${list}
</body>
</html>