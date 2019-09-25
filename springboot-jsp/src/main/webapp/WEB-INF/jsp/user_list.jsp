<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="0" >
    <tr>
        <th>用户id</th>
        <th>用户名称</th>
        <th>用户年龄</th>
    </tr>
    <c:forEach items="${userList }" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.name }</td>
            <td>${user.age }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>