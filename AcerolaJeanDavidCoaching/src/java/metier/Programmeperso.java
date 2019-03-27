package metier;
// Generated 27 mars 2019 12:04:47 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Programmeperso generated by hbm2java
 */
public class Programmeperso  implements java.io.Serializable {


     private Integer codepp;
     private Client client;
     private Employe employe;
     private String nompp;
     private String descriptionpp;
     private Date datedeb;
     private Integer nbsemainep;
     private Integer fcrepos;
     private Set seancepersos = new HashSet(0);

    public Programmeperso() {
    }

	
    public Programmeperso(Client client, Employe employe) {
        this.client = client;
        this.employe = employe;
    }
    public Programmeperso(Client client, Employe employe, String nompp, String descriptionpp, Date datedeb, Integer nbsemainep, Integer fcrepos, Set seancepersos) {
       this.client = client;
       this.employe = employe;
       this.nompp = nompp;
       this.descriptionpp = descriptionpp;
       this.datedeb = datedeb;
       this.nbsemainep = nbsemainep;
       this.fcrepos = fcrepos;
       this.seancepersos = seancepersos;
    }
   
    public Integer getCodepp() {
        return this.codepp;
    }
    
    public void setCodepp(Integer codepp) {
        this.codepp = codepp;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Employe getEmploye() {
        return this.employe;
    }
    
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    public String getNompp() {
        return this.nompp;
    }
    
    public void setNompp(String nompp) {
        this.nompp = nompp;
    }
    public String getDescriptionpp() {
        return this.descriptionpp;
    }
    
    public void setDescriptionpp(String descriptionpp) {
        this.descriptionpp = descriptionpp;
    }
    public Date getDatedeb() {
        return this.datedeb;
    }
    
    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }
    public Integer getNbsemainep() {
        return this.nbsemainep;
    }
    
    public void setNbsemainep(Integer nbsemainep) {
        this.nbsemainep = nbsemainep;
    }
    public Integer getFcrepos() {
        return this.fcrepos;
    }
    
    public void setFcrepos(Integer fcrepos) {
        this.fcrepos = fcrepos;
    }
    public Set getSeancepersos() {
        return this.seancepersos;
    }
    
    public void setSeancepersos(Set seancepersos) {
        this.seancepersos = seancepersos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codepp);
        hash = 79 * hash + Objects.hashCode(this.nompp);
        hash = 79 * hash + Objects.hashCode(this.descriptionpp);
        hash = 79 * hash + Objects.hashCode(this.datedeb);
        hash = 79 * hash + Objects.hashCode(this.nbsemainep);
        hash = 79 * hash + Objects.hashCode(this.fcrepos);
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
        final Programmeperso other = (Programmeperso) obj;
        if (!Objects.equals(this.nompp, other.nompp)) {
            return false;
        }
        if (!Objects.equals(this.descriptionpp, other.descriptionpp)) {
            return false;
        }
        if (!Objects.equals(this.codepp, other.codepp)) {
            return false;
        }
        if (!Objects.equals(this.datedeb, other.datedeb)) {
            return false;
        }
        if (!Objects.equals(this.nbsemainep, other.nbsemainep)) {
            return false;
        }
        if (!Objects.equals(this.fcrepos, other.fcrepos)) {
            return false;
        }
        return true;
    }




}


