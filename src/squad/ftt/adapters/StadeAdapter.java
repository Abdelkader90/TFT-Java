/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

/**
 *
 * @author hppro
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.StadeDao;
import squad.ftt.dao.interfaces.IstadeDao;
import squad.ftt.entities.Stade;

/**
 *

 */
public class StadeAdapter extends AbstractTableModel {

    String[] headers;
    List<Stade> stades = new ArrayList<>();
    IstadeDao stadeDao;

    public StadeAdapter() {
        this.headers = new String[]{"id_stade", "Nom Stade", "Aderesse Stade", "Type Stade", "Capacite Stade"};
        stadeDao = new StadeDao();
        stades = stadeDao.findAll();
    }

    @Override
    public int getRowCount() {
        return stades.size();
    }
    public void addRow(Stade stade){
        this.stades.add(stade);
        fireTableDataChanged();
    }
    public void removeRow(int row){
        this.stades.remove(row);
        fireTableDataChanged();
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
                return stades.get(rowIndex).getId_stade();
            case 1:
                return stades.get(rowIndex).getLibelle();
            case 2:
                return stades.get(rowIndex).getLieu();
            case 3:
                return stades.get(rowIndex).getTerrain();
            case 4:
                return stades.get(rowIndex).getCapacite();
            default:
                return null;
        }
    }

}
