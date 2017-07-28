/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Khaoula Issaoui
 */
public class UtilisateurAdapter extends AbstractTableModel {

    String[] headers;
    List<Utilisateur> Utilisateurs = new ArrayList<>();

    public UtilisateurAdapter() {

        this.headers = new String[]{"Username", "E-mail", "Mot de passe", "CIN", "Nom", "Prénom", "Date de naissance", "Nationalité", "Téléphone", "Grade Arbitre", "Role", "Type Arbitre"};
        UtilisateurDao ud = new UtilisateurDao();
        Utilisateurs = ud.findAll();
    }

    @Override
    public int getRowCount() {
        return Utilisateurs.size();
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
            case 0 :
                return Utilisateurs.get(rowIndex).getUsername();
            case 1:
                return Utilisateurs.get(rowIndex).getEmail();
            case 2:
                return Utilisateurs.get(rowIndex).getPassword();
            case 3:
                return Utilisateurs.get(rowIndex).getCin_user();
            case 4:
                return Utilisateurs.get(rowIndex).getNom();
            case 5:
                return Utilisateurs.get(rowIndex).getPrenom();
            case 6:
                return Utilisateurs.get(rowIndex).getDate_de_naissance();
            case 7:
                return Utilisateurs.get(rowIndex).getNationaliter();
            case 8:
                return Utilisateurs.get(rowIndex).getTel();
            case 9:
                return Utilisateurs.get(rowIndex).getGrade_arbitre();
            case 10:
                return Utilisateurs.get(rowIndex).getRole();
            case 11:
                return Utilisateurs.get(rowIndex).getType_arbitre();

            default:
                return null;
        }

    }
}
