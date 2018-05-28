<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Информация о страховых организациях</title>
</head>
<body>
<c:forEach items="${organizationsShowJSP}" var="org">
    <tr>
        <td>${org.idOrg}</td>
        <td>${org.nameOrg}</td>
        <td>${org.inn}</td>
        <td>${org.ogrn}</td>
        <td>${org.address}</td>
    </tr>
    <br/>
</c:forEach>
<br/>
</body>
</html>
