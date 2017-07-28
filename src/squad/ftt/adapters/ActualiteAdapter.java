package squad.ftt.adapters;


import squad.ftt.dao.classes.EvenementDao;
import squad.ftt.entities.Evenement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.ActualitesDao;
import squad.ftt.entities.Actualites;

/**
 *
 */
public class ActualiteAdapter extends AbstractTableModel {

    String[] headers;
   public List<Actualites> actualites = new ArrayList<>();
    ActualitesDao actDao;
    
    public ActualiteAdapter() {
        this.headers = new String[]{"titre","corps","dateRedaction","etat"};
        actDao = new ActualitesDao();
        actualites = actDao.findAll();
    }

    @Override
    public int getRowCount() {
        return actualites.size();
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
                return actualites.get(rowIndex).getIdActualite();
            case 1:
                return actualites.get(rowIndex).getTitre();
            case 2:
                return actualites.get(rowIndex).getCorps();
            case 3:
                return actualites.get(rowIndex).getDateRedaction();
            case 4:
                return actualites.get(rowIndex).getEtat();
            case 5:
                return actualites.get(rowIndex).getPhoto();
            
            default:
                return null;
        }
    }

}
