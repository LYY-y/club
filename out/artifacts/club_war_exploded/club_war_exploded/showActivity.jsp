<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="list" uri="/common" %>
<html>
<head>
    <title>showlist</title>
</head>
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
        </tr>
    </list:page>
</table>


<table>
    <tr >
        <td>活动编号</td><td>活动名称</td><td>活动日期</td><td>活动类型</td><td>活动详情</td>
    </tr>
    <c:forEach var="book" items="${requestScope.books}" varStatus="status">
        <c:if test="${status.count%2==0}">
            <tr style="background: #eeeeff">
        </c:if>
        <c:if test="${status.count%2!=0}">
            <tr style="background: #dedeff">
        </c:if>
        <td>${book.ISBN}</td>
        <td>${book.book_name}</td>
        <td>${book.book_author}</td>
        <td>${book.book_press}</td>
        <td>${book.public_year}</td>
        <td>${book.book_price}</td>
        <td>${book.book_storage}</td>
        <td>${book.book_type}</td>
    </c:forEach>
</table>
</body>
</html>
