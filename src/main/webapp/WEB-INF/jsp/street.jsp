<%--
  Created by IntelliJ IDEA.
  User: mikitjuk
  Date: 30.09.15
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<html>
<head>
    <title>Street maneger</title>
</head>
<body>
<form:form action="street.do" method="POST" commandName="street">
    <table>
        <tr>
            <td>Street id</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>Street name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="action" value="add"/>
                <input type="submit" name="action" value="read"/>
            </td>
        </tr>

    </table>

</form:form>
<br>
<table border="1">
    <th>id</th>
    <th>name</th>
    <c:forEach items="${streetAll}" var="street">
        <tr>
            <td>${street.id}</td>
            <td>${street.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
