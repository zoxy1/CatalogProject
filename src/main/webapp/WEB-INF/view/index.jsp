<!-- обратите внимание на spring тэги -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>

<head>
    <title>Index Page</title>
</head>

<body>
<spring:form method="post" modelAttribute="organizationJSP" action="save">
    Введите данные страховой организации для записи в БД:<br/>
    Имя: <spring:input path="nameOrg"/> <br/>
    ИНН: <spring:input path="inn"/> <br/>
    ОГРН: <spring:input path="ogrn"/> <br/>
    Адрес: <spring:input path="address"/> <br/>
    <spring:button>Добавить</spring:button>
    <br/>
</spring:form>

<spring:form method="post" modelAttribute="findParametersJSP" action="findOrganization">
    Введите любые данные страховой организации для поиска:<br/>
    <spring:input path="string"/>
    <spring:button>Найти</spring:button>
    <br/>
</spring:form>
<div>
    <button onclick="location.href='/showOrganizations'">Вывести все организации</button>
</div>

</body>

</html>
