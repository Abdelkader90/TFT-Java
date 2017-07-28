/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.interfaces;

import squad.ftt.entities.Joueur;
import java.util.List;

/**
 *
 * @author hppro
 */
public interface Ijoueur {
    void ajouterJoueur(Joueur joueur);

    void modifierJoueur(Joueur joueur);

    void supprimerJoueur(Joueur joueur);


    List<Joueur> findAll();

    Joueur findJoueurByCin(double cin);


    
}
