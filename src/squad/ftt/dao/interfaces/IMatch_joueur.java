/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.interfaces;



import java.util.List;
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Match_has_joueur;
import squad.ftt.entities.Matchtennis;


/**
 *
 * @author hppro
 */
public interface IMatch_joueur {
    void addMatch_Joueur(Match_has_joueur a);
    void deleteMatch_Joueur(Match_has_joueur a);
    List<Match_has_joueur> findAll();
    List<Matchtennis> findByJoueur(Joueur j);
    List<Joueur> findByMatch(Matchtennis m);
    
}
