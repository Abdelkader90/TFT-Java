/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import squad.ftt.dao.classes.ClubDao;
import squad.ftt.entities.Club;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gadour
 */
public class ClubAdapter extends AbstractTableModel {
    String[] headers = {"Nom Club","Adresse","Nbre de terrains","Description"};
    List<Club> clubs= new ArrayList<>();
    ClubDao cdao;
    
    public ClubAdapter(){
        cdao = new ClubDao();
        clubs=cdao.Afficher();
    }
    @Override
    public int getRowCount(){
        return clubs.size();
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
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
            case 0:
                return clubs.get(rowIndex).getLibelle_club();
            case 1:
                return clubs.get(rowIndex).getEmplacement_club();
            case 2:
                return clubs.get(rowIndex).getNbre_terrains();
            case 3:
                return clubs.get(rowIndex).getDescritption_club();
            default:
                return null;
        }
    }
    
}
