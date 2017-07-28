/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

/**
 *
 * @author Maynoo
 */
public class Match_has_joueur {
    int id_match_has_joueur;
    Matchtennis match;
    Joueur joueur;

    public Match_has_joueur() {
    }

    public Match_has_joueur(Matchtennis match, Joueur joueur) {
        this.match = match;
        this.joueur = joueur;
    }

    public int getId_match_has_joueur() {
        return id_match_has_joueur;
    }

    public void setId_match_has_joueur(int id_match_has_joueur) {
        this.id_match_has_joueur = id_match_has_joueur;
    }

    public Matchtennis getMatch() {
        return match;
    }

    public void setMatch(Matchtennis match) {
        this.match = match;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
    
    
    
}
