/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Objects;

/**
 *
 * @author 21611960
 */
public class IDObjectifE {
    private int codeoe;
    private String libelleoe;

    public IDObjectifE(int codeoe, String libelleoe) {
        this.codeoe = codeoe;
        this.libelleoe = libelleoe;
    }

    public int getCodeoe() {
        return codeoe;
    }

    public void setCodeoe(int codeoe) {
        this.codeoe = codeoe;
    }

    public String getLibelleoe() {
        return libelleoe;
    }

    public void setLibelleoe(String libelleoe) {
        this.libelleoe = libelleoe;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.codeoe ^ (this.codeoe >>> 32));
        hash = 53 * hash + Objects.hashCode(this.libelleoe);
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
        final IDObjectifE other = (IDObjectifE) obj;
        if (this.codeoe != other.codeoe) {
            return false;
        }
        if (!Objects.equals(this.libelleoe, other.libelleoe)) {
            return false;
        }
        return true;
    }


    
}
