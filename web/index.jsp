<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>welcome page</title>
</head>
<body>
<form method="post" action="Login">
  <fieldset>
    <label> Email:<input type="text" name="email" /><br/> </label>
      <label>Password:<input type="password" name="pass" /><br/> </label>
  <input type="submit" value="signin" />
    </fieldset>
</form>
<span>
  <fieldset>
  <b> you dont have an account ? register a new one ! </b>
  <br> <input type="button" value="REGISTER" onclick=window.location.href='RegisteringForm.jsp' > <br/>
</fieldset>
</span>
</body>
</html>