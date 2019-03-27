package metier;
// Generated 27 mars 2019 10:56:33 by Hibernate Tools 4.3.1

import java.util.Objects;




/**
 * Faireexe generated by hbm2java
 */
public class Faireexe  implements java.io.Serializable {


     private FaireexeId id;
     private Client client;
     private Exerciceperso exerciceperso;
     private Integer tempsrealise;
     private String difficulte;
     private String commentaire;

    public Faireexe() {
    }

	
    public Faireexe(FaireexeId id, Client client, Exerciceperso exerciceperso) {
        this.id = id;
        this.client = client;
        this.exerciceperso = exerciceperso;
    }
    public Faireexe(FaireexeId id, Client client, Exerciceperso exerciceperso, Integer tempsrealise, String difficulte, String commentaire) {
       this.id = id;
       this.client = client;
       this.exerciceperso = exerciceperso;
       this.tempsrealise = tempsrealise;
       this.difficulte = difficulte;
       this.commentaire = commentaire;
    }
   
    public FaireexeId getId() {
        return this.id;
    }
    
    public void setId(FaireexeId id) {
        this.id = id;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Exerciceperso getExerciceperso() {
        return this.exerciceperso;
    }
    
    public void setExerciceperso(Exerciceperso exerciceperso) {
        this.exerciceperso = exerciceperso;
    }
    public Integer getTempsrealise() {
        return this.tempsrealise;
    }
    
    public void setTempsrealise(Integer tempsrealise) {
        this.tempsrealise = tempsrealise;
    }
    public String getDifficulte() {
        return this.difficulte;
    }
    
    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }
    public String getCommentaire() {
        return this.commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.client);
        hash = 53 * hash + Objects.hashCode(this.tempsrealise);
        hash = 53 * hash + Objects.hashCode(this.difficulte);
        hash = 53 * hash + Objects.hashCode(this.commentaire);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Faireexe other = (Faireexe) obj;
        if (!Objects.equals(this.difficulte, other.difficulte)) {
            return false;
        }
        if (!Objects.equals(this.commentaire, other.commentaire)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        if (!Objects.equals(this.tempsrealise, other.tempsrealise)) {
            return false;
        }
        return true;
    }




}


