package metier;
// Generated 27 mars 2019 10:56:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Repetition generated by hbm2java
 */
public class Repetition  implements java.io.Serializable {


     private int nbfois;
     private Set exercicepersos = new HashSet(0);
     private Set exercicestandards = new HashSet(0);

    public Repetition() {
    }

	
    public Repetition(int nbfois) {
        this.nbfois = nbfois;
    }
    public Repetition(int nbfois, Set exercicepersos, Set exercicestandards) {
       this.nbfois = nbfois;
       this.exercicepersos = exercicepersos;
       this.exercicestandards = exercicestandards;
    }
   
    public int getNbfois() {
        return this.nbfois;
    }
    
    public void setNbfois(int nbfois) {
        this.nbfois = nbfois;
    }
    public Set getExercicepersos() {
        return this.exercicepersos;
    }
    
    public void setExercicepersos(Set exercicepersos) {
        this.exercicepersos = exercicepersos;
    }
    public Set getExercicestandards() {
        return this.exercicestandards;
    }
    
    public void setExercicestandards(Set exercicestandards) {
        this.exercicestandards = exercicestandards;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.nbfois;
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
        final Repetition other = (Repetition) obj;
        if (this.nbfois != other.nbfois) {
            return false;
        }
        return true;
    }




}

