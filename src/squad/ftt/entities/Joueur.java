/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Blob;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hppro
 */
public class Joueur {
    private double cin_joueur;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private String categorie;
    private int point_aquis;
    private int taille;
    private int poids;
    private String main_forte;
    private String nationalite;
    private Club club;
    private Blob img_joueur;
    private String picture;
    private boolean selected;
    private String pic;
    
    
    private List<Matchtennis> listMatch_joueur;

    /**
     * @return the cin_joueur
     */
    public double getCin_joueur() {
        return cin_joueur;
    }

    /**
     * @param cin_joueur the cin_joueur to set
     */
    public void setCin_joueur(double cin_joueur) {
        this.cin_joueur = cin_joueur;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the date_naissance
     */
    public Date getDate_naissance() {
        return date_naissance;
    }

    /**
     * @param date_naissance the date_naissance to set
     */
    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    /**
     * @return the categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the point_aquis
     */
    public int getPoint_aquis() {
        return point_aquis;
    }

    /**
     * @param point_aquis the point_aquis to set
     */
    public void setPoint_aquis(int point_aquis) {
        this.point_aquis = point_aquis;
    }

    /**
     * @return the tail
     */
    public int getTaille() {
        return taille;
    }

    /**
     * @param tail the tail to set
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    /**
     * @return the main_forte
     */
    public String getMain_forte() {
        return main_forte;
    }

    /**
     * @param main_forte the main_forte to set
     */
    public void setMain_forte(String main_forte) {
        this.main_forte = main_forte;
    }

    /**
     * @return the nationalite
     */
    public String getNationalite() {
        return nationalite;
    }

    /**
     * @param nationalite the nationalite to set
     */
    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    /**
     * @return the listMatch_joueur
     */
    public List<Matchtennis> getListMatch_joueur() {
        return listMatch_joueur;
    }

    /**
     * @param listMatch_joueur the listMatch_joueur to set
     */
    public void setListMatch_joueur(List<Matchtennis> listMatch_joueur) {
        this.listMatch_joueur = listMatch_joueur;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Blob getImg_joueur() {
        return img_joueur;
    }

    public void setImg_joueur(Blob img_joueur) {
        this.img_joueur = img_joueur;
    }



    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    public Joueur(){
        
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    
    
    public Joueur(double cin_joueur, String nom, String prenom, Date date_naissance, String categorie, int point_aquis, int taille, int poids, String main_forte, String nationalite, Club club, Blob img_joueur, String picture,String pic) {
        this.cin_joueur = cin_joueur;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.categorie = categorie;
        this.point_aquis = point_aquis;
        this.taille = taille;
        this.poids = poids;
        this.main_forte = main_forte;
        this.nationalite = nationalite;
        this.club = club;
        this.img_joueur = img_joueur;
        this.picture = picture;
        this.pic = pic;
    }
    
    
}
