var xmlHttp;
var ac_no;
var ac_name;
var ac_time;
var ac_type;
var ac_detail;

function createXMLHttpRequest() {
    if (window.XMLHttpRequest){
        xmlHttp = new XMLHttpRequest();
    } else if(window.ActiveXObject){
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP")
    }

}

function update() {
    ac_no = document.getElementById("ac_no").value;
    ac_name = document.getElementById("ac_name").value;
    ac_time = document.getElementById("ac_time").value;
    ac_type = document.getElementById("ac_type").value;
    ac_detail = document.getElementById("ac_detail").value;
    if(ac_no == "" || ac_name == "" || ac_time == "" || ac_type == "" ||
        ac_detail == "" ){
        alert("不能为空值！");
        return;
    }
    createXMLHttpRequest();
    xmlHttp.open("post","updateServlet",true);
    xmlHttp.setRequestHeader('content-type','application/x-www-form-urlencoded');
    xmlHttp.send("ac_no="+ac_no+"&ac_name="+ac_name+"&ac_time="+ac_time+"&ac_type="
        +ac_type+"&ac_detail="+ac_detail);
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState ==4){
            if (xmlHttp.status == 200){
                showBookList();
                clearInputBoxes();
                document.getElementById('activityListSpan').style.display='block'
            }else {
                alert("修改活动信息错误！");
            }
        }
    }
}

function delete_ac(pos){
    ac_no = document.getElementById("mytable").rows[pos].cells[0].innerHTML;;
    if(ac_no == ""){
        alert("活动编号不能为空值！");
        return;
    }
    createXMLHttpRequest();
    xmlHttp.open("get","deleteServlet?value="+ac_no,true);
    xmlHttp.send();
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState ==4){
            if (xmlHttp.status == 200){
                showBookList();
                document.getElementById('activityListSpan').style.display='block';
            }else {
                alert("删除活动记录错误！");
            }
        }
    }

}

function add() {
    ac_no = document.getElementById("ac_no").value;
    ac_name = document.getElementById("ac_name").value;
    ac_time = document.getElementById("ac_time").value;
    ac_type = document.getElementById("ac_type").value;
    ac_detail = document.getElementById("ac_detail").value;
    if(ac_no == "" || ac_name == "" || ac_time == "" || ac_type == "" ||
        ac_detail == "" ){
        alert("不能为空值！");
        return;
    }
    createXMLHttpRequest();
    xmlHttp.open("post","addServlet",true);
    xmlHttp.setRequestHeader('content-type','application/x-www-form-urlencoded');
    xmlHttp.send("ac_no="+ac_no+"&ac_name="+ac_name+"&ac_time="+ac_time+"&ac_type="
        +ac_type+"&ac_detail="+ac_detail);
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState ==4){
            if (xmlHttp.status == 200){
                showBookList();
                clearInputBoxes();
                document.getElementById('activityListSpan').style.display='block'
            }else {
                alert("添加活动错误！");
            }
        }
    }
}


function clearInputBoxes() {
    document.getElementById("ac_no").value = "";
    document.getElementById("ac_name").value = "";
    document.getElementById("ac_time").value = "";
    document.getElementById("ac_type").value = "";
    document.getElementById("ac_detail").value = "";
    document.getElementById("book_price").value = "";
    document.getElementById("book_storage").value = "";
    document.getElementById("ac_detail").value = "";
}

function showBookList() {
    var returnJsonString = xmlHttp.responseText;
    console.log(returnJsonString);
    var returnJson = JSON.parse(returnJsonString);
    console.log(returnJson);
    var ac_no,ac_name,ac_time,ac_type,ac_detail;
    var tab = '<table border="1" width="800">'
    console.log(returnJsonString);
    console.log(returnJson);
    // console.log(returnJson[0].ac_no);
    for (var i = 0; i < returnJson.length; i++) {
        ac_no = returnJson[i].ac_no;
        ac_name = returnJson[i].ac_name;
        ac_time = returnJson[i].ac_time;
        ac_type = returnJson[i].ac_type;
        ac_detail = returnJson[i].ac_detail;
        var ac = [ac_no, ac_name, ac_time, ac_type, ac_detail];
        tab += '<tr>';
        for (var k = 0; k < 8; k++){
            tab += "<td>" + ac[k] + "</td>";
        }
        tab += '</tr>';
    }
    tab += '</table>';
    document.getElementById('activityList').innerHTML = tab;
}

function jump_search(){
    window.location.href="search.jsp";
}
function examine(type){
    document.getElementById("state").value=type;
}

function jump_member_manage() {
    window.location.href="member_manage.jsp";
}

function jump_activity_manage() {
    window.location.href="activity_manage.jsp";
}