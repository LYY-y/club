var xmlHttp;
var isbn;
var book_name;
var book_author;
var book_press;
var public_year;
var book_price;
var book_storage;
var book_type;
function createXMLHttpRequest() {
    if (window.XMLHttpRequest){
        xmlHttp = new XMLHttpRequest();
    } else if(window.ActiveXObject){
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP")
    }

}

function updatebook(pos) {
    isbn = document.getElementById("isbn").value;
    book_name = document.getElementById("book_name").value;
    book_author = document.getElementById("book_author").value;
    book_press = document.getElementById("book_press").value;
    public_year = document.getElementById("public_year").value;
    book_price = document.getElementById("book_price").value;
    book_storage = document.getElementById("book_storage").value;
    book_type = document.getElementById("book_type").value;
    if(isbn == "" || book_name == "" || book_author == "" || book_press == "" ||
        public_year == "" ||book_price == "" || book_storage == "" || book_type == ""){
        alert("不能为空值！");
        return;
    }
    createXMLHttpRequest();
    xmlHttp.open("post","updateservlet",true);
    xmlHttp.setRequestHeader('content-type','application/x-www-form-urlencoded');
    xmlHttp.send("isbn="+isbn+"&book_name="+book_name+"&book_author="+book_author+"&book_press="
        +book_press+"&public_year="+public_year+"&book_price="+book_price+"&book_storage="
        +book_storage+"&book_type="+book_type);
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState ==4){
            if (xmlHttp.status == 200){
                showBookList();
                clearInputBoxes();
            }else {
                alert("添加书籍错误！");
            }
        }
    }
}

function deletebook(pos) {
    isbn = document.getElementById("mytable").rows[pos].cells[0].innerHTML;;
    if(isbn == ""){
        alert("ISBN不能为空值！");
        return;
    }
    createXMLHttpRequest();
    xmlHttp.open("get","deleteservlet?value="+isbn,true);
    xmlHttp.send();
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState ==4){
            if (xmlHttp.status == 200){
                showBookList();
            }else {
                alert("删除书籍错误！");
            }
        }
    }

}
function addBook() {
    isbn = document.getElementById("isbn").value;
    book_name = document.getElementById("book_name").value;
    book_author = document.getElementById("book_author").value;
    book_press = document.getElementById("book_press").value;
    public_year = document.getElementById("public_year").value;
    book_price = document.getElementById("book_price").value;
    book_storage = document.getElementById("book_storage").value;
    book_type = document.getElementById("book_type").value;
    if(isbn == "" || book_name == "" || book_author == "" || book_press == "" ||
        public_year == "" ||book_price == "" || book_storage == "" || book_type == ""){
        alert("不能为空值！");
        return;
    }
    createXMLHttpRequest();
    xmlHttp.open("post","addservlet",true);
    xmlHttp.setRequestHeader('content-type','application/x-www-form-urlencoded');
    xmlHttp.send("isbn="+isbn+"&book_name="+book_name+"&book_author="+book_author+"&book_press="
        +book_press+"&public_year="+public_year+"&book_price="+book_price+"&book_storage="
        +book_storage+"&book_type="+book_type);
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState ==4){
            if (xmlHttp.status == 200){
                showBookList();
                clearInputBoxes();
            }else {
                alert("添加书籍错误！");
            }
        }
    }
}


function clearInputBoxes() {
    document.getElementById("isbn").value = "";
    document.getElementById("book_name").value = "";
    document.getElementById("book_author").value = "";
    document.getElementById("book_press").value = "";
    document.getElementById("public_year").value = "";
    document.getElementById("book_price").value = "";
    document.getElementById("book_storage").value = "";
    document.getElementById("book_type").value = "";
}

function showBookList() {
    var returnJsonString = xmlHttp.responseText;
    console.log(returnJsonString);
    var returnJson = JSON.parse(returnJsonString);
    console.log(returnJson);
    var isbn,name,author,press,year,price,storage,type;
    var tab = '<table border="1" width="800">'
    console.log(returnJsonString);
    console.log(returnJson);
    // console.log(returnJson[0].ISBN);
    for (var i = 0; i < returnJson.length; i++) {
        isbn = returnJson[i].ISBN;
        name = returnJson[i].book_name;
        author = returnJson[i].book_author;
        press = returnJson[i].book_press;
        year = returnJson[i].public_year;
        price = returnJson[i].book_price;
        storage = returnJson[i].book_storage;
        type = returnJson[i].book_type;
        var book = [isbn, name, author, press, year, price, storage, type];
        tab += '<tr>';
        for (var k = 0; k < 8; k++){
            tab += "<td>" + book[k] + "</td>";
        }
        tab += '</tr>';
    }
    tab += '</table>';
    bookList.innerHTML = tab;
}

function jump_activitylist() {
    window.location.href="activitylist";
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

function jump_activity_name() {
    window.location.href="activity_manage.jsp";
}