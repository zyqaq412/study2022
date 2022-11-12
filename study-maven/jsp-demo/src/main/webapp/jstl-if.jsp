<%--
  Created by IntelliJ IDEA.
  User: zxwyhzy
  Date: 2022/11/12
  Time: 16:32
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
    <%-- c:if 完成逻辑判断，替换java if else --%>
    <c:if test="${status ==1}">
        <h1>你好</h1>
    </c:if>
    <c:if test="${status ==0}">
        <h1>不好</h1>
    </c:if>
</body>
</html>
