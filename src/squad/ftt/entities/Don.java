/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Date;

/**
 *
 * @author Gadour
 */
public class Don {
    
    private int id_Don;
    private float somme;
    private Date date_don;
    private Club club;

    public int getId_Don() {
        return id_Don;
    }

    public void setId_Don(int id_Don) {
        this.id_Don = id_Don;
    }

    public float getSomme() {
        return somme;
    }

    public void setSomme(float somme) {
        this.somme = somme;
    }

    public Date getDate_don() {
        return date_don;
    }

    public void setDate_don(Date date_don) {
        this.date_don = date_don;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Don() {
    }

    public Don(float somme, Date date_don, Club club) {
        this.somme = somme;
        this.date_don = date_don;
        this.club = club;
    }

    
    
    
    
}
