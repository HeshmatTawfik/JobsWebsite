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
  <b> you dont have an account ? register a new one ! </b>
  <br> <input type="button" value="REGISTER" onclick=window.location.href='RegisteringForm.jsp' > <br/>

</span>
</body>
</html>