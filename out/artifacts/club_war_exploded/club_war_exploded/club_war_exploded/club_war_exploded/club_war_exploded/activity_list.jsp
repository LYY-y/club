<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Add-Book</title>
    <link href="activitylist.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="total.js"></script>
</head>
<body>

<section id="getintouch" class="fadeInDownBig animated">
    <div  class="container" style="border-bottom: 0;">
        <h1>
            <span>活动信息填写单</span>
        </h1>
    </div>
    <div   class="container">
<%--autocomplete清除表单input的缓存        --%>
        <form name="activitylist" class="contact"  id="form" autocomplete="off">
             <div class="row clearfix">
                <div class="lbl">
                    <label for="ac_no">活动编号</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="ac_no" name="ac_no" data-required="true" data-validation="text"
                           data-msg="Invalid Name" />
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="ac_name">
                        活动名称</label>
                </div>
                <div class="ctrl">
                    <input type="text" id="ac_name" name="ac_name" data-required="true" data-validation="barcode"
                           data-msg="Invalid barcode" />
                </div>
            </div>

            <div class="row clearfix">
                <div class="lbl">
                    <label for="ac_time">
                        活动时间</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="ac_time" id="ac_time" />
                </div>
            </div>

            <div class="row clearfix">
                <div class="lbl">
                    <label for="ac_type">
                        活动类型</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="ac_type" id="ac_type" />
                </div>
            </div>

            <div class="row clearfix">
                <div class="lbl">
                    <label for="ac_detail">
                        活动详情</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="ac_detail" id="ac_detail" />
                </div>
            </div>

            <div></div>
            <div class="row  clearfix">
                <div class="span10 offset2" style="display:inline">
                    <input name="add" type="button" id="add" class="submit" value="增添" onclick="add()"/>
                </div>
                <div class="span10 offset2" style="display:inline">
                    <input name="add" type="button" id="update" class="submit" value="修改" onclick="update()"/>
                </div>
                <div class="span10 offset2" style="display:inline">
                    <input type="reset" name="reset" id="reset" class="reset" value="重置" />
                </div>
            </div>
        </form>
    </div>
    <span id="activityListSpan" style="display:none ">
        <h4>活动信息如下：</h4>
        <div id="activityList"></div>
    </span>
</section>
</body>
</html>


