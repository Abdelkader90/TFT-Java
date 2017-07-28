package squad.ftt.adapters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.PostulationDao;
import squad.ftt.entities.Concours;

/**
 *
 *
 */
public class PostulationAdapter extends AbstractTableModel {
    String[] headers;
    List<Concours> concours = new ArrayList<>();
  //  Double cin_user;



    public PostulationAdapter() throws IOException {
        
        
        
      this.headers = new String[]{"Id_Concour", "getLibelle_concour", "Date_debut_concour", "Lieu_concour", "Description_concours", "Frais_participation"};
        PostulationDao cd = new PostulationDao();
         //concours = cd.DisplayAllConcours();
        
        concours=cd.DisplayConcoursByGrade();

     
    }

    @Override
    public int getRowCount() {
        return concours.size();
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
                return concours.get(rowIndex).getId_Concour();
            case 1:
                return concours.get(rowIndex).getLibelle_concour();
            case 2:
                return concours.get(rowIndex).getDate_debut_concour();
            case 3:
                return concours.get(rowIndex).getLieu_concour();
            case 4:
                return concours.get(rowIndex).getDescription_concours();
            case 5:
                return concours.get(rowIndex).getFrais_participation();
            

            default:
                return null;
        }
    }

}
