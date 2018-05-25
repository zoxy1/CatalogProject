<!-- обратите внимание на spring тэги -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>

<head>
  <title>Index Page</title>
</head>

<body>
<spring:form method="post"  modelAttribute="insuranceCompanyJSP" action="saveJSP">
Введите данные страховой организации:<br/>
  Имя: <spring:input path="name"/> <br/>
  ИНН: <spring:input path="INN"/>   <br/>
  ОГРН: <spring:input path="OGRN"/>   <br/>
  Адрес: <spring:input path="address"/>   <br/>
  <spring:button>Добавить</spring:button>
<br/>
</spring:form>
<div>
  <button onclick="location.href='/showCatalogJSP'">Показать список</button>
</div>

</body>

</html>
