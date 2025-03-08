<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.*"%>
      <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h1>Success page</h1>
<%-- method 1 --%>
${mail}
${name}
${password}
<%-- method 2  --%>
${userDetails.getEmail()}
${userDetails.getName()}
${userDetails.getPassword()}
${userDetails}
<%-- method 3 model attribute  --%>
${User}
<%-- method 4 model attribute  --%>
${user}
</body>
</html>