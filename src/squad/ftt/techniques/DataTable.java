/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.techniques;

import javax.swing.JTable;



/**
 *
 * @author Maynoo
 */
public class DataTable extends JTable {
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
