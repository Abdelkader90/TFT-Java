package squad.ftt.dao.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import squad.ftt.entities.Arbitre;
import java.util.List;
/**
 *
 * @author pc Sana
 */
public interface IArbitreDao {
    public void ajouterArbitre(Arbitre p);
    public Arbitre findUserByCin(double cin_Arbitre);
     public List<Arbitre> findAll();
     public void removeArbitreByCin(Double cin_Arbitre);
     public void modifierArbitre(Arbitre a);
    
   
    
}
