/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.interfaces;

import java.util.List;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.SetTennis;

/**
 *
 * @author hppro
 */
public interface ISetTennis {
    void addSetTennis(SetTennis setTennis);
    void updateSetTennis(SetTennis setTennis);
    void removeSets(int id);
    SetTennis findSetTennisById(int id);
    List<SetTennis> findSetTennisByMatch(Matchtennis matchTennis);
}
