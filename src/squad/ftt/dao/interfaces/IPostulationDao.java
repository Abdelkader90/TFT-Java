package squad.ftt.dao.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import squad.ftt.entities.Concours;
import squad.ftt.entities.Postulation;

/**
 *
 * @author pc Sana
 */
public interface IPostulationDao {
    public void ajouterPostulation(Postulation p);
    public List<Concours> DisplayConcoursByGrade(String grade);
    
    
    
    
    
    
}
