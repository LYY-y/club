<%--
  Created by IntelliJ IDEA.
  User: lzh
  Date: 2020/1/6
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<%@ taglib prefix="list" uri="/common" %>
<html>
<head>
    <title>List</title>
    <meta charset="utf-8">
</head>
<body>
    <jsp:useBean id="pb" class="common.PageBean" scope="session"></jsp:useBean>
    <jsp:setProperty name="pb" property="currPage"></jsp:setProperty>
    <jsp:getProperty name="pb" property="currPage"></jsp:getProperty>
    <%--<%=pd.getCurrPage()%>--%>
    <script>
        console.log(${currPage});
    </script>
    <table align="center" width="40%">
        <tr>
            <td>序号</td>
        </tr>
        <list:page list="${result}" pb="${pb}" var="list" >
            <tr>
                <td>${list}</td>
            </tr>
        </list:page>
    </table>
</body
</html>
