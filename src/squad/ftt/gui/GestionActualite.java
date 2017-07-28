/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import squad.ftt.adapters.ActualiteAdapter;
import squad.ftt.adapters.EvenementAdapter;
import squad.ftt.dao.classes.ActualitesDao;
import squad.ftt.entities.Actualites;
import static squad.ftt.gui.GestionEvenement.filePath;

/**
 *
 * @author esprit
 */
public class GestionActualite extends javax.swing.JFrame {

    private String imageNom;
    /**
     * Creates new form GestionEvenement
     */
    public GestionActualite() {
        initComponents();
        ActualiteAdapter stadeAdapter = new ActualiteAdapter();
        DefaultTableModel model = (DefaultTableModel) actTab.getModel();
        Vector column_name = new Vector();
        Vector data_row = new Vector();
        for (int i = 0; i < stadeAdapter.getColumnCount(); i++) {
            column_name.addElement(stadeAdapter.getColumnName(i));
            model.setColumnIdentifiers(column_name);
        }
        for (int k = 0; k < stadeAdapter.getRowCount(); k++) {
            data_row = new Vector();
            data_row.addElement(stadeAdapter.getValueAt(k, 1));
            data_row.addElement(stadeAdapter.getValueAt(k, 2));
            data_row.addElement(stadeAdapter.getValueAt(k, 3));
            data_row.addElement(stadeAdapter.getValueAt(k, 4));
           
            model.addRow(data_row);
        }
        actTab.setModel(model);
    }

    public void filter(String query) {
        DefaultTableModel model = (DefaultTableModel) actTab.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        actTab.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        actTab = new javax.swing.JTable();
        titre = new javax.swing.JTextField();
        etat = new javax.swing.JComboBox();
        imageName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imgAct = new javax.swing.JLabel();
        dateRed = new com.toedter.calendar.JDateChooser();
        description = new javax.swing.JTextField();
        parcourir = new javax.swing.JButton();
        Actualite = new javax.swing.JLabel();
        Joueurs = new javax.swing.JLabel();
        Match = new javax.swing.JLabel();
        Club = new javax.swing.JLabel();
        Tournoi = new javax.swing.JLabel();
        MatchAmicale = new javax.swing.JLabel();
        Stade = new javax.swing.JLabel();
        GestionDopage = new javax.swing.JLabel();
        Concours = new javax.swing.JLabel();
        Formation5 = new javax.swing.JLabel();
        article = new javax.swing.JLabel();
        Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        actTab.setModel(new javax.swing.table.DefaultTableModel(

        ));
        actTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(actTab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 110, 550, 140);
        getContentPane().add(titre);
        titre.setBounds(380, 270, 150, 30);

        etat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Publier", "Non Publier" }));
        etat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etatActionPerformed(evt);
            }
        });
        getContentPane().add(etat);
        etat.setBounds(380, 350, 150, 30);

        imageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageNameActionPerformed(evt);
            }
        });
        getContentPane().add(imageName);
        imageName.setBounds(380, 500, 150, 30);

        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 553, 90, 30);

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(470, 550, 90, 30);

        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 553, 90, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Titre ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 270, 150, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Date Debut");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 310, 150, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Etat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 350, 150, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Description");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 390, 150, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Image");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 500, 150, 30);
        getContentPane().add(imgAct);
        imgAct.setBounds(890, 190, 290, 340);

        dateRed.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(dateRed);
        dateRed.setBounds(380, 310, 150, 30);

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });
        getContentPane().add(description);
        description.setBounds(380, 400, 200, 90);

        parcourir.setText("Parcourir");
        parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcourirActionPerformed(evt);
            }
        });
        getContentPane().add(parcourir);
        parcourir.setBounds(550, 500, 140, 30);

        Actualite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualiteMouseClicked(evt);
            }
        });
        getContentPane().add(Actualite);
        Actualite.setBounds(0, 120, 210, 40);

        Joueurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JoueursMouseClicked(evt);
            }
        });
        getContentPane().add(Joueurs);
        Joueurs.setBounds(0, 160, 200, 40);

        Match.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatchMouseClicked(evt);
            }
        });
        getContentPane().add(Match);
        Match.setBounds(0, 210, 200, 40);

        Club.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClubMouseClicked(evt);
            }
        });
        getContentPane().add(Club);
        Club.setBounds(0, 260, 200, 40);

        Tournoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TournoiMouseClicked(evt);
            }
        });
        getContentPane().add(Tournoi);
        Tournoi.setBounds(0, 310, 200, 40);

        MatchAmicale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatchAmicaleMouseClicked(evt);
            }
        });
        getContentPane().add(MatchAmicale);
        MatchAmicale.setBounds(0, 360, 200, 40);

        Stade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StadeMouseClicked(evt);
            }
        });
        getContentPane().add(Stade);
        Stade.setBounds(0, 410, 200, 40);

        GestionDopage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionDopageMouseClicked(evt);
            }
        });
        getContentPane().add(GestionDopage);
        GestionDopage.setBounds(0, 450, 200, 40);

        Concours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConcoursMouseClicked(evt);
            }
        });
        getContentPane().add(Concours);
        Concours.setBounds(0, 500, 210, 40);

        Formation5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Formation5MouseClicked(evt);
            }
        });
        getContentPane().add(Formation5);
        Formation5.setBounds(0, 540, 210, 40);
        getContentPane().add(article);
        article.setBounds(0, 590, 210, 30);

        Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squad/ftt/images/Act1.jpg"))); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(0, -10, 1260, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ActualiteAdapter ea = new  ActualiteAdapter();
    ActualitesDao ad = new ActualitesDao();
    ad.removeActualitesById((int) ea.getValueAt(actTab.getSelectedRow(),0));
    GestionActualite ge = new GestionActualite();
    ge.setSize(1220, 635);
    ge.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void etatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etatActionPerformed

    private void imageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageNameActionPerformed

    private void parcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcourirActionPerformed
 JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
      if(fc.getSelectedFile()!=null)
      {File f = fc.getSelectedFile();
        String fileName = f.getAbsolutePath();
        imageName.setText(fileName);
        ImageIcon imgIcon = new ImageIcon(fileName);
        Image img1 = imgIcon.getImage();
        Image img2 = img1.getScaledInstance(imgAct.getWidth(), imgAct.getHeight(), Image.SCALE_SMOOTH);
        imgAct.setIcon(new ImageIcon(img2));
        filePath=imageName.getText();
        imageNom=f.getName();
      }      
    }//GEN-LAST:event_parcourirActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private static void copyFileUsingFileStreams(File source, File dest) throws IOException {

        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(imageName.getText()!=null)
     {   File source = new File(imageName.getText());
        File dest = new File("C:\\wamp\\www\\SquadWeb\\web\\uploads\\" + source.getName());
        try {
            copyFileUsingFileStreams(source, dest);
        } catch (IOException ex) {
            Logger.getLogger(GestionEvenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       ActualitesDao ad = new ActualitesDao();
      
       Actualites a = new Actualites();
       a.setTitre(titre.getText());
       a.setCorps(description.getText());
       a.setDateRedaction(  java.sql.Date.valueOf(((JTextField) dateRed.getDateEditor().getUiComponent()).getText()));
       a.setEtat((String)etat.getSelectedItem());
       a.setPhoto(imageNom);
       ad.addActualites(a);
       this.dispose();
       GestionActualite ge= new GestionActualite();
       ge.setSize(1220, 635);
       ge.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void actTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actTabMouseClicked

 DefaultTableModel model = (DefaultTableModel) actTab.getModel();
        titre.setText(model.getValueAt(actTab.getSelectedRow(), 0).toString());
        dateRed.setDate((java.util.Date) model.getValueAt(actTab.getSelectedRow(), 2));
       
       
        ActualiteAdapter ea = new ActualiteAdapter(); 
        ImageIcon imgIcon = new ImageIcon("C:\\wamp\\www\\SquadWeb\\web\\uploads\\"+ea.getValueAt(actTab.getSelectedRow(),5));
        Image img1 = imgIcon.getImage();
        Image img2 = img1.getScaledInstance(imgAct.getWidth(), imgAct.getHeight(), Image.SCALE_SMOOTH);
        imgAct.setIcon(new ImageIcon(img2));


    }//GEN-LAST:event_actTabMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

      Actualites a = new Actualites();
      ActualiteAdapter  ea= new ActualiteAdapter();
      ActualitesDao ad= new ActualitesDao();
      a.setTitre(titre.getText());
       a.setCorps(description.getText());
       a.setDateRedaction(  java.sql.Date.valueOf(((JTextField) dateRed.getDateEditor().getUiComponent()).getText()));
       a.setEtat((String)etat.getSelectedItem());
     
       a.setPhoto(imageNom);
       a.setIdActualite((int) ea.getValueAt(actTab.getSelectedRow(),0));
       ad.updateActualite(a);
       this.dispose();
       GestionActualite ge= new GestionActualite();
       ge.setSize(1220, 635);
       ge.setVisible(true);
       

       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ActualiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualiteMouseClicked

        this.dispose();
        AffichageActualite ge = new AffichageActualite();
        ge.setSize(1220, 655);
                ge.setVisible(true);

    }//GEN-LAST:event_ActualiteMouseClicked

    private void JoueursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JoueursMouseClicked
        this.dispose();
        GestionJoueurs ge = new GestionJoueurs();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_JoueursMouseClicked

    private void MatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchMouseClicked
        this.dispose();
        GestionMatchs ge = new GestionMatchs();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_MatchMouseClicked

    private void ClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClubMouseClicked
        this.dispose();
        GestionClub ge = new GestionClub();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_ClubMouseClicked

    private void TournoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TournoiMouseClicked
        this.dispose();
        GestionEvenement ge = new  GestionEvenement();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_TournoiMouseClicked

    private void MatchAmicaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchAmicaleMouseClicked
        this.dispose();
        GestionArbitre ge = new GestionArbitre();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_MatchAmicaleMouseClicked

    private void StadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StadeMouseClicked
        this.dispose();
        GestionStade ge = new GestionStade();
        ge.setSize(1220, 655);      
        ge.setVisible(true);
    }//GEN-LAST:event_StadeMouseClicked

    private void GestionDopageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionDopageMouseClicked
        this.dispose();
        GestionDopage ge = new GestionDopage();
        ge.setSize(1220, 655);
                ge.setVisible(true);
    }//GEN-LAST:event_GestionDopageMouseClicked

    private void ConcoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConcoursMouseClicked
        this.dispose();
        GestionConcours ge = new GestionConcours();
        ge.setSize(1220, 655);
                ge.setVisible(true);

    }//GEN-LAST:event_ConcoursMouseClicked

    private void Formation5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Formation5MouseClicked
        this.dispose();
        GestionFormation ge = new GestionFormation();
        ge.setSize(1220, 655);
        ge.setVisible(true);

    }//GEN-LAST:event_Formation5MouseClicked

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
            java.util.logging.Logger.getLogger(GestionActualite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionActualite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionActualite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionActualite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionActualite ge = new GestionActualite();
                ge.setSize(1220, 665);
                ge.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualite;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Concours;
    private javax.swing.JLabel Fond;
    private javax.swing.JLabel Formation5;
    private javax.swing.JLabel GestionDopage;
    private javax.swing.JLabel Joueurs;
    private javax.swing.JLabel Match;
    private javax.swing.JLabel MatchAmicale;
    private javax.swing.JLabel Stade;
    private javax.swing.JLabel Tournoi;
    private javax.swing.JTable actTab;
    private javax.swing.JLabel article;
    private com.toedter.calendar.JDateChooser dateRed;
    private javax.swing.JTextField description;
    private javax.swing.JComboBox etat;
    private javax.swing.JTextField imageName;
    private javax.swing.JLabel imgAct;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton parcourir;
    private javax.swing.JTextField titre;
    // End of variables declaration//GEN-END:variables
}
