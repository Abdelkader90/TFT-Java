package squad.ftt.adapters;


import squad.ftt.dao.classes.EvenementDao;
import squad.ftt.entities.Evenement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 */
public class EvenementAdapter extends AbstractTableModel {

    String[] headers;
   public List<Evenement> evenements = new ArrayList<>();
    EvenementDao stadeDao;

    public EvenementAdapter() {
        this.headers = new String[]{"Libelle ", "DateDebut", "DateFin","Site","double","Nombre Joueur"};
        stadeDao = new EvenementDao();
        evenements = stadeDao.findAll();
    }

    @Override
    public int getRowCount() {
        return evenements.size();
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
                return evenements.get(rowIndex).getId_event();
            case 1:
                return evenements.get(rowIndex).getLibelle();
            case 2:
                return evenements.get(rowIndex).getDate_debut();
            case 3:
                return evenements.get(rowIndex).getDate_fin();
            case 4:
                return evenements.get(rowIndex).getType();
            case 5:
                return evenements.get(rowIndex).getSite();
            case 6:
                return evenements.get(rowIndex).getNombreJoueur();
            case 7:
                return evenements.get(rowIndex).getImage();
            default:
                return null;
        }
    }

}
