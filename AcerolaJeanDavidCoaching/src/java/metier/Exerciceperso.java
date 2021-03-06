package metier;
// Generated 27 mars 2019 12:04:47 by Hibernate Tools 4.3.1


import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Exerciceperso generated by hbm2java
 */
public class Exerciceperso  implements java.io.Serializable {


     private Integer codeep;
     private Seanceperso seanceperso;
     private String nomep;
     private byte[] descriptionmediaep;
     private String descriptiontxtep;
     private Integer tempsobjectifep;
     private Integer ordreep;
     private Integer nbseriep;
     private Integer tempsreposp;
     private Set faireexes = new HashSet(0);
     private Set objectifes = new HashSet(0);
     private Set repetitions = new HashSet(0);

    public Exerciceperso() {
    }

	
    public Exerciceperso(Seanceperso seanceperso) {
        this.seanceperso = seanceperso;
    }
    public Exerciceperso(Seanceperso seanceperso, String nomep, byte[] descriptionmediaep, String descriptiontxtep, Integer tempsobjectifep, Integer ordreep, Integer nbseriep, Integer tempsreposp, Set faireexes, Set objectifes, Set repetitions) {
       this.seanceperso = seanceperso;
       this.nomep = nomep;
       this.descriptionmediaep = descriptionmediaep;
       this.descriptiontxtep = descriptiontxtep;
       this.tempsobjectifep = tempsobjectifep;
       this.ordreep = ordreep;
       this.nbseriep = nbseriep;
       this.tempsreposp = tempsreposp;
       this.faireexes = faireexes;
       this.objectifes = objectifes;
       this.repetitions = repetitions;
    }
   
    public Integer getCodeep() {
        return this.codeep;
    }
    
    public void setCodeep(Integer codeep) {
        this.codeep = codeep;
    }
    public Seanceperso getSeanceperso() {
        return this.seanceperso;
    }
    
    public void setSeanceperso(Seanceperso seanceperso) {
        this.seanceperso = seanceperso;
    }
    public String getNomep() {
        return this.nomep;
    }
    
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
    public byte[] getDescriptionmediaep() {
        return this.descriptionmediaep;
    }
    
    public void setDescriptionmediaep(byte[] descriptionmediaep) {
        this.descriptionmediaep = descriptionmediaep;
    }
    public String getDescriptiontxtep() {
        return this.descriptiontxtep;
    }
    
    public void setDescriptiontxtep(String descriptiontxtep) {
        this.descriptiontxtep = descriptiontxtep;
    }
    public Integer getTempsobjectifep() {
        return this.tempsobjectifep;
    }
    
    public void setTempsobjectifep(Integer tempsobjectifep) {
        this.tempsobjectifep = tempsobjectifep;
    }
    public Integer getOrdreep() {
        return this.ordreep;
    }
    
    public void setOrdreep(Integer ordreep) {
        this.ordreep = ordreep;
    }
    public Integer getNbseriep() {
        return this.nbseriep;
    }
    
    public void setNbseriep(Integer nbseriep) {
        this.nbseriep = nbseriep;
    }
    public Integer getTempsreposp() {
        return this.tempsreposp;
    }
    
    public void setTempsreposp(Integer tempsreposp) {
        this.tempsreposp = tempsreposp;
    }
    public Set getFaireexes() {
        return this.faireexes;
    }
    
    public void setFaireexes(Set faireexes) {
        this.faireexes = faireexes;
    }
    public Set getObjectifes() {
        return this.objectifes;
    }
    
    public void setObjectifes(Set objectifes) {
        this.objectifes = objectifes;
    }
    public Set getRepetitions() {
        return this.repetitions;
    }
    
    public void setRepetitions(Set repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeep);
        hash = 23 * hash + Objects.hashCode(this.nomep);
        hash = 23 * hash + Arrays.hashCode(this.descriptionmediaep);
        hash = 23 * hash + Objects.hashCode(this.descriptiontxtep);
        hash = 23 * hash + Objects.hashCode(this.tempsobjectifep);
        hash = 23 * hash + Objects.hashCode(this.ordreep);
        hash = 23 * hash + Objects.hashCode(this.nbseriep);
        hash = 23 * hash + Objects.hashCode(this.tempsreposp);
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
        final Exerciceperso other = (Exerciceperso) obj;
        if (!Objects.equals(this.nomep, other.nomep)) {
            return false;
        }
        if (!Objects.equals(this.descriptiontxtep, other.descriptiontxtep)) {
            return false;
        }
        if (!Objects.equals(this.codeep, other.codeep)) {
            return false;
        }
        if (!Arrays.equals(this.descriptionmediaep, other.descriptionmediaep)) {
            return false;
        }
        if (!Objects.equals(this.tempsobjectifep, other.tempsobjectifep)) {
            return false;
        }
        if (!Objects.equals(this.ordreep, other.ordreep)) {
            return false;
        }
        if (!Objects.equals(this.nbseriep, other.nbseriep)) {
            return false;
        }
        if (!Objects.equals(this.tempsreposp, other.tempsreposp)) {
            return false;
        }
        return true;
    }




}


