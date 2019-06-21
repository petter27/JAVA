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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        String[] tecnologias=request.getParameterValues("tecnologia");
        String genero=request.getParameter("genero");
        String ocupacion=request.getParameter("ocupacion");
        String[] musica=request.getParameterValues("musica");
        String comentario=request.getParameter("comentario");
        
        out.println("<html>");
        out.println("<title> Respuesta Servlet </title>");
        out.println("<body>");
        out.println("usuario : "+usuario + "</br>");
        out.println("password : "+password + "</br>");
        out.print("tecnologias : ");
        for(String tecnologia : tecnologias){
        out.print(tecnologia+" ");
        }
        out.println("</br>");
        if(genero.equals("M")){
        out.println("genero : Masculino</br>");
        }else{
        out.println("genero : Femenino</br>");
        }
        switch(ocupacion){
            case "1": out.println("Ocupacion : Profesor</br>"); break;
            case "2": out.println("Ocupacion : Ingeniero</br>"); break;
            case "3": out.println("Ocupacion : Jubilado</br>"); break;
            case "4": out.println("Ocupacion : Otro</br>"); break;
            default: break;
            
        }
        out.print("musica : ");
        for(String music : musica){
        out.print(music+" ");
        }
        out.println("</br>");
        out.println("comentario :"+comentario + "</br>");
        out.println("</body>");
        out.println("</html>");
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
