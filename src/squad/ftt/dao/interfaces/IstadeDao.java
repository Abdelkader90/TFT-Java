/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.interfaces;

import squad.ftt.entities.Stade;
import java.util.List;

/**
 *
 * @author hppro
 */
public interface IstadeDao {
    void addStade(Stade stade);

    void updateStade(Stade stade);

    void removeStadeByLibelle(String libelle);

    void removeSatdeById(int id_stade);

    List<Stade> findAll();

    Stade findStadeById(int id_stade);

    Stade findStadeByLibelle(String libelle);

    Stade findLastStade();

    
}
