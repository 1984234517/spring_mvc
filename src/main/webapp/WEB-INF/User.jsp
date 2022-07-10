<%--
  Created by IntelliJ IDEA.
  User: 谭小
  Date: 2022/6/25
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page import="com.itranswarp.learnjava.bean.*"%>--%>

<%@ page import="model.User1" %>
<%
    User1 user = (User1) request.getAttribute("user1");
%>
<html>
<head>
    <title>Hello World - JSP</title>
</head>
<body>
<h1>Hello <%= user.name %>!</h1>
<p>School Name:
    <span style="color:red">
        <%= user.school.name %>
    </span>
</p>
<p>School Address:
    <span style="color:red">
        <%= user.school.address %>
    </span>
</p>
</body>
</html>
