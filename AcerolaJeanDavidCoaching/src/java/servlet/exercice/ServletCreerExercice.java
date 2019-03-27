/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.exercice;

import bd.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.Exercicestandard;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 21611960
 */
@WebServlet(name = "ServletCreerExercice", urlPatterns = {"/ServletCreerExercice"})
public class ServletCreerExercice extends HttpServlet {

    Session sessionH = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction t = sessionH.beginTransaction();

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
        /*----- Type de la réponse -----*/
        response.setContentType("application/xml;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter())
                {    
                    /*----- Récupérer les éléments saisies -----*/
                    String nomExe = request.getParameter("nomExe");
                    String descriptionExe = request.getParameter("descriptionExe");
                    
                    /*----- Ajouter l'exercice dans la BD -----*/
                    Exercicestandard e = new Exercicestandard();
                    e.setNomes(nomExe);
                    e.setDescriptiontxtes(descriptionExe);
                    sessionH.save(e);
                    
                    /*-----Commit -----*/
                    t.commit();
                }
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
        doGet(request, response);
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
