<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Address book</title>
</head>
<body>
<br>
<c:url var="addUrl" value="/address/create" />
<table border="1">
    <thead>
    <tr>
    <th>id</th>
    <th>country</th>
    <th>city</th>
    <th>street</th>
        <th>build</th>
        <th>phone</th>
        <th colspan="3"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="address" items="${addressAll}">
        <c:url var="editRef" value="/address/edit?id=${address.id}" />
        <c:url var="deleteRef" value="/address/delete?id=${address.id}" />
        <tr>
            <td>${address.id}</td>
            <td>${address.addressComplex.country}</td>
            <td>${address.addressComplex.city}</td>
            <td>${address.addressComplex.street}</td>
            <td>${address.addressComplex.build}</td>
            <td>${address.phoneByIdPhone.value}</td>
            <td><a href="${editRef}">Edit</a></td>
            <td><a href="${deleteRef}">Delete</a></td>
            <td><a href="${addUrl}">Add</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
