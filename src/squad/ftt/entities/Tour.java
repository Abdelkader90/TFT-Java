/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author r
 */

public class Tour implements Serializable {


 
    private int id;
    private int nombreMatch;
    private List<Matchtennis> matchs;
    private Evenement evenement;
    private int nbPoint;

    public Tour( int nbreMatch , int nbPoint , Evenement evt) {
        this.evenement=evt;
        this.nombreMatch=nbreMatch;
        this.nbPoint=nbPoint;
    }

    public Tour() {
    }

   
    
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
        return hash;
    }

    public Tour(int nombreMatch) {
        this.nombreMatch=nombreMatch;
        this.matchs = new ArrayList<>();   
    }
    public void AjouterMatch(Matchtennis m) {
        this.getMatchs().add(m);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tour other = (Tour) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombreMatch() {
        return nombreMatch;
    }

    public void setNombreMatch(int nombreMatch) {
        this.nombreMatch = nombreMatch;
    }

    /**
     * @return the evenement
     */
    public Evenement getEvenement() {
        return evenement;
    }

    /**
     * @param evenement the evenement to set
     */
    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    /**
     * @return the matchs
     */
    public List<Matchtennis> getMatchs() {
        return matchs;
    }

    /**
     * @param matchs the matchs to set
     */
    public void setMatchs(List<Matchtennis> matchs) {
        this.matchs = matchs;
    }

    /**
     * @return the nbPoint
     */
    public int getNbPoint() {
        return nbPoint;
    }

    /**
     * @param nbPoint the nbPoint to set
     */
    public void setNbPoint(int nbPoint) {
        this.nbPoint = nbPoint;
    }


}
