package metier;
// Generated 27 mars 2019 10:56:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Objectifc generated by hbm2java
 */
public class Objectifc  implements java.io.Serializable {


     private Integer codeoc;
     private String libelleoc;
     private Set clients = new HashSet(0);

    public Objectifc() {
    }

    public Objectifc(String libelleoc, Set clients) {
       this.libelleoc = libelleoc;
       this.clients = clients;
    }
   
    public Integer getCodeoc() {
        return this.codeoc;
    }
    
    public void setCodeoc(Integer codeoc) {
        this.codeoc = codeoc;
    }
    public String getLibelleoc() {
        return this.libelleoc;
    }
    
    public void setLibelleoc(String libelleoc) {
        this.libelleoc = libelleoc;
    }
    public Set getClients() {
        return this.clients;
    }
    
    public void setClients(Set clients) {
        this.clients = clients;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codeoc);
        hash = 97 * hash + Objects.hashCode(this.libelleoc);
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
        final Objectifc other = (Objectifc) obj;
        if (!Objects.equals(this.libelleoc, other.libelleoc)) {
            return false;
        }
        if (!Objects.equals(this.codeoc, other.codeoc)) {
            return false;
        }
        return true;
    }




}

