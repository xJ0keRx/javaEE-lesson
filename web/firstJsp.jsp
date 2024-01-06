<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: osnov
  Date: 06.01.2024
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First Jsp</title>
</head>
<body>
    <h1>My first Jsp</h1>
<p>
    <%@ page import="java.util.Date, logic.TestClass" %>

    <% TestClass testClass = new TestClass(); %>
    <%=
        new Date() + " <p> " + testClass.getInfo() + "</p>"
    %>

</p>
</body>
</html>
