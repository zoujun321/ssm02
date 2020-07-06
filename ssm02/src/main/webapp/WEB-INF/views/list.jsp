<%--
  Created by IntelliJ IDEA.
  User: 邹郡
  Date: 2020/7/1
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>结果集</h2>
<c:forEach items="${list}" var="acount">
    ${acount.name}
</c:forEach>
</body>
</html>
