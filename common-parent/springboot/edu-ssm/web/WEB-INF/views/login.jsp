<%--
  Created by IntelliJ IDEA.
  User: 13563
  Date: 2019/10/15
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form id="loginForm" action="${pageContext.request.contextPath}/login.do" method="post">
    <table border="1">
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="username" ></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password" ></td>
        </tr>
        <tr>
            <td colspan="2"> <input type="submit" value="登录"></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>
