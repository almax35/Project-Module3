<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../view/static/beProgrammer.css">
    <title>BeProgrammer</title>
</head>
<body>
<h1>Are you want to be a programmer?</h1>
<button id="yes" class="btn" type="yes" onclick="window.location='/language'">Yes</button>
<button id="no" class="btn" type="no" onclick="buttonNoClick()">No</button>
</body>

<script>
    function buttonNoClick() {
        let button = document.getElementById("no");
        let windowWidth = window.innerWidth;
        let windowHeight = window.innerHeight;
        let randomX = Math.floor(Math.random() * (windowWidth - button.offsetWidth));
        let randomY = Math.floor(Math.random() * (windowHeight - button.offsetHeight));
        button.style.position = "absolute";
        button.style.left = randomX + "px";
        button.style.top = randomY + "px";
    }
</script>

</html>
