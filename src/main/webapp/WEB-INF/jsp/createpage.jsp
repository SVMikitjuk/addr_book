<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Create New Person</h1>

<c:url var="saveUrl" value="/address/create" />
<form:form modelAttribute="addressAttribute" method="POST" action="${saveUrl}">
    <table border="1">
        <tr>
            <td>country</td>
            <td><form:input path="country"/></td>
        </tr>
        <tr>
            <td>city</td>
            <td><form:input path="city"/></td>
        </tr>
        <tr>
            <td>street</td>
            <td><form:input path="street"/></td>
        </tr>
        <tr>
            <td>build</td>
            <td><form:input path="build"/></td>
        </tr>
        <tr>
            <td>phone</td>
            <td><form:input path="phone"/></td>
        </tr>

    </table>

    <input type="submit" value="Save" />
</form:form>

</body>
</html>