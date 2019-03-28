/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import metier.Contenires;
import metier.Exercicestandard;
import metier.Objectife;
import metier.Repetition;
import metier.SeanceDetails;
import metier.Seancestandard;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author yuwei
 */
public class BD {

    /*----- Ouverture de la session et de la transaction -----*/
    static Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction t = session.beginTransaction();

    public BD() {
    }

    /**
     * cette fonction permet de chercher les séances par type de séance.
     *
     * @param bilan
     * @return
     */
    public static List<Seancestandard> consulterTypeSeance(int bilan) {

        List<Seancestandard> listeSeance;
        listeSeance = (List<Seancestandard>) session.createQuery("FROM Seancestandard s where bilanss =" + bilan).list();

        return listeSeance;

    }

    /**
     * cette fonction permet de chercher les séances par nom
     *
     * @param nom
     * @return
     */
    public static List<Seancestandard> consulterNomSeance(String nom) {

        List listeSeance;
        listeSeance = (List) session.createQuery("FROM Seancestandard s where nomss ='" + nom + "'").list();

        return listeSeance;

    }

    public static ArrayList<SeanceDetails> afficherDetailSeance(String nomSeance) {

        ArrayList<SeanceDetails> listeDetails = new ArrayList();
        List<Seancestandard> seance = session.createQuery("from Seancestandard  where nomss ='" + nomSeance + "'").list();
        int vOrdre = 0;
        String nomExercice = "";
        int serie = 0;
        int tempsRepos = 0;
        int duree = 0;
        String vType = "";
        String vRepetition = "";
        for (Seancestandard s : seance) {
            Set<Contenires> listeContenires = s.getContenireses();
            for (Contenires contenir : listeContenires) {
                vOrdre = contenir.getOrdre().getNumero();
                nomExercice = contenir.getExercicestandard().getNomes();
                duree = contenir.getExercicestandard().getTempsobjectifes();
                serie = contenir.getNbseries();
                tempsRepos = contenir.getTempsreposs();
                Set<Objectife> listTypeExercice = contenir.getExercicestandard().getObjectifes();

                for (Objectife objectif : listTypeExercice) {
                    System.out.println(objectif.getLibelleoe());
                    vType += objectif.getLibelleoe() + ";";
                }
                Set<Repetition> listRepetition = contenir.getExercicestandard().getRepetitions();
                for (Repetition Repeti : listRepetition) {
                    System.out.println(Repeti.getNbfois());
                    vRepetition += Repeti.getNbfois() + ";";
                }

                SeanceDetails details = new SeanceDetails(vOrdre, nomExercice, vType, serie, vRepetition, tempsRepos, duree);
                listeDetails.add(details);
            }
        }

        return listeDetails;
    }
//

//    public static void main(String[] s) {
//
//        Transaction t = session.beginTransaction();
//
////        List<Seancestandard>  ll;
////        ll = consulterTypeSeance(0);
////        System.out.print(ll);
//        ArrayList<SeanceDetails> listeseances = afficherDetailSeance("Echauffement");
//        for (SeanceDetails seance : listeseances) {
//            System.out.println(seance.getOrdre());
//            System.out.println(seance.getNomEx());
//            System.out.println(seance.getType());
//            System.out.println(seance.getNbseries());
//            System.out.println(seance.getRepetition());
//            System.out.println(seance.getTempsreposs());
//            System.out.println(seance.getDuree());
//        }
//        Iterator e = l.iterator();
//        while (e.hasNext()) {
//            Object[] tab_obj = ((Object[]) e.next());
//
//            for (Object obj : tab_obj) {
//                System.out.print(obj + " ");
//
//                System.out.println("");
//            }
//    }
}
