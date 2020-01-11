<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/12/19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
    <script type="text/javascript" src="total.js"></script>
</head>
<style>
    html,body{
        width: 100%;
        height: 100%;
        margin: 0;
        padding: 0;
    }

    body{
        display: flex;
        align-items: center;
        justify-content: center;
    }

    input[type=text]{
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=submit]{
        background-color: #4CAF50;
        border: none;
        color: white;
        padding: 16px 32px;
        text-decoration: none;
        margin: 4px 2px;
        border-radius: 4px;
        cursor: pointer;
        float:right;
    }


    input[type=submit]:hover {
        background-color: #45a049;
    }

    .content {
        width: 400px;
        height: 300px;
        border-radius: 5px;
        background-color: #f2f2f2;
    }
</style>
    <body>
        <div id="content">
            <form  id="myform" action="bookservlet" method="post">
                <div>
                    搜索内容：<input type="text" name="value">
                </div>
                <input type="submit" name="singlesearch" value="精确查询" onclick="examine('1')">
                <input type="submit" name="somesearch" value="模糊查询" onclick="examine('2')">
                <input type="submit" name="allsearch" value="全部查询" onclick="examine('3')">
                <input type="hidden" id="state" name="state" value="state">
            </form>
        </div>
    </body>
</html>
