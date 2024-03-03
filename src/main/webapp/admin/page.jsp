<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/01/2024
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
  <title>Login Success Page</title>
</head>
<body>
<%
  String message = null;
  String sessionID = null;
  Cookie[] cookies = request.getCookies();
  if(cookies != null){
    for(Cookie cookie : cookies){
      if(cookie.getName().equals("message")) message = cookie.getValue();
      if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
    }
  }
%>
<h3>Login Success</h3>
<h3>Dashboard</h3>
<h4><%=message%></h4>
<h4>Session ID = <%=sessionID %></h4>
<br>
<form action="batiments" method="post">
  <input type="submit" value="batiments" >
</form>
<br><br>
<form action="logout" method="post">
  <input type="submit" value="Deconnecter" >
</form>
</body>
</html>
