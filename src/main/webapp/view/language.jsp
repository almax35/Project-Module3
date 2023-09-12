<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="../view/static/language.css">
    <title>Language</title>
</head>

<body background="../view/img/1667216653_1-celes-club-p-krasivii-belii-fon-vkontakte-1.jpg">

<H1>Choose programming language:</H1>
<button id="Java" class="btn"  onclick="window.location='/journeyStart'" >Java</button>
<button id="C" class="btn" onclick="window.location='/language?variant=C'">C</button>
<button id="Python" class="btn"  onclick="window.location='/language?variant=Python'">Python</button>
<button id="Erlang" class="btn"  onclick="window.location='/language?variant=Erlang'">Erlang</button>
<button id="Pascal" class="btn" onclick="window.location='/language?variant=Pascal'">Pascal</button>
<button id="JavaScript" class="btn"  onclick="window.location='/language?variant=JavaScript'">JavaScript</button>
</body>
<script>
    function  showMessage(){
        let mes="${message}"
        alert(mes);
        console.log(mes)
    }
    window.onload=showMessage();
</script>
</html>
