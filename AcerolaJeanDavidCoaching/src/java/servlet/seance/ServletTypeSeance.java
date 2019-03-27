/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.seance;

import bd.BD;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.Seancestandard;

/**
 *
 * @author yuwei
 */
@WebServlet(name = "NewServlet3", urlPatterns = {"/NewServlet3"})
public class ServletTypeSeance extends HttpServlet {

  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*----- Type de la réponse -----*/
		response.setContentType("application/xml;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		try (PrintWriter out = response.getWriter())
			{
			/*----- Ecriture de la page XML -----*/
			out.println("<?xml version=\"1.0\"?>");
			out.println("<liste_seance>");

			/*----- Récupération des paramètres -----*/
			int bilan;
                         bilan = Integer.valueOf(request.getParameter("bilan"));

                         /*----- Lecture de liste de séances dans la BD -----*/
                         
                         List <Seancestandard> lSeance = BD.consulterTypeSeance(bilan);
                         lSeance.forEach((seance) -> {
                             out.println("<seance>" + seance + "</seance>");
                         });

			out.println("</liste_seance>");
			}
    }

    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { doGet(request, response); }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
