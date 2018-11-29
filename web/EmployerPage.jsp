<%--
  Created by IntelliJ IDEA.
  User: heshmat
  Date: 11/29/2018
  Time: 1:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employer</title>
</head>
<body>
<h1>Hello <%=  session.getAttribute("username")%></h1>
<h2>looking for employees ?
    you can see who applied for jobs you posted !!
</h2>
<input type="button" value="check applicants"  onclick=window.location.href='CheckApplicant.jsp'> <br/>
<h3> you want to post a new job ?</h3>
<input type="button" value="publish a job"  onclick=window.location.href='JobPostForm.jsp'> <br/>


<form action="Logout"><input type="submit" value="Logout"></form> <br/>
</body>
</html>
