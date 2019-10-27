<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
欢迎<${cc2}>这个#{age}岁的
<#if (age<=18)>憨憨
<#else> 笨比

</#if>

<br>
学生列表
</br>
<table border="1">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>性别</td>
    </tr>
    <#list stuList ?sort_by("id")?reverse as stu>
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.gender}</td>
        </tr>
    </#list>
</table>
</body>
</html>