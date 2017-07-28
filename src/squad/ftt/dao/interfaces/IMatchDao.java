/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.interfaces;

/**
 *
 * @author hppro
 */
import java.sql.Date;
import java.util.List;
import squad.ftt.entities.Matchtennis;


public interface IMatchDao {
    void addMatch(Matchtennis match);

    void updateMatch(Matchtennis match);

    void removeMatchById(int id_match);

    List<Matchtennis> findAll();

    Matchtennis findMatchById(int id_match);
    
    List<Matchtennis> findMatchByDate(Date date_match) ;

    
   

    
}
