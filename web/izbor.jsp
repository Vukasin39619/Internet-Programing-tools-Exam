<%-- 
    Document   : izbor
    Created on : Jun 18, 2023, 2:37:34 PM
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
 
    ArrayList<Osoba> osobe = (ArrayList<Osoba>)sesija.getAttribute("korisnici");
    ArrayList<Biljka> biljke = (ArrayList<Biljka>)sesija.getAttribute("Biljke");
    
    String nivo = "";
    for(Osoba o : osobe)
    {
        if(ime.equals(o.getIme()))
        {
          nivo = o.getNivo();
}
}
    Biljka b1 = biljke.get(0);
    Biljka b12 = biljke.get(1);
    Biljka b13 = biljke.get(2);
    
    String x = b1.getCvet() +", " +b1.getNaziv() +", " + b1.getZalivanje();
    String x1 = b12.getCvet() +", " + b12.getNaziv() +", " + b12.getZalivanje();
    String x2 = b13.getCvet() +", " + b13.getNaziv() +", " + b13.getZalivanje();
    

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <form action="Izbor" method="POST">
        <h1>Zdravo <%=ime%></h1>
        <label>Nivo:<%=nivo%></label><br>
        <label>Izaberi cvece iz liste:</label><br><br>
        <input type="checkbox" name="cvet" value="<%=x%>"><%=x%><br>
        <input type="checkbox" name="cvet" value="<%=x1%>"><%=x1%><br>
        <input type="checkbox" name="cvet" value="<%=x2%>"><%=x2%><br>
        
        <input type="submit" value="Izaberi">
        </form>
    </body>
</html>
