/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.exercice;

import bd.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.Exercicestandard;
import metier.IDObjectifE;
import metier.Objectife;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 21611960
 */
public class ServletAfficherObjectifExe extends HttpServlet {

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
                    Session sessionH = HibernateUtil.getSessionFactory().getCurrentSession();
                    Transaction t = sessionH.beginTransaction();   

                    List<IDObjectifE> l = (List<IDObjectifE>)sessionH.createQuery(
                            "Select new metier.IDObjectifE(o.codeoe, o.libelleoe) "
                                    + "from Objectife as o").list();
                    //List<String> l = (List<String>)sessionH.createSQLQuery("Select LIBELLEOE From OBJECTIFE").list();
                    
                    for(IDObjectifE oe : l){
                    out.println("<option value=\""+oe.getCodeoe()+"\">"+oe.getLibelleoe()+"</option>");
                    }

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
