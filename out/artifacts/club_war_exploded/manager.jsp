<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/1/10
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage</title>
    <script type="text/javascript" src="total.js"></script>
</head>
<style>
    html,
    body {
        width: 100%;
        height: 100%;
        margin: 0;
        padding: 0;
    }

    body {
        display: flex;
        align-items: center;
        justify-content: center;
    }

    input[type=button],[type=submit] {
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

    input[type=button],[type=submit]:hover {
        background-color: #45a049;
    }

    form {
        width: 400px;
        height: 300px;
        border-radius: 5px;
        background-color: #f2f2f2;
        text-align: center;
    }

</style>

<body>
<form>
    <div style="height:12px"></div>
    <div>
        <input id="add" type="button" name="add" value="人员管理" onclick="jump_member_manage()">
        <input id="search" type="button" name="search" value="活动管理" onclick="jump_activity_name()">
    </div>
</form>
</body>
</html>
