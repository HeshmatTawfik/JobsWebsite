<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>welcome page</title>
</head>
<body>
<form method="post" action="signIn">
  <fieldset>

    <label> Email:<input type="text" name="email" /> </label><br/>
      <label> Password:<input type="text" name="pass" /> </label><br/>
  <input type="submit" value="signin" />
    </fieldset>

</form>
<span>
  <fieldset>

  <b> you don't have an account ? register for a new one ! </b>
  <br> <input type="button" value="REGISTER" onclick=window.location.href='RegisteringForm.jsp' > <br/>
    </fieldset>

</span>

</body>
</html>