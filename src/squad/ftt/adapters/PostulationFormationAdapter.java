package squad.ftt.adapters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.PostulationDao;
import squad.ftt.entities.Formation;

/**
 *
 *
 */
public class PostulationFormationAdapter extends AbstractTableModel {

    String[] headers;
    List<Formation> formations = new ArrayList<>();
  //  Double cin_user;

    public PostulationFormationAdapter() {

        
        try {
            this.headers = new String[]{"libelle_formation", "grade", "formateur", "date_debut_formation", "date_fin_formation","date_debut_postultion","date_fin_postulation","frais_formation"};
            PostulationDao cd = new PostulationDao();
            //concours = cd.DisplayAllConcours();

            formations = cd.findAll();
        } catch (Exception ex) {
            Logger.getLogger(PostulationFormationAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

    @Override
    public int getRowCount() {
        return formations.size();
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
                return formations.get(rowIndex).getId_Formation();
            case 1:
                return formations.get(rowIndex).getLibelle_formation();

            case 2:
                return formations.get(rowIndex).getGrade();
            case 3:

                return formations.get(rowIndex).getFormateur().getNom()+" "+formations.get(rowIndex).getFormateur().getPrenom();
            case 4:
                return formations.get(rowIndex).getDate_debut_formation();
            case 5:
                return formations.get(rowIndex).getDate_fin_formation();
            case 6:
                return formations.get(rowIndex).getDate_fin_postilation();
            case 7:
                return formations.get(rowIndex).getDate_fin_postilation();
                
             case 8:

                return formations.get(rowIndex).getFrais_formation();

            default:
                return null;
        }
    }

}
