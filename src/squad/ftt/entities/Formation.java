/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Date;

/**
 *
 * @author pc Sana
 */
public class Formation {
    int id_Formation; 
    String libelle_formation;
    String 	grade;
   Utilisateur  formateur ;
    Date date_debut_formation;
    Date date_fin_formation;
    Date date_debut_postilation;
    Date date_fin_postilation;
    Float frais_formation;

    public int getId_Formation() {
        return id_Formation;
    }

    public void setId_Formation(int id_Formation) {
        this.id_Formation = id_Formation;
    }

    public String getLibelle_formation() {
        return libelle_formation;
    }

    public void setLibelle_formation(String libelle_formation) {
        this.libelle_formation = libelle_formation;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

   public Utilisateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Utilisateur formateur) {
        this.formateur = formateur;
    }

    public Date getDate_debut_formation() {
        return date_debut_formation;
    }

    public void setDate_debut_formation(Date date_debut_formation) {
        this.date_debut_formation = date_debut_formation;
    }

    public Date getDate_fin_formation() {
        return date_fin_formation;
    }

    public void setDate_fin_formation(Date date_fin_formation) {
        this.date_fin_formation = date_fin_formation;
    }

    public Date getDate_debut_postilation() {
        return date_debut_postilation;
    }

    public void setDate_debut_postilation(Date date_debut_postilation) {
        this.date_debut_postilation = date_debut_postilation;
    }

    public Date getDate_fin_postilation() {
        return date_fin_postilation;
    }

    public void setDate_fin_postilation(Date date_fin_postilation) {
        this.date_fin_postilation = date_fin_postilation;
    }

    public Float getFrais_formation() {
        return frais_formation;
    }

    public void setFrais_formation(Float frais_formation) {
        this.frais_formation = frais_formation;
    }
    
    
    
    
}
