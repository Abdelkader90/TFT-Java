package squad.ftt.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;
import squad.ftt.entities.Utilisateur;

/**
 *
 * @author pc Sana
 */
public class Disponibiliter {
    int id_Dispo;
    Date date_empechement;
    Utilisateur user;


    public Disponibiliter(int id_Dispo, Date date_empechement, Utilisateur user) {
        this.id_Dispo = id_Dispo;
        this.date_empechement = date_empechement;
        this.user = user;
    }

    public Disponibiliter() {
    }

    
    public int getId_Dispo() {
        return id_Dispo;
    }

    public void setId_Dispo(int id_Dispo) {
        this.id_Dispo = id_Dispo;
    }

    public Date getDate_empechement() {
        return date_empechement;
    }

    public void setDate_empechement(Date date_empechement) {
        this.date_empechement = date_empechement;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

     
    
    
}

