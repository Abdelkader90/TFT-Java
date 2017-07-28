/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.JoueurDao;
import squad.ftt.entities.Joueur;

/**
 *
 * @author hppro
 */
public class JoueurAmicalAdapter extends AbstractTableModel {

    String[] headers;
    List<Joueur> joueurs = new ArrayList<>();
    JoueurDao joueurDao;

    public JoueurAmicalAdapter() {
        this.headers = new String[]{"id", "nom","prenom", "nationalité","selected" };
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
                return joueurs.get(rowIndex).getNom();
            case 2:
                return joueurs.get(rowIndex).getPrenom();
            case 3:
                return joueurs.get(rowIndex).getNationalite();
            case 4:
                return joueurs.get(rowIndex).isSelected();
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
                return Boolean.class;
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int row, int column) {
        switch (column) {
            
            case 0:
                this.joueurs.get(row).setCin_joueur((double) o);
                break;
            case 1:
                this.joueurs.get(row).setNom((String) o);
                break; 
            case 2:
                this.joueurs.get(row).setPrenom((String) o);
                break;    
            case 3:
                this.joueurs.get(row).setNationalite((String) o);
                break;
            case 4:
                this.joueurs.get(row).setSelected((boolean) o);
                break;
            default:
                this.joueurs.get(row);
        }fireTableDataChanged();
    }
} 
    

