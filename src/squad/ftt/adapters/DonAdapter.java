/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;
import squad.ftt.dao.classes.DonDao;
import squad.ftt.entities.Don;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.entities.Club;

/**
 *
 * @author Gadour
 */
public class DonAdapter extends AbstractTableModel {
    String[] headers = { "Somme du don","Date d'attribution"};
    List<Don> dons = new ArrayList<>();
    Club cl = new Club();
    DonDao ddao;
    
    public DonAdapter(){
        ddao = new DonDao();    
        dons = ddao.Afficher();
    }

    
    public DonAdapter(int id){
        ddao = new DonDao();    
        dons = ddao.Afficher(id);
    }

    
    
    @Override
    public int getRowCount() {
        return dons.size();
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
                return dons.get(rowIndex).getSomme();
            case 1:
                return dons.get(rowIndex).getDate_don();
            
            default:
                return null;
        }
    }
    
}
