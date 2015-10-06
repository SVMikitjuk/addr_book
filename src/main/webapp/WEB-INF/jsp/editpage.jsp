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

<h1>Edit Address</h1>

<c:url var="saveUrl" value="/address/edit?id=${addressAttribute.id}" />
<form:form modelAttribute="addressAttribute" method="POST" action="${saveUrl}">
	<table>
		<tr>
			<td><form:label path="id">Id:</form:label></td>
			<td><form:input path="id" disabled="true"/></td>
		</tr>
        <tr>
            <td width="50">country</td>
            <td>
            <select name="country" width="50">
                <c:forEach var="item" items="${countryList}">
                    <option>
                        <%--<c:out value="${item.id}" />--%>
                        <c:out value="${item.name}" />
                    </option>
                </c:forEach>
            </select>
            </td>
        </tr>
        <tr>
            <td width="50">country</td>
            <td>
                <select name="city" width="50">
                    <c:forEach var="item" items="${cityList}">
                        <option>
                            <c:out value="${item.name}" />
                        </option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td width="50">street</td>
            <td>
                <select name="street" width="50">
                    <c:forEach var="item" items="${streetList}">
                        <option>
                            <c:out value="${item.name}" />
                        </option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td width="50">build</td>
            <td>
                <select name="build" width="50">
                    <c:forEach var="item" items="${buildList}">
                        <option>
                            <c:out value="${item.name}" />
                        </option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td width="50">build</td>
            <td>
                <select name="phone" width="50">
                    <c:forEach var="item" items="${phoneList}">
                        <option>
                            <c:out value="${item.name}" />
                        </option>
                    </c:forEach>
                </select>
            </td>
        </tr>

	</table>
	
	<input type="submit" value="Save" />
</form:form>

</body>
</html>