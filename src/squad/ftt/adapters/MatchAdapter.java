/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.MatchtennisDao;
import squad.ftt.entities.Matchtennis;

/**
 *

 */
public class MatchAdapter extends AbstractTableModel {

    String[] headers;
    List<Matchtennis> matches = new ArrayList<>();
    MatchtennisDao matchDao;

    public MatchAdapter() {
        this.headers = new String[]{"id_match", "Date", "Stade", "Arbitre","club1","club2","etat"};
        matchDao = new MatchtennisDao();
        matches = matchDao.findAll();
    }
    public void addRow(Matchtennis match){
        this.matches.add(match);
        fireTableDataChanged();
    }
    public void removeRow(int row){
        this.matches.remove(row);
        fireTableDataChanged();
    }
    

    @Override
    public int getRowCount() {
        return matches.size();
        
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
        java.util.Date dateMatch = matches.get(rowIndex).getDate_match();
        java.sql.Date dateMatch1 = new java.sql.Date(dateMatch.getTime());
        java.sql.Date sqlDate1 = new java.sql.Date(new java.util.Date( ).getTime());
        switch (colmunIndex) {
            case 0:
                return matches.get(rowIndex).getId_match();
            case 1:
                return matches.get(rowIndex).getDate_match();                
            case 2:
                return matches.get(rowIndex).getStade().getLibelle();
            case 3:
                return matches.get(rowIndex).getArbitre().getNom()+" "+matches.get(rowIndex).getArbitre().getPrenom();
            case 4: if(matches.get(rowIndex).getListJoueur().isEmpty()){
                return  "";
            }else{ return matches.get(rowIndex).getListJoueur().get(0).getNom()+" "+ matches.get(rowIndex).getListJoueur().get(0).getPrenom();
            }case 5:if(matches.get(rowIndex).getListJoueur().isEmpty()){
                return "";
            }else{ return matches.get(rowIndex).getListJoueur().get(1).getNom()+" "+ matches.get(rowIndex).getListJoueur().get(1).getPrenom();}   
            case 6:if(dateMatch1.before(sqlDate1)){
                return "joué";}
            else{return "en attente";}
            default:
                return null;
        }
    }
   

}
