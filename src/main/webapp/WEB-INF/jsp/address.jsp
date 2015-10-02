<%--
  Created by IntelliJ IDEA.
  User: mikitjuk
  Date: 02.10.15
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Address book</title>
</head>
<body>
<form:form action="address.do" method="POST" commandName="address">
    <table border="1">
        <tr>
            <td>country id</td>
            <td><form:input path="id_country"/></td>
        </tr>
        <tr>
            <td>city id</td>
            <td><form:input path="id_city"/></td>
        </tr>
        <tr>
            <td>street id</td>
            <td><form:input path="id_street"/></td>
        </tr>
        <tr>
            <td>build id</td>
            <td><form:input path="id_build"/></td>
        </tr>
        <tr>
            <td>phone id</td>
            <td><form:input path="id_phone"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="action" value="create"/>
                <input type="submit" name="action" value="read"/>
                <input type="submit" name="action" value="update"/>
                <input type="submit" name="action" value="delete"/>
            </td>
        </tr>

    </table>

</form:form>
<br>
<table border="1">
    <th>id</th>
    <th>country</th>
    <th>city</th>
    <th>street</th>
    <th>build</th>
    <th>phone</th>
    <c:forEach items="${addressAll}" var="address">
        <tr>
            <td>${address.id}</td>
            <td>${address.countryByIdCountry.name}</td>
            <td>${address.cityByIdCity.name}</td>
            <td>${address.streetByIdStreet.name}</td>
            <td>${address.buildingByIdBuild.number}</td>
            <td>${address.phoneByIdPhone.value}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
