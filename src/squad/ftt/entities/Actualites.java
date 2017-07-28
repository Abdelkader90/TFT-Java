/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Date;

/**
 *
 * @author rached   
 */
public class Actualites {

    private int idActualite;
    private String titre;
    private String corps;
    private Date dateRedaction;
    private String etat;
    private String photo;

    public Actualites(String titre, String corps, Date dateRedaction, String etat, String photo) {
        this.titre = titre;
        this.corps = corps;
        this.dateRedaction = dateRedaction;
        this.etat = etat;
        this.photo = photo;
    }

    public Actualites() {
    }
    
    public int getIdActualite() {
        return idActualite;
    }

    public void setIdActualite(int idActualite) {
        this.idActualite = idActualite;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Date getDateRedaction() {
        return dateRedaction;
    }

    public void setDateRedaction(Date dateRedaction) {
        this.dateRedaction = dateRedaction;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    
    
}

