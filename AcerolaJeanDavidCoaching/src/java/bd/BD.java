/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.Iterator;
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
        * cette fonction permet de chercher les séances par type de séance.
     * @param bilan
     * @return 
    */
    public  static List<Seancestandard> consulterTypeSeance (int bilan)  {
       
        List listeSeance;
        listeSeance = (List) session.createQuery("FROM Seancestandard s where bilanss ="+bilan).list();
        
        return listeSeance;
    
    }
     /**
        * cette fonction permet de chercher les séances par nom
     * @param nom
     * @return 
    */
    public  static List<Seancestandard> consulterNomSeance (String nom)  {
       
        List listeSeance;
        listeSeance = (List) session.createQuery("FROM Seancestandard s where nomss ="+nom).list();
        
        return listeSeance;
    
    }
    public  static List afficherDetailSeance (String nomSeance)  {
       
        List listeExercice;
        listeExercice = (List) session.createQuery("Select e.nomes,c.nbseries,c.tempsreposs,SUM(e.tempsobjectifes) "+
                                                   "FROM Exercicestandard e,Seancestandard s,Contenires c where c.exercicestandard.codees=e.codees,"+
                                                    "s.codess= c.seancestandard.codess,s.nomss ="+nomSeance).list();
        
        return listeExercice;
    
    }
     public static void main (String [] s)
    {
        
        Transaction t = session.beginTransaction();
        
//        List<Seancestandard>  ll;
//        ll = consulterTypeSeance(0);
//      
//        System.out.print(ll);
        List  l = afficherDetailSeance("Échauffement");
          Iterator e = l.iterator();
		while (e.hasNext())
			{
			Object[] tab_obj = ((Object[]) e.next());

			for (Object obj : tab_obj)
				System.out.print(obj + " ");
            
        }
        
        
    
    }
}
