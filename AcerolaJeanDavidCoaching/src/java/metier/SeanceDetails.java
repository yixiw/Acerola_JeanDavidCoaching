/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rihab
 */
public class SeanceDetails {

    private int ordre;
    private String nomEx;
    private String type;
    private Integer nbseries;
    private String repetition;
    private Integer tempsreposs;
    private Integer duree;

    public SeanceDetails() {
    }

    public SeanceDetails(int ordre, String nomEx, String type, Integer nbseries, String repetition, Integer tempsreposs, Integer duree) {
        this.ordre = ordre;
        this.nomEx = nomEx;
        this.type = type;
        this.nbseries = nbseries;
        this.repetition = repetition;
        this.tempsreposs = tempsreposs;
        this.duree = duree;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getNomEx() {
        return nomEx;
    }

    public void setNomEx(String nomEx) {
        this.nomEx = nomEx;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNbseries() {
        return nbseries;
    }

    public void setNbseries(Integer nbseries) {
        this.nbseries = nbseries;
    }

    public String getRepetition() {
        return repetition;
    }

    public void setRepetition(String repetition) {
        this.repetition = repetition;
    }

    public Integer getTempsreposs() {
        return tempsreposs;
    }

    public void setTempsreposs(Integer tempsreposs) {
        this.tempsreposs = tempsreposs;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

}
