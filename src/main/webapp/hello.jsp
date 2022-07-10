<%--
  Created by IntelliJ IDEA.
  User: 谭小
  Date: 2022/6/25
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>Hello World - JSP</title>
</head>
<body>
<%-- JSP Comment --%>
<h1>Hello World!</h1>
<p>
    <%
        out.println("Your IP address is ");
    %>
    <span style="color:red">
        <%= request.getRemoteAddr() %>
    </span>
</p>
<p>
    <%
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        out.println(formatter.format(date));
    %>
</p>
</body>
</html>
