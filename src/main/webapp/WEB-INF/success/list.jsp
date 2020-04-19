<%--
  Created by IntelliJ IDEA.
  User: 涛少
  Date: 2018/10/14
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 style="color: darkgreen">测试成功</h3>

<c:forEach items="${list}" var="list">
    ${list.id}
    ${list.name}
    ${list.money}
</c:forEach>

</body>
</html>
