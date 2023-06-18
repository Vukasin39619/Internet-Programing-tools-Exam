/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servleti;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.io.PrintWriter;

/**
 *
 * @author Vukisha
 */
public class Izbor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
PrintWriter out = response.getWriter();

HttpSession session = request.getSession();
String ime = (String) session.getAttribute("ime");


String[] selectedCveti = request.getParameterValues("cvet");

out.println("<html>");
out.println("<head>");
out.println("<title>Hola</title>");
out.println("</head>");
out.println("<body bgcolor=\"white\">");
out.println("<h1> Osoba "+ime+"</h1><br>");
out.println("Izabrali ste:<br><br>");

if (selectedCveti != null) {
    for (String cvet : selectedCveti) {
        out.println("Selected cvet: " + cvet);
        out.println("<br>");
    }
} else {
    out.println("No cvet selected.");
}

out.println("<a href='index.html'>Vrati se na pocetnu</a>");
out.println("</body>");
out.println("</html>");

out.close();
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
