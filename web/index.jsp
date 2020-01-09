<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/12/18
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>图书管理系统</title>
</head>
<style>
    h1 {
        text-align: center;
    }

    html,
    body {
        width: 100%;
        height: 100%;
        margin: 0;
        padding: 0;
    }

    input[type=button] {
        background-color: #4CAF50;
        border: none;
        color: white;
        padding: 16px 32px;
        text-decoration: none;
        margin: 4px 2px;
        border-radius: 10px;
        cursor: pointer;
        height: 130px;
        width: 175px;
        font-size: 20px;
    }

    input[type=button]:hover {
        background-color: #45a049;
    }

    div {
        text-align: center;
        justify-content: center;
    }

</style>

<body>
    <div style="height: 100px;"></div>
    <h1>欢迎来到 北极星社团 管理系统</h1>
    <div>
        <input id="reader" type="button" name="reader" value="游客" onclick="jump_relogin()">
        <input id="admin" type="button" name="admin" value="会员" onclick="jump_login()">
    </div>
</body>
<script>
    function jump_relogin() {
        window.location.href = "re_login.jsp";
    }

    function jump_login() {
        window.location.href = "login.jsp";
    }

</script>

</html>
