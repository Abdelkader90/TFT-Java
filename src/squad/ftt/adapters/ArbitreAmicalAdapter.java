/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Utilisateur;

/**
 *
 * @author hppro
 */
public class ArbitreAmicalAdapter extends AbstractTableModel{
    String[] headers;
    List<Utilisateur> arbitres = new ArrayList<>();
    UtilisateurDao utilisateurDao;
    
    public ArbitreAmicalAdapter() {
        this.headers = new String[]{"id", "Nom & prenom", "nationalite","grade","type","selected",};
        utilisateurDao = new UtilisateurDao();
        arbitres = utilisateurDao.findAll("ROLE_ARBITRE");
    }
    @Override
    public int getRowCount() {
        return arbitres.size();
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
                return arbitres.get(rowIndex).getId();
            case 1:
                return arbitres.get(rowIndex).getNom()+" "+arbitres.get(rowIndex).getPrenom();
            case 2:
                return arbitres.get(rowIndex).getNationaliter();
            case 3:
                return arbitres.get(rowIndex).getGrade_arbitre();           
            case 4:
                return arbitres.get(rowIndex).getType_arbitre();
            case 5:
                return arbitres.get(rowIndex).isSelected();
            default:
                return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return Boolean.class;
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int row, int column) {
        switch (column) {
           
            case 0:
                this.arbitres.get(row).setId((int) o);
                break;
            case 1:
                this.arbitres.get(row).setNom((String) o);
                break;
            case 2:
                this.arbitres.get(row).setNationaliter((String) o);
                break;
            case 3:
                this.arbitres.get(row).setGrade_arbitre((String) o);
                break;
            case 4:
                this.arbitres.get(row).setType_arbitre((String) o);
                break;
            case 5:
                this.arbitres.get(row).setSelected((boolean) o);
                break;
            default:
                this.arbitres.get(row);
        }fireTableDataChanged();
    }}