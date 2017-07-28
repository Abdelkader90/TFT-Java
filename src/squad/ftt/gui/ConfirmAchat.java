package squad.ftt.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
   import javax.swing.JFrame;
 
public class ConfirmAchat extends JFrame {

    public ConfirmAchat(){                
   
    this.setTitle("FTT.Facture");
    this.setSize(400, 600);
    this.setLocationRelativeTo(null);               
    this.setContentPane(new FacturePanel());
    this.setVisible(true);
  }     
}