<%--
  Created by IntelliJ IDEA.
  User: zxwyhzy
  Date: 2022/11/12
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %><!--不忽略el表达式-->
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>你好</h1>
<c:forEach items="${brands}" var="brand">
    <tr align="center">
        <td>${brand.id}</td><br>
        <td>${brand.brandName}</td><br>
        <td>${brand.companyName}</td><br>
        <td>${brand.description}</td><br>
    </tr>
</c:forEach>

</body>
</html>
