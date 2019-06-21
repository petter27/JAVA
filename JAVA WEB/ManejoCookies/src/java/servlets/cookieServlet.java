/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "cookieServlet", urlPatterns = {"/cookieServlet"})
public class cookieServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cookieServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cookieServlet at " + request.getContextPath() + "</h1>");
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
        boolean nuevoUsuario=true;
        Cookie[] cookies=request.getCookies();
        
        if(cookies!=null){
            for(Cookie c:cookies){
                if(c.getName().equals("visitanteR") && c.getValue().equals("si")){
                    nuevoUsuario=false;
                    break;
                }
            }
        }
        String mensaje;
        if(nuevoUsuario){
            Cookie visitanteCookie= new Cookie("visitanteR", "si");
            response.addCookie(visitanteCookie);
            mensaje="Gracias por visitar nuestro sitio";
        }else{
        mensaje="Gracias por visitar Nuevamente nuestro sitio";
        }
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println(mensaje);
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
        boolean nuevoUsuario=true;
        int contadorVisitas=0;
        Cookie[] cookies=request.getCookies();
        
        if(cookies!=null){
            for(Cookie c:cookies){
                if(c.getName().equals("visitanteR")){
                    nuevoUsuario=false;
                    contadorVisitas=Integer.parseInt(c.getValue());
                    c.setValue(Integer.toString(contadorVisitas+1));
                    break;
                }
            }
        }
        String mensaje;
        if(nuevoUsuario){
            Cookie visitanteCookie= new Cookie("visitanteR", Integer.toString(contadorVisitas));
            response.addCookie(visitanteCookie);
            mensaje="visitas totales= "+contadorVisitas;
        }else{
        mensaje="visitas totales= "+contadorVisitas;
        }
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println(mensaje);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
