/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import squad.ftt.adapters.StadeAdapter;
import squad.ftt.dao.classes.StadeDao;
import squad.ftt.dao.interfaces.IstadeDao;
import squad.ftt.entities.Stade;

/**
 *
 * @author esprit
 */
public class GestionStade extends javax.swing.JFrame {
    StadeAdapter stadeAdapter= new StadeAdapter();

    /**
     * Creates new form GestionEvenement
     */
    public GestionStade() {
        initComponents();
                            
    }
    
    public void filter(String query){
        TableRowSorter<StadeAdapter>tr=new TableRowSorter<StadeAdapter>(stadeAdapter);
        jTable_stade.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        article = new javax.swing.JLabel();
        Formation = new javax.swing.JLabel();
        Concours = new javax.swing.JLabel();
        GestionDopage = new javax.swing.JLabel();
        Stade = new javax.swing.JLabel();
        MatchAmicale = new javax.swing.JLabel();
        Tournoi = new javax.swing.JLabel();
        Club = new javax.swing.JLabel();
        Match = new javax.swing.JLabel();
        Joueurs = new javax.swing.JLabel();
        Actualite = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_stade = new JTable(stadeAdapter);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_lieu = new javax.swing.JTextField();
        jTextField_libelle = new javax.swing.JTextField();
        jTextField_recherche = new javax.swing.JTextField();
        ajouter_stade = new javax.swing.JButton();
        modifier_stade = new javax.swing.JButton();
        supprimer_stade = new javax.swing.JButton();
        jComboBox_ville = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_terrain = new javax.swing.JComboBox();
        jTextField_capacite = new javax.swing.JSpinner();
        map = new javax.swing.JButton();
        Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(article);
        article.setBounds(0, 590, 210, 30);

        Formation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormationMouseClicked(evt);
            }
        });
        getContentPane().add(Formation);
        Formation.setBounds(0, 540, 210, 40);

        Concours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConcoursMouseClicked(evt);
            }
        });
        getContentPane().add(Concours);
        Concours.setBounds(0, 500, 210, 40);

        GestionDopage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionDopageMouseClicked(evt);
            }
        });
        getContentPane().add(GestionDopage);
        GestionDopage.setBounds(0, 450, 200, 40);

        Stade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StadeMouseClicked(evt);
            }
        });
        getContentPane().add(Stade);
        Stade.setBounds(0, 410, 200, 40);

        MatchAmicale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatchAmicaleMouseClicked(evt);
            }
        });
        getContentPane().add(MatchAmicale);
        MatchAmicale.setBounds(0, 360, 200, 40);

        Tournoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TournoiMouseClicked(evt);
            }
        });
        getContentPane().add(Tournoi);
        Tournoi.setBounds(0, 310, 200, 40);

        Club.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClubMouseClicked(evt);
            }
        });
        getContentPane().add(Club);
        Club.setBounds(0, 260, 200, 40);

        Match.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatchMouseClicked(evt);
            }
        });
        getContentPane().add(Match);
        Match.setBounds(0, 210, 200, 40);

        Joueurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JoueursMouseClicked(evt);
            }
        });
        getContentPane().add(Joueurs);
        Joueurs.setBounds(0, 160, 200, 40);

        Actualite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualiteMouseClicked(evt);
            }
        });
        getContentPane().add(Actualite);
        Actualite.setBounds(0, 120, 210, 40);

        jTable_stade.getColumn("id_stade").setMinWidth(0);
        jTable_stade.getColumn("id_stade").setMaxWidth(0);
        JTableHeader anHeader= jTable_stade.getTableHeader();
        anHeader.setForeground(new Color(0).BLUE);
        anHeader.setSize(50, 50);
        jTable_stade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_stadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_stade);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 110, 910, 170);

        jLabel1.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Nom du Stade");
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 310, 150, 30);

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Lieu du Stade");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 390, 150, 30);

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Type de Terrain");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 430, 150, 30);

        jLabel4.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Capacite");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 470, 150, 30);
        getContentPane().add(jTextField_lieu);
        jTextField_lieu.setBounds(410, 390, 150, 30);
        getContentPane().add(jTextField_libelle);
        jTextField_libelle.setBounds(410, 310, 150, 30);

        jTextField_recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_rechercheKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField_recherche);
        jTextField_recherche.setBounds(440, 30, 160, 30);

        ajouter_stade.setFont(new java.awt.Font("Urdu Typesetting", 3, 12)); // NOI18N
        ajouter_stade.setText("Ajouter");
        ajouter_stade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_stadeActionPerformed(evt);
            }
        });
        getContentPane().add(ajouter_stade);
        ajouter_stade.setBounds(310, 560, 90, 30);

        modifier_stade.setFont(new java.awt.Font("Urdu Typesetting", 3, 12)); // NOI18N
        modifier_stade.setText("Modifier");
        modifier_stade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_stadeActionPerformed(evt);
            }
        });
        getContentPane().add(modifier_stade);
        modifier_stade.setBounds(450, 560, 90, 30);

        supprimer_stade.setFont(new java.awt.Font("Urdu Typesetting", 3, 12)); // NOI18N
        supprimer_stade.setText("Supprimer");
        supprimer_stade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_stadeActionPerformed(evt);
            }
        });
        getContentPane().add(supprimer_stade);
        supprimer_stade.setBounds(600, 560, 90, 30);

        jComboBox_ville.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ville","Ariana", "Béja", "Ben Arous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kébili", "Le Kef", "Mahdia", "La Manouba", "Médenine", "Monastir", "Nabeul", "Sfax", "Sidi", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan" }));
        getContentPane().add(jComboBox_ville);
        jComboBox_ville.setBounds(410, 350, 150, 30);

        jLabel5.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Ville ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 350, 150, 30);

        jComboBox_terrain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select type", "Gazon", "Dur", "Indoor", "Moquette", "Terre battue" }));
        getContentPane().add(jComboBox_terrain);
        jComboBox_terrain.setBounds(410, 430, 150, 30);
        getContentPane().add(jTextField_capacite);
        jTextField_capacite.setBounds(410, 470, 150, 30);

        map.setText("map");
        map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapActionPerformed(evt);
            }
        });
        getContentPane().add(map);
        map.setBounds(740, 560, 100, 30);

        Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squad/ftt/images/stade1.jpg"))); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(0, 0, 1260, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormationMouseClicked
        this.dispose();
        GestionFormation ge = new GestionFormation();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_FormationMouseClicked

    private void ConcoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConcoursMouseClicked
        this.dispose();
        GestionConcours ge = new GestionConcours();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_ConcoursMouseClicked

    private void GestionDopageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionDopageMouseClicked
        this.dispose();
        GestionDopage ge = new GestionDopage();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_GestionDopageMouseClicked

    private void StadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StadeMouseClicked
        this.dispose();
        GestionStade ge;
        
            ge = new GestionStade();
            ge.setSize(1220, 655);
        ge.setVisible(true);
       
            
        
    }//GEN-LAST:event_StadeMouseClicked

    private void MatchAmicaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchAmicaleMouseClicked
        this.dispose();
        GestionArbitre ge = new GestionArbitre();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_MatchAmicaleMouseClicked

    private void TournoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TournoiMouseClicked
        this.dispose();
        GestionEvenement ge = new  GestionEvenement();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_TournoiMouseClicked

    private void ClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubMouseClicked
        this.dispose();
        GestionClub ge = new GestionClub();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_ClubMouseClicked

    private void MatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchMouseClicked
        this.dispose();
        GestionMatchs ge = new GestionMatchs();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_MatchMouseClicked

    private void JoueursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JoueursMouseClicked
        this.dispose();
        GestionJoueurs ge = new GestionJoueurs();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_JoueursMouseClicked

    private void ActualiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualiteMouseClicked

        this.dispose();
        AffichageActualite ge = new AffichageActualite();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_ActualiteMouseClicked

    private void ajouter_stadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_stadeActionPerformed
        Stade stade = new Stade();
        stade.setLibelle(jTextField_libelle.getText());
        stade.setLieu(jTextField_lieu.getText()+","+(String)jComboBox_ville.getSelectedItem());
        stade.setTerrain((String)jComboBox_terrain.getSelectedItem());
        if(jTextField_libelle.getText().equals("") || 
           ((String)jComboBox_ville.getSelectedItem()).equals("Select ville") || 
           ((String)jComboBox_terrain.getSelectedItem()).equals("Select type") ||
            jTextField_lieu.getText().equals("") || ((int)jTextField_capacite.getValue())==0){
          JOptionPane.showMessageDialog(null,"Remplir les informations"); }
        else{
        stade.setCapacite((int)jTextField_capacite.getValue());
        int confirm=JOptionPane.showConfirmDialog(null,"Confirmer l'ajout?");
        if(confirm ==0){
        IstadeDao stadeDao = new StadeDao() ;
        stadeDao.addStade(stade);
        stadeAdapter.addRow(stade);
        }
        }
    }//GEN-LAST:event_ajouter_stadeActionPerformed

    private void modifier_stadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_stadeActionPerformed
        IstadeDao stadeDao = new StadeDao() ;
        Stade stade = new Stade();
        stade.setLibelle(jTextField_libelle.getText());
        stade.setLieu(jTextField_lieu.getText()+","+(String)jComboBox_ville.getSelectedItem());
        stade.setTerrain((String)jComboBox_terrain.getSelectedItem());      
        stade.setCapacite((int)jTextField_capacite.getValue());
        if((int) stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 0)!=0){
        stade.setId_stade((int) stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 0));
        }
        else {stade.setId_stade(stadeDao.findLastStade().getId_stade());
        }
        int confirm=JOptionPane.showConfirmDialog(null,"Confirmer la modification?");
        if(confirm ==0){
        stadeDao.updateStade(stade);
        jTable_stade.setModel(new StadeAdapter());
        jTable_stade.getColumn("id_stade").setMinWidth(0);
        jTable_stade.getColumn("id_stade").setMaxWidth(0);
        }
    }//GEN-LAST:event_modifier_stadeActionPerformed

    private void supprimer_stadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_stadeActionPerformed
        StadeDao stadeDao=new StadeDao();
        int confirm=JOptionPane.showConfirmDialog(null,"Confirmer la suppression?");
        if(confirm ==0){
        if((int) stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 0)!=0){
        stadeDao.removeSatdeById(Integer.parseInt(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(),0).toString()));}
        else{ stadeDao.removeSatdeById(stadeDao.findLastStade().getId_stade());  
        }
        stadeAdapter.removeRow(jTable_stade.getSelectedRow());}
        
    }//GEN-LAST:event_supprimer_stadeActionPerformed
 
    private void jTextField_rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rechercheKeyReleased
       String query=jTextField_recherche.getText();
       filter(query); 
    }//GEN-LAST:event_jTextField_rechercheKeyReleased

    private void jTable_stadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_stadeMouseClicked
        jTextField_libelle.setText(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 1).toString());
        jComboBox_terrain.setSelectedItem(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 3).toString());
        jTextField_capacite.setValue(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 4));
        String[] result=stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 2).toString().split(",");
        for (int x=0; x<result.length; x++){
           jTextField_lieu.setText(result[0]);
           jComboBox_ville.setSelectedItem((String)result[1]);
        }       
    }//GEN-LAST:event_jTable_stadeMouseClicked

    private void mapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapActionPerformed
        Stade stade = new Stade();
        if(jTable_stade.getSelectedRow()>=0 && jTable_stade.getSelectedRow()<=stadeAdapter.getRowCount()){
         stade.setId_stade((int)stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 0));
        stade.setLibelle(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 1).toString());
        stade.setLieu(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 2).toString());
        stade.setTerrain(stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 3).toString());      
        stade.setCapacite((int)stadeAdapter.getValueAt(jTable_stade.getSelectedRow(), 4));
        GoogleMaps ge = new GoogleMaps(stade);    
        }else{
        JOptionPane.showMessageDialog(null,"choisir un stade");
        }
        
    }//GEN-LAST:event_mapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionStade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionStade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionStade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionStade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionStade ge;          
                     ge = new GestionStade();
                     ge.setSize(1220, 635);
                     ge.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualite;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Concours;
    private javax.swing.JLabel Fond;
    private javax.swing.JLabel Formation;
    private javax.swing.JLabel GestionDopage;
    private javax.swing.JLabel Joueurs;
    private javax.swing.JLabel Match;
    private javax.swing.JLabel MatchAmicale;
    private javax.swing.JLabel Stade;
    private javax.swing.JLabel Tournoi;
    private javax.swing.JButton ajouter_stade;
    private javax.swing.JLabel article;
    private javax.swing.JComboBox jComboBox_terrain;
    private javax.swing.JComboBox jComboBox_ville;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_stade;
    private javax.swing.JSpinner jTextField_capacite;
    private javax.swing.JTextField jTextField_libelle;
    private javax.swing.JTextField jTextField_lieu;
    private javax.swing.JTextField jTextField_recherche;
    private javax.swing.JButton map;
    private javax.swing.JButton modifier_stade;
    private javax.swing.JButton supprimer_stade;
    // End of variables declaration//GEN-END:variables
}
