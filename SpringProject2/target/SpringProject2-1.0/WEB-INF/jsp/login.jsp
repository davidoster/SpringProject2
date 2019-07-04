<%-- 
    Document   : login
    Created on : Jul 3, 2019, 10:05:44 AM
    Author     : George.Pasparakis
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>User Login</h1>
        <c:out value="something" />
       <!-- <form>
            <input name="userName" path="userName" commandName="userlogin" />
            <input name="password" path="password" commandName="userlogin" />
            <input type="submit" value="Login" />
        </form>
        -->
        <form:form method="POST" commandName="userlogin">
            <form:input path="userName" /><br>
            <form:input path="password" /><br>
            <input type="submit" value="Login" />
        </form:form>
    </body>
</html>
