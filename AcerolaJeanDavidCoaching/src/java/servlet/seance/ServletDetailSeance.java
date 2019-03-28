/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.seance;

import bd.BD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.SeanceDetails;
import metier.Seancestandard;

/**
 *
 * @author yuwei
 */
@WebServlet(name = "NewServlet3", urlPatterns = {"/NewServlet3"})
public class ServletDetailSeance extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*----- Type de la réponse -----*/
        response.setContentType("application/xml;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /*----- Ecriture de la page XML -----*/
            out.println("<?xml version=\"1.0\"?>");
            out.println("<seance>");

            /*----- Récupération des paramètres -----*/
            String nomSeance = request.getParameter("nomSeance");

            /*----- Lecture de liste de séances dans la BD -----*/
            ArrayList<SeanceDetails> lDetailSeance = BD.afficherDetailSeance(nomSeance);
            for (SeanceDetails details : lDetailSeance) {
                out.println("<details>");
                out.println("<ordre>" + details.getOrdre() + "</ordre>");
                out.println("<nomExercice>" + details.getNomEx() + "</nomExercice>");
                out.println("<typeExercice>" + details.getType() + "</typeExercice>");
                out.println("<serie>" + details.getNbseries() + "</serie>");
                out.println("<repetition>" + details.getRepetition() + "</repetition>");
                out.println("<tempsRepos>" + details.getTempsreposs() + "</tempsRepos>");
                out.println("<duree>" + details.getDuree() + "</duree>");
                out.println("</details>");

            }

            out.println("</seance>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
