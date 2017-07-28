package squad.ftt.adapters;


import squad.ftt.entities.Stade;
import squad.ftt.dao.classes.StadeDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

/**
 *

 */
public class ChoixStadeAdapter extends AbstractTableModel {

    String[] headers;
    List<Stade> stades = new ArrayList<>();
    StadeDao stadeDao;
    
    public ChoixStadeAdapter() {
        this.headers = new String[]{"Nom", "lieu", "terrain", "capacite","Coisir"};
        stadeDao = new StadeDao();
        stades = stadeDao.findAll();
    }

    @Override
    public int getRowCount() {
        return stades.size();
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
