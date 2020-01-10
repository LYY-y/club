<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, entity.ActivityModel" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="list" uri="/common" %>

<html>
<head>
    <title>showList</title>
    <script type="text/javascript" src="total.js"></script>
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

<jsp:useBean id="pb" class="common.PageBean" scope="session"></jsp:useBean>
<jsp:setProperty name="pb" property="currPage"></jsp:setProperty>
<jsp:getProperty name="pb" property="currPage"></jsp:getProperty>

<table align="center" width="40%">
    <tr>
        <td>活动编号</td><td>活动名称</td><td>活动时间</td><td>活动类型</td><td>活动详情</td>
    </tr>
    <list:page list="${result}" pb="${pb}" var="list" >
        <tr>
            <td>${list.ac_no}</td>
            <td>${list.ac_name}</td>
            <td>${list.ac_time}</td>
            <td>${list.ac_type}</td>
            <td>${list.ac_detail}</td>
            <td><input type="button" name="update" value="修改" onclick="jump_activityList()"></td>
            <td><input type="button" name="delete" value="删除" onclick="delete_ac(${status.count})"></td>
        </tr>
    </list:page>
</table>




<%--<form action="bookservlet" method="post">--%>
<%--    <table id="mytable">--%>
<%--        <tr >--%>
<%--            <td>活动编号</td><td>活动名称</td><td>活动时间</td><td>活动类型</td><td>活动详情</td>--%>
<%--        </tr>--%>
<%--        <c:forEach var="book" items="${requestScope.acs}" varStatus="status">--%>
<%--            <c:if test="${status.count%2==0}">--%>
<%--                <tr style="background: #eeeeff">--%>
<%--            </c:if>--%>
<%--            <c:if test="${status.count%2!=0}">--%>
<%--                <tr style="background: #dedeff">--%>
<%--            </c:if>--%>
<%--                <td id="ac_no">${book.ac_no}</td>--%>
<%--                <td>${book.ac_name}</td>--%>
<%--                <td>${book.ac_time}</td>--%>
<%--                <td>${book.ac_type}</td>--%>
<%--                <td>${book.public_year}</td>--%>
<%--                <td>${book.book_price}</td>--%>
<%--                <td>${book.book_storage}</td>--%>
<%--                <td>${book.ac_detail}</td>--%>
<%--                <td><input type="button" name="update" value="修改" onclick="jump_booklist()"></td>--%>
<%--                <td><input type="button" name="delete" value="删除" onclick="deletebook(${status.count})"></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--</form>--%>
    <span id="activityListSpan" style="display:none ">
        <h4>活动信息如下：</h4>
        <div id="activityList"></div>
    </span>
</body>
</html>

