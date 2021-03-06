package metier;
// Generated 27 mars 2019 12:04:47 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private Integer codec;
     private Profil profil;
     private String nomc;
     private String prenomc;
     private String adremailc;
     private Date datenaisc;
     private String telc;
     private String sexec;
     private String motdepassec;
     private Double poidsc;
     private Set typeabonnements = new HashSet(0);
     private Set programmepersos = new HashSet(0);
     private Set faireexes = new HashSet(0);
     private Set objectifcs = new HashSet(0);

    public Client() {
    }

	//yuwei
    public Client(Profil profil) {
        this.profil = profil;
    }
    public Client(Profil profil, String nomc, String prenomc, String adremailc, Date datenaisc, String telc, String sexec, String motdepassec, Double poidsc, Set typeabonnements, Set programmepersos, Set faireexes, Set objectifcs) {
       this.profil = profil;
       this.nomc = nomc;
       this.prenomc = prenomc;
       this.adremailc = adremailc;
       this.datenaisc = datenaisc;
       this.telc = telc;
       this.sexec = sexec;
       this.motdepassec = motdepassec;
       this.poidsc = poidsc;
       this.typeabonnements = typeabonnements;
       this.programmepersos = programmepersos;
       this.faireexes = faireexes;
       this.objectifcs = objectifcs;
    }
   
    public Integer getCodec() {
        return this.codec;
    }
    
    public void setCodec(Integer codec) {
        this.codec = codec;
    }
    public Profil getProfil() {
        return this.profil;
    }
    
    public void setProfil(Profil profil) {
        this.profil = profil;
    }
    public String getNomc() {
        return this.nomc;
    }
    
    public void setNomc(String nomc) {
        this.nomc = nomc;
    }
    public String getPrenomc() {
        return this.prenomc;
    }
    
    public void setPrenomc(String prenomc) {
        this.prenomc = prenomc;
    }
    public String getAdremailc() {
        return this.adremailc;
    }
    
    public void setAdremailc(String adremailc) {
        this.adremailc = adremailc;
    }
    public Date getDatenaisc() {
        return this.datenaisc;
    }
    
    public void setDatenaisc(Date datenaisc) {
        this.datenaisc = datenaisc;
    }
    public String getTelc() {
        return this.telc;
    }
    
    public void setTelc(String telc) {
        this.telc = telc;
    }
    public String getSexec() {
        return this.sexec;
    }
    
    public void setSexec(String sexec) {
        this.sexec = sexec;
    }
    public String getMotdepassec() {
        return this.motdepassec;
    }
    
    public void setMotdepassec(String motdepassec) {
        this.motdepassec = motdepassec;
    }
    public Double getPoidsc() {
        return this.poidsc;
    }
    
    public void setPoidsc(Double poidsc) {
        this.poidsc = poidsc;
    }
    public Set getTypeabonnements() {
        return this.typeabonnements;
    }
    
    public void setTypeabonnements(Set typeabonnements) {
        this.typeabonnements = typeabonnements;
    }
    public Set getProgrammepersos() {
        return this.programmepersos;
    }
    
    public void setProgrammepersos(Set programmepersos) {
        this.programmepersos = programmepersos;
    }
    public Set getFaireexes() {
        return this.faireexes;
    }
    
    public void setFaireexes(Set faireexes) {
        this.faireexes = faireexes;
    }
    public Set getObjectifcs() {
        return this.objectifcs;
    }
    
    public void setObjectifcs(Set objectifcs) {
        this.objectifcs = objectifcs;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codec);
        hash = 53 * hash + Objects.hashCode(this.nomc);
        hash = 53 * hash + Objects.hashCode(this.prenomc);
        hash = 53 * hash + Objects.hashCode(this.adremailc);
        hash = 53 * hash + Objects.hashCode(this.datenaisc);
        hash = 53 * hash + Objects.hashCode(this.telc);
        hash = 53 * hash + Objects.hashCode(this.sexec);
        hash = 53 * hash + Objects.hashCode(this.motdepassec);
        hash = 53 * hash + Objects.hashCode(this.poidsc);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.nomc, other.nomc)) {
            return false;
        }
        if (!Objects.equals(this.prenomc, other.prenomc)) {
            return false;
        }
        if (!Objects.equals(this.adremailc, other.adremailc)) {
            return false;
        }
        if (!Objects.equals(this.telc, other.telc)) {
            return false;
        }
        if (!Objects.equals(this.sexec, other.sexec)) {
            return false;
        }
        if (!Objects.equals(this.motdepassec, other.motdepassec)) {
            return false;
        }
        if (!Objects.equals(this.codec, other.codec)) {
            return false;
        }
        if (!Objects.equals(this.datenaisc, other.datenaisc)) {
            return false;
        }
        if (!Objects.equals(this.poidsc, other.poidsc)) {
            return false;
        }
        return true;
    }




}


