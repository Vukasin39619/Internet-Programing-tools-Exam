/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servleti;

import Modeli.Biljka;
import Modeli.Osoba;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author Vukisha
 */
public class Login extends HttpServlet {

    ArrayList<Osoba> korisnici = new ArrayList<Osoba>();
    Osoba o1 = new Osoba("Petar", "Pocetnik");
    Osoba o2 = new Osoba("Milos", "Srednji");
    Osoba o3 = new Osoba("Srdjan", "Najvisi");

    ArrayList<Biljka> biljke = new ArrayList<Biljka>();
    Biljka b1 = new Biljka("Kaktus", "Bodljikav", "Nikad");
    Biljka b2 = new Biljka("Ruza", "Crveni", "Povremeno");
    Biljka b3 = new Biljka("VisiBaba", "Bela", "Redovno");

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ime = request.getParameter("ime");

        korisnici.add(o1);
        korisnici.add(o2);
        korisnici.add(o3); //SVAKI PUT PUNIMO LISTU SA OVIM KAD STISNEMO DUGME LOGIN, JER NECE NA VRHU DA SE NAPUNI

        biljke.add(b1);
        biljke.add(b2);
        biljke.add(b3);

        boolean foundUser = false; // Flag to keep track if the user is found

        HttpSession sesija = request.getSession();
        sesija.setAttribute("Biljke", biljke);
        sesija.setAttribute("korisnici", korisnici);
        sesija.setAttribute("ime", ime);

        for (Osoba o : korisnici) {
            if (ime.equals(o.getIme())) {
                foundUser = true;
                response.sendRedirect("izbor.jsp");
                break; // Exit the loop since the user is found

            }
        }
        if (!foundUser) {
            response.sendRedirect("registracija.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Nivo = request.getParameter("nivo");
        HttpSession sesija = request.getSession();
        String ime = (String) sesija.getAttribute("ime");
        
        Osoba o4 = new Osoba(ime,Nivo);
        korisnici.add(o4);
        response.sendRedirect("izbor.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
