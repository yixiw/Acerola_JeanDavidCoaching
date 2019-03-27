package metier;
// Generated 27 mars 2019 10:56:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Objectife generated by hbm2java
 */
public class Objectife  implements java.io.Serializable {


     private Integer codeoe;
     private String libelleoe;
     private Set exercicepersos = new HashSet(0);
     private Set exercicestandards = new HashSet(0);

    public Objectife() {
    }

    public Objectife(String libelleoe, Set exercicepersos, Set exercicestandards) {
       this.libelleoe = libelleoe;
       this.exercicepersos = exercicepersos;
       this.exercicestandards = exercicestandards;
    }
   
    public Integer getCodeoe() {
        return this.codeoe;
    }
    
    public void setCodeoe(Integer codeoe) {
        this.codeoe = codeoe;
    }
    public String getLibelleoe() {
        return this.libelleoe;
    }
    
    public void setLibelleoe(String libelleoe) {
        this.libelleoe = libelleoe;
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
        hash = 17 * hash + Objects.hashCode(this.codeoe);
        hash = 17 * hash + Objects.hashCode(this.libelleoe);
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
        final Objectife other = (Objectife) obj;
        if (!Objects.equals(this.libelleoe, other.libelleoe)) {
            return false;
        }
        if (!Objects.equals(this.codeoe, other.codeoe)) {
            return false;
        }
        return true;
    }




}

