<%@ page session="false" isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Информация о страховых организациях</title>
</head>
<body>
Название: ${insuranceCompanyJSP.name};
<br/>
ИНН: ${insuranceCompanyJSP.INN};
<br/>
ОГРН: ${insuranceCompanyJSP.OGRN};
<br/>
Адрес: ${insuranceCompanyJSP.address};
<br/>
</body>
</html>
