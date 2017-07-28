package squad.ftt.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import squad.ftt.entities.Concours;
import squad.ftt.entities.Formation;
import squad.ftt.entities.Utilisateur;

/**
 *
 * @author pc Sana
 */
public class Postulation {
    int id_Postulation;
    Concours concours;
    Formation formation;
    Utilisateur user;
    int  nbre_match;
    String cv_arbitre;
int Concours_id_Concour;
int Formation_id_Formation;
    public Postulation(int id_Postulation, Concours concours, Formation formation, Utilisateur user, int nbre_match, String cv_arbitre, int anciennete) {
        this.id_Postulation = id_Postulation;
        this.concours = concours;
        this.formation = formation;
        this.user = user;
        this.nbre_match = nbre_match;
        this.cv_arbitre = cv_arbitre;
        this.anciennete = anciennete;
    }

    public int getFormation_id_Formation() {
        return Formation_id_Formation;
    }

    public void setFormation_id_Formation(int Formation_id_Formation) {
        this.Formation_id_Formation = Formation_id_Formation;
    }

    public int getConcours_id_Concour() {
        return Concours_id_Concour;
    }

    public void setConcours_id_Concour(int Concours_id_Concour) {
        this.Concours_id_Concour = Concours_id_Concour;
    }

    
    
    public String getCv_arbitre() {
        return cv_arbitre;
    }

    public void setCv_arbitre(String cv_arbitre) {
        this.cv_arbitre = cv_arbitre;
    }
   

    public int getId_Postulation() {
        return id_Postulation;
    }

    public void setId_Postulation(int id_Postulation) {
        this.id_Postulation = id_Postulation;
    }

    public int getNbre_match() {
        return nbre_match;
    }

    public void setNbre_match(int nbre_match) {
        this.nbre_match = nbre_match;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }
    int anciennete;

    public Postulation() {
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) { 
        this.user = user;
    }

    public Concours getConcours() {
        return concours;
    }

    public void setConcours(Concours concours) {
        this.concours = concours;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
    
    
    
    
}
