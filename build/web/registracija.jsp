<%-- 
    Document   : registracija
    Created on : Jun 18, 2023, 2:37:50 PM
    Author     : Vukisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modeli.Osoba"%>
<%@page import="Modeli.Biljka"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jakarta.servlet.http.HttpSession"%>
<%
    HttpSession sesija = request.getSession();
    String ime = (String)sesija.getAttribute("ime");


    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login" method="POST">
        <h1>Registruj se <%=ime%> </h1>
        <input type="text" name="ime" value="<%=ime%>"><br><br>
        <input type="text" name="nivo" placeholder="Koji je vas nivo?"><br><br>
        <input type="submit" value="Prosledi">
        </form>
    </body>
</html>
