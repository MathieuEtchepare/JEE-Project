<%-- 
    Document   : login
    Created on : 11 déc. 2018, 09:01:16
    Author     : Mathieu Etchepare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaEEProject - Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="Controller">
            <input type="text" name="login" placeholder="Login"/> <br/>
            <input type="password" name="pwd" placeholder="Password"/><br/>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>