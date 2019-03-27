/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.List;
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
        * Retour de la requête sous forme d'une liste de tableau d'objets SeanceStandard.
     * @param bilan
     * @return 
    */
    public  static List<Seancestandard> consulterListeSeance (int bilan)  {
       
        List listeSeance;
        listeSeance = (List) session.createQuery("FROM Seancestandard s where bilanss ="+bilan).list();
        
        return listeSeance;
    
    }
}
