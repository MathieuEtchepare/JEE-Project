<%-- 
    Document   : welcome
    Created on : 11 déc. 2018, 09:14:27
    Author     : Mathieu Etchepare
--%>

<%@page import="model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.userSession"%>
<%@page import="model.DataAccess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    DataAccess dTransac = new DataAccess(); 
    String query = "SELECT * FROM EMPLOYEES";
    ArrayList <Employee> Employees = dTransac.getDBEmployees(dTransac.getResultSet(dTransac.getStatement(dTransac.getConnection()), query));
    for(Employee e : Employees)
    {
        out.println(e.getName() + " " + e.getFirstName() + " " + e.getHomePhone() + " " + e.getMobilePhone() + " " + e.getWorkPhone() + " " + e.getAddress() + " " + e.getPostalCode() + " " + e.getCity() + " " + e.getEmail());
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
