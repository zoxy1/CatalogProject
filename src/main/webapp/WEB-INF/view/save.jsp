<%@ page session="false" isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Сохранение в базу</title>
</head>

Добавлено в базу
<br/>
<tr>
    <tr>Название: ${organizationJSP.nameOrg};<br/>
    <tr>ИНН: ${organizationJSP.inn};<td/><br/>
    <td>ОГРН: ${organizationJSP.ogrn};</td><br/>
    <td>Адрес: ${organizationJSP.address};</td><br/>
</tr>
<div>
    <button onclick="location.href='/'">Назад</button>
</div>

<br/>
</body>
</html>
