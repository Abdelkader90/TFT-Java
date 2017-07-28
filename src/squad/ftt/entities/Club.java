/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Blob;

/**
 *
 * @author Gadour
 */
public class Club {
    private int id_Club;
    private String libelle_club;
    private String emplacement_club;
    private int nbre_terrains;
    private String descritption_club;
    private String img_club;
    private Blob img_club_blob;
    private String pic;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getId_Club() {
        return id_Club;
    }

    public void setId_Club(int id_Club) {
        this.id_Club = id_Club;
    }

    public String getLibelle_club() {
        return libelle_club;
    }

    public void setLibelle_club(String libelle_club) {
        this.libelle_club = libelle_club;
    }

    public String getEmplacement_club() {
        return emplacement_club;
    }

    public void setEmplacement_club(String emplacement_club) {
        this.emplacement_club = emplacement_club;
    }

    public int getNbre_terrains() {
        return nbre_terrains;
    }

    public void setNbre_terrains(int nbre_terrains) {
        this.nbre_terrains = nbre_terrains;
    }

    public String getDescritption_club() {
        return descritption_club;
    }

    public void setDescritption_club(String descritption_club) {
        this.descritption_club = descritption_club;
    }

    public String getImg_club() {
        return img_club;
    }

    public void setImg_club(String img_club) {
        this.img_club = img_club;
    }

    public Blob getImg_club_blob() {
        return img_club_blob;
    }

    public void setImg_club_blob(Blob img_club_blob) {
        this.img_club_blob = img_club_blob;
    }

    public Club() {
    }

    public Club(String libelle_club, String emplacement_club, int nbre_terrains, String descritption_club, String img_club, Blob img_club_blob, String pic) {
        this.libelle_club = libelle_club;
        this.emplacement_club = emplacement_club;
        this.nbre_terrains = nbre_terrains;
        this.descritption_club = descritption_club;
        this.img_club = img_club;
        this.img_club_blob= img_club_blob;
        this.pic= pic;
    }

 
}
