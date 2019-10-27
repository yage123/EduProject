<%--
  Created by IntelliJ IDEA.
  User: 13563
  Date: 2019/10/12
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
商品 :<br>
<table border="1">
    <tr>
        <td>名称</td>
        <td>价格</td>
        <td>描述</td>
        <td>日期</td>
        <td>操作</td>
        <c:forEach items="${itemList}" var="items">
    <tr>
        <td>${items.name}</td>
        <td>${items.price}</td>
        <td>${items.detail}</td>
        <td>${items.createtime}</td>
        <td>
            <a href="${pageContext.request.contextPath}/items/delete.do?id=${items.id}">删除</a>
            &nbsp;
            <a href="${pageContext.request.contextPath}/items/edit.do?id=${items.id}">编辑</a>
        </td>
    </tr>
    </c:forEach>
    </tr>
</table>
<a href="${pageContext.request.contextPath}/items/add.do">添加</a>
</body>
</html>
