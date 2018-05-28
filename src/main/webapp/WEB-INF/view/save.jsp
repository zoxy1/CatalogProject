<%@ page session="false" isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Сохранение в базу</title>
</head>

Добавлено в базу:
<br/>
<table>
        <tr>Название: ${organizationJSP.nameOrg}<tr/>
        <br/>
        <tr>ИНН: ${organizationJSP.inn}<tr/>
        <br/>
        <tr>ОГРН: ${organizationJSP.ogrn}</tr>
        <br/>
        <tr>Адрес: ${organizationJSP.address}</tr>
</table>
<br/>
<div>
    <button onclick="location.href='/'">Назад</button>
</div>

<br/>
</body>
</html>
