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
    <title>商品添加</title>
</head>
<body>
<
<form action="${pageContext.request.contextPath}/items/adds.do" method="post">
<table border="1">
    <tr>
        <td>名称</td>
        <td>
            <input type="text" name="name" value="${name}">

        </td>
    </tr>
    <tr>
        <td>价格</td>
        <td><input type="text" name="price" value="${price}"> </td>
    </tr>
    <tr>
        <td>描述</td>
        <td><textarea cols="20" rows="5" name="detail" >${detail}</textarea> </td>
    </tr>
    <tr>
        <td>图片</td>
        <td>
            <imag src="${pic}"></imag>
            <input type="file">
        </td>
    </tr>
    <tr>
        <td colspan="2"> <input type="submit" value="更新"></td>
        <td></td>
    </tr>
</table>
</form>
</body>
</html>
