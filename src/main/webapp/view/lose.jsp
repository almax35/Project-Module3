<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../view/static/lose.css">
    <title>Lose</title>
</head>

<body>
<h1>
    You are lose!
</h1>
<h2>${result}</h2>
<img src="../view/img/sad-cat.jpg">
<button id="returnToStart" class="btn" onclick="window.location='/hello'">Start page</button>
</body>
</html>
