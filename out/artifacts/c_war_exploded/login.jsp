<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome to Library!</title>
</head>
<style>
    h2{
        text-align: center;
    }

    input[type=text],[type=password]{
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=submit],[type=reset]{
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
    input[type=reset]:hover {
        background-color: #45a049;
    }

    div {
        width: 400px;
        height: 300px;
        margin:0 auto;
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
    }
</style>
<body>
<h2>欢迎进入北极星社团管理系统，请输入身份信息！</h2>
<div class="content">
    <form action="login" method="post">
        <input type="hidden" name="personstatus" value="admin">
        <label for="ad_no">账号：</label>
        <input type="text" id="ad_no" name="ad_no" placeholder="Your no..">

        <label for="ad_name">姓名：</label>
        <input type="text" id="ad_name" name="ad_name" placeholder="Your name..">

        <label for="ad_password">密码：</label>
        <input type="password" id="ad_password" name="ad_password" >

        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>

