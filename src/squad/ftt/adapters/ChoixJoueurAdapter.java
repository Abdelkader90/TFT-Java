package squad.ftt.adapters;

import squad.ftt.entities.Joueur;
import squad.ftt.dao.classes.JoueurDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ChoixJoueurAdapter extends AbstractTableModel {
    
    String[] headers;
    List<Joueur> joueurs = new ArrayList<>();
    JoueurDao joueurDao;

    public ChoixJoueurAdapter() {
        this.headers = new String[]{"Nom", "Prenom", "Nationnalitée", "grade", "Coisir"};
        joueurDao = new JoueurDao();
        joueurs = joueurDao.findAll();
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
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
            case 0:
                return joueurs.get(rowIndex).getCin_joueur();
            case 1:
                return joueurs.get(rowIndex).getPrenom();
            case 2:
                return joueurs.get(rowIndex).getNom();
            case 3:
                return joueurs.get(rowIndex).getNationalite();
            case 4:
                return joueurs.get(rowIndex).getCategorie();
            default:
                return null;
        }
    }
}
