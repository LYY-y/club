<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/12/21
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, entity.BookModel" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>showbook</title>
    <script type="text/javascript" src="toatl.js"></script>
</head>
<style>
    input[type=button],[type=submit] {
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

    input[type=button],[type=submit]:hover {
        background-color: #45a049;
    }
</style>
<body>
<form action="bookservlet" method="post">
    <table id="mytable">
        <tr >
            <td>ISBN</td><td>书名</td><td>作者</td><td>出版社</td><td>出版年份</td><td>价格</td><td>库存量</td><td>类型</td>
        </tr>
        <c:forEach var="book" items="${requestScope.books}" varStatus="status">
            <c:if test="${status.count%2==0}">
                <tr style="background: #eeeeff">
            </c:if>
            <c:if test="${status.count%2!=0}">
                <tr style="background: #dedeff">
            </c:if>
                <td id="isbn">${book.ISBN}</td>
                <td>${book.book_name}</td>
                <td>${book.book_author}</td>
                <td>${book.book_press}</td>
                <td>${book.public_year}</td>
                <td>${book.book_price}</td>
                <td>${book.book_storage}</td>
                <td>${book.book_type}</td>
                <td><input type="button" name="update" value="修改" onclick="jump_booklist()"></td>
                <td><input type="button" name="delete" value="删除" onclick="deletebook(${status.count})"></td>
            </tr>
        </c:forEach>
    </table>
</form>
<span id="booklistSpan" >
        <h4>书本信息如下：</h4>
        <div id="bookList"></div>
    </span>
</body>
</html>

