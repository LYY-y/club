<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/12/20
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="entity.BookModel" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Add-Book</title>
    <link href="booklist.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="toatl.js"></script>
</head>
<body>

<section id="getintouch" class="fadeInDownBig animated">
    <div  class="container" style="border-bottom: 0;">
        <h1>
            <span>图书信息填写单</span>
        </h1>
    </div>
    <div   class="container">
<%--autocomplete清除表单input的缓存        --%>
        <form name="booklist" class="contact"  id="form" autocomplete="off">
             <div class="row clearfix">
                <div class="lbl">
                    <label for="isbn">ISBN</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="isbn" name="isbn" data-required="true" data-validation="text"
                           data-msg="Invalid Name" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="book_name">
                        书名</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="book_name" name="book_name" data-required="true" data-validation="barcode"
                           data-msg="Invalid barcode" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="book_author">
                        作者</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="book_author" id="book_author" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="book_press">
                        出版社</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="book_press" id="book_press" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="public_year">
                        出版年份</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="public_year" id="public_year" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="book_price">
                        价格</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="book_price" id="book_price" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="book_storage">
                        库存量</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="book_storage" id="book_storage" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="book_type">
                        图书种类</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="book_type" id="book_type" />
                </div>
            </div>

            <div></div>
            <div class="row  clearfix">
                <div class="span10 offset2" style="display:inline">
                    <input name="add" type="button" id="add" class="submit" value="增添" onclick="addBook()"/>
                </div>
                <div class="span10 offset2" style="display:inline">
                    <input name="add" type="button" id="update" class="submit" value="修改" onclick="updatebook()"/>
                </div>
                <div class="span10 offset2" style="display:inline">
                    <input type="reset" name="reset" id="reset" class="reset" value="重置" />
                </div>
            </div>
        </form>
    </div>
    <span id="booklistSpan" >
        <h4>书本信息如下：</h4>
        <div id="bookList"></div>
    </span>
</section>
</body>
</html>


