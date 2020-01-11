<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/1/10
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book_manage</title>
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
<form action="memberServlet" method="post">
    <div style="height:12px"></div>
    <div>
        <input id="add" type="button" name="add" value="审核成员" onclick="jump_booklist()">
        <input id="delete" type="submit" name="delete" value="删除成员记录" onclick="examine(4)">
        <input id="update" type="submit" name="update" value="修改成员权限" onclick="examine(4)">
        <input id="search" type="button" name="search" value="查询成员记录" onclick="jump_search()">
        <input type="hidden" id="state" name="state" value="state">
    </div>
</form>
</body>
</html>