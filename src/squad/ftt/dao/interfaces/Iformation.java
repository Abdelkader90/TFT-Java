package squad.ftt.dao.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import squad.ftt.entities.Formation;

/**
 *
 * @author Maynoo
 */
public interface Iformation {
    
    void add(Formation f);
    void update(Formation f);
    void delete (Formation f);
    List<Formation> findAll();
    Formation findOne(int id);
    
}
