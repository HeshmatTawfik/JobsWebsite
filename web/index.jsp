<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>welcome page</title>
</head>
<body>
<form method="post" action="signIn">

  Email:<input type="text" name="email" /><br/>
  Password:<input type="text" name="pass" /><br/>
  <input type="submit" value="signin" />
</form>
<span>
  <b> or register for the first time</b>
  <br> register<input type="button" value="REGISTER" onclick="register" > <br/>

</span>
</body>
</html>