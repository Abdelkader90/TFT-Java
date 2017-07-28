/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.interfaces;

import java.util.List;

/**
 *
 * @author Gadour
 */
public interface IDAO<T> {
    
    void Ajouter(T t);
    void Modifier(T t);
    void Supprimer(T t);
    List<T> Afficher();
    T RechercherParId(int id);
    
    
    
}
