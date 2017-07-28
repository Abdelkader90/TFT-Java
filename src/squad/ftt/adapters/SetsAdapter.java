/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.SetTennisDao;
import squad.ftt.dao.interfaces.ISetTennis;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.SetTennis;


/**
 *
 * @author hppro
 */
public class SetsAdapter  extends AbstractTableModel {
    String[] headers;
    List<SetTennis> sets = new ArrayList<>();
    SetTennisDao setDao;
    
    public SetsAdapter(Matchtennis match){
         
        setDao = new SetTennisDao();
        sets = setDao.findSetTennisByMatch(match);
        this.headers = new String[]{"id", sets.get(0).getMatch().getListJoueur().get(0).getNom()+" "
               +sets.get(0).getMatch().getListJoueur().get(0).getPrenom(), 
                sets.get(0).getMatch().getListJoueur().get(1).getNom()+" "
               +sets.get(0).getMatch().getListJoueur().get(1).getPrenom()};
    }

    @Override
    public int getRowCount() {
     return sets.size();   
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
                return sets.get(rowIndex).getId();
            case 1:
                return sets.get(rowIndex).getScore1();                
            case 2:
                return sets.get(rowIndex).getScore2();
            default:
                return null;
        }
    }
    
}
