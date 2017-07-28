/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.adapters;

import squad.ftt.dao.classes.concoursDAO;
import squad.ftt.entities.Concours;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Khaoula Issaoui
 */
public class Concourdapter extends AbstractTableModel  {
    String[] headers;
    List<Concours> Concours= new ArrayList<>();

    public Concourdapter()  {
        
        this.headers = new String[]{"Libellé","Date","Lieu","Description","Frais participation","Date deb depot","date fin depot","Type"};
        concoursDAO concoursDAO= new concoursDAO();
        Concours = concoursDAO.DisplayAllConcours();
        
    }
    

    @Override
    public int getRowCount() {
       return Concours.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }
     @Override
     public String getColumnName(int i ){
         return headers[i];
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex) {
            
            case 0:
                return Concours.get(rowIndex).getId_Concour();
            case 1:
                return Concours.get(rowIndex).getLibelle_concour();
            case 2:
                return Concours.get(rowIndex).getDate_debut_concour();
            case 3:
                return Concours.get(rowIndex).getLieu_concour();
            case 4:
                return Concours.get(rowIndex).getDescription_concours();
            case 5:
                return Concours.get(rowIndex).getFrais_participation();
            case 6:
                return Concours.get(rowIndex).getDate_debut_depot();
            case 7:
                return Concours.get(rowIndex).getDate_fin_depot();
            case 8:
                return Concours.get(rowIndex).getType_concour();
            
            
            default:
                return null;
    }
    
    
}}
