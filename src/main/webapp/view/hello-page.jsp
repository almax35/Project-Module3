<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="../view/static/hello-page.css">
  <title>Mega quests</title>
</head>
<body background="../view/img/1667216653_1-celes-club-p-krasivii-belii-fon-vkontakte-1.jpg">
<h1>Welcome to world of quests
</h1>
<h2>Choose quest:
</h2>
<div class="form_radio_group">
  <div class="form_radio_group-item">
    <input id="radio-1" type="radio" onclick="validation()" name="radio" value="1" checked>
    <label for="radio-1">First</label>
  </div>
  <div class="form_radio_group-item">
    <input id="radio-2" type="radio" onclick="validation()" name="radio" value="2">
    <label for="radio-2">Second</label>
  </div>
  <div class="form_radio_group-item">
    <input id="radio-3" type="radio" onclick="validation()" name="radio" value="3">
    <label for="radio-3">Third</label>
  </div>
</div>
<div>
  <button id="submitButton" class="btn" type="submit" onclick="window.location='/programmer'">Submit</button>
</div>
<p class="message" id="message"></p>
<br>
<br>
<br>
<h3>Information: </h3>
<h4>Player ip: ${ip}</h4>
<h4>Staring time: ${time}</h4>
</body>
<script>
  function validation() {
    let radioButton = document.getElementById("radio-1");
    if (radioButton.checked) {
      document.getElementById("submitButton").style.visibility = 'visible';
      document.getElementById("message").innerHTML = "";
    } else {
      document.getElementById("message").innerHTML = "К сожалению, данный квест временно недоступен";
      document.getElementById("submitButton").style.visibility = 'hidden';
    }
  }
</script>
</html>