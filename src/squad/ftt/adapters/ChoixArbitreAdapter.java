package squad.ftt.adapters;

import squad.ftt.entities.Joueur;
import squad.ftt.dao.classes.JoueurDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Utilisateur;

public class ChoixArbitreAdapter extends AbstractTableModel {
    
    String[] headers;
    List<Utilisateur> users = new ArrayList<>();
    UtilisateurDao utilisateurDao;

    public ChoixArbitreAdapter() {
        this.headers = new String[]{"Nom", "Prenom", "Nationnalité", "grade", "Coisir"};
        utilisateurDao = new UtilisateurDao();
        users = utilisateurDao.findAll("ROLE_ARBITRE");
    }

    @Override
    public int getRowCount() {
        return users.size();
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
                return users.get(rowIndex).getId();
            case 1:
                return users.get(rowIndex).getPrenom();
            case 2:
                return users.get(rowIndex).getNom();
            case 3:
                return users.get(rowIndex).getNationaliter();
            case 4:
                return users.get(rowIndex).getGrade_arbitre();
            default:
                return null;
        }
    }
}
