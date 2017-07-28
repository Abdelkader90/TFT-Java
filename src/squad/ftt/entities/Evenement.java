/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Date;
import java.util.*;



/**
 *
 * @author hppro
 */
public class Evenement { 
    private int id_event;
    private String libelle;
    private Date date_debut;
    private Date date_fin;
    private String site;
    private String type;
    private List<Tour> tour;
    private int nombreJoueur;
    private String image;  

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public Evenement(){
        
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public Evenement( String libelle,Date date_debut, Date date_fin,String site,String type ,int nb){
   
        this.date_debut=date_debut;
        this.date_fin=date_fin;
        this.libelle=libelle;
        this.site=site;
        this.type=type;
        this.nombreJoueur=nb;
 
    }
     public int getId_event() {
        return id_event;
    }

    public int getNombreJoueur() {
        return nombreJoueur;
    }

    public void setNombreJoueur(int nombreJoueur) 
    {
        this.nombreJoueur = nombreJoueur;
    }  
    public String getLibelle() {
        return libelle;
    }

   
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    
    public Date getDate_debut() {
        return date_debut;
    }

    
    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    
    public Date getDate_fin() {
        return date_fin;
    }

    
    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    
    public String getSite() {
        return site;
    }

    
    public void setSite(String site) {
        this.site = site;
    }

   
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }
    
    public void initTour()
    {
           
    }    
    



}
