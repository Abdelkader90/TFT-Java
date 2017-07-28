/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import squad.ftt.dao.classes.JoueurDao;
import squad.ftt.entities.Joueur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gadour
 */
public class JoueurAdapter extends AbstractTableModel {
    
    String[] headers = {"CIN","Nom","Prénom","Date de naissance","Categorie","Nationaliter","Club"};
    List<Joueur> joueurs = new ArrayList<>();
    JoueurDao jdao;
    
    public JoueurAdapter(){
        jdao = new JoueurDao();
        joueurs = jdao.Afficher();
    }

    @Override
    public int getRowCount() {
        return joueurs.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }
    @Override
    public String getColumnName(int i) {
        return headers[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case 0:
                return joueurs.get(rowIndex).getCin_joueur();
            case 1:
                return joueurs.get(rowIndex).getNom();
            case 2:
                return joueurs.get(rowIndex).getPrenom();
            case 3:
                return joueurs.get(rowIndex).getDate_naissance();
            case 4:
                return joueurs.get(rowIndex).getCategorie();     
            case 5:
                return joueurs.get(rowIndex).getNationalite();    
            case 6:
                return joueurs.get(rowIndex).getClub().getLibelle_club();    
            default:
                return null;
        }
    }
    
}
