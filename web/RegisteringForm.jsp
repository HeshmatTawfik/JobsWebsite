<%--
  Created by IntelliJ IDEA.
  User: alous
  Date: 11/22/2018
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registering form</title>
</head>
<body>
<form method="post" action="Register">

    Email:<input type="text" name="email" /><br/>
    Password:<input type="text" name="pass" /><br/>
    Name:<input type="text" name="Name" /><br/>
    Age:<input type="number" name="Age"  min="18" max="90"   oninvalid="setCustomValidity('cant be older than 90 ')" /><br/>
    City:<input type="text" name="City" /><br/>
    choose a role:<br/>
    employer:<input type="radio" name="role" value="employer"><br/>
    applicant:<input type="radio" name="role" value="applicant"><br/>

    <input type="submit" value="submit" />
</form>
</body>
</html>
