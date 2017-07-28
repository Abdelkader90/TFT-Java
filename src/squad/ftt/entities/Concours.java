package squad.ftt.entities;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;

/**
 *
 * @author Khaoula Issaoui
 */
public class Concours {
    
    private int id_Concour;
    private String libelle_concour;
    private Date date_debut_concour;
    private String lieu_concour;
    private String description_concours;
    private Float frais_participation;
    private Date date_debut_depot;
    private Date date_fin_depot;
    private String type_concour;

    public Concours() {
        
    }

    public int getId_Concour() {
        return id_Concour;
    }

    public void setId_Concour(int id_Concour) {
        this.id_Concour = id_Concour;
    }

    public String getLibelle_concour() {
        return libelle_concour;
    }

    public void setLibelle_concour(String libelle_concour) {
        this.libelle_concour = libelle_concour;
    }

    public Date getDate_debut_concour() {
        return date_debut_concour;
    }

    public void setDate_debut_concour(Date date_debut_concour) {
        this.date_debut_concour = date_debut_concour;
    }

    public String getLieu_concour() {
        return lieu_concour;
    }

    public void setLieu_concour(String lieu_concour) {
        this.lieu_concour = lieu_concour;
    }

    public String getDescription_concours() {
        return description_concours;
    }

    public void setDescription_concours(String description_concours) {
        this.description_concours = description_concours;
    }

    public Float getFrais_participation() {
        return frais_participation;
    }

    public void setFrais_participation(Float frais_participation) {
        this.frais_participation = frais_participation;
    }

    public Date getDate_debut_depot() {
        return date_debut_depot;
    }

    public void setDate_debut_depot(Date date_debut_depot) {
        this.date_debut_depot = date_debut_depot;
    }

    public Date getDate_fin_depot() {
        return date_fin_depot;
    }

    public void setDate_fin_depot(Date date_fin_depot) {
        this.date_fin_depot = date_fin_depot;
    }

    public String getType_concour() {
        return type_concour;
    }

    public void setType_concour(String type_concour) {
        this.type_concour = type_concour;
    }

    public Concours(int id_Concour, String libelle_concour, Date date_debut_concour, String lieu_concour, String description_concours, Float frais_participation, Date date_debut_depot, Date date_fin_depot, String type_concour) {
        this.id_Concour = id_Concour;
        this.libelle_concour = libelle_concour;
        this.date_debut_concour = date_debut_concour;
        this.lieu_concour = lieu_concour;
        this.description_concours = description_concours;
        this.frais_participation = frais_participation;
        this.date_debut_depot = date_debut_depot;
        this.date_fin_depot = date_fin_depot;
        this.type_concour = type_concour;
    }

    @Override
    public String toString() {
        return "Concours{" + "id_Concour=" + id_Concour + ", libelle_concour=" + libelle_concour + ", date_debut_concour=" + date_debut_concour + ", lieu_concour=" + lieu_concour + ", description_concours=" + description_concours + ", frais_participatio=" + frais_participation + ", date_debut_depot=" + date_debut_depot + ", date_fin_depot=" + date_fin_depot + ", type_concour=" + type_concour + '}';
    }

    

    
    

    

   
    
   
    
    
}


