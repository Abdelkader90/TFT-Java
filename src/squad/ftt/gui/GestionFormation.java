

package squad.ftt.gui;

import java.awt.Dimension;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import squad.ftt.adapters.PostulationFormationAdapter;
import squad.ftt.dao.classes.FormationDao;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Formation;
import squad.ftt.entities.Utilisateur;

/**
 *
 * @author esprit
 */
public class GestionFormation extends javax.swing.JFrame {

    /**
     * Creates new form GestionEvenement
     */
    public GestionFormation() {
        initComponents();
        PostulationFormationAdapter arbitreAdapter = new PostulationFormationAdapter();
        DefaultTableModel model = (DefaultTableModel) jTableFormation.getModel();
        Vector column_name = new Vector();
        Vector data_row = new Vector();
        System.out.println("aaaaa");
        for (int i = 0; i < arbitreAdapter.getColumnCount(); i++) {
            column_name.addElement(arbitreAdapter.getColumnName(i));
            model.setColumnIdentifiers(column_name);
        }
        for (int k = 0; k < arbitreAdapter.getRowCount(); k++) {
            data_row = new Vector();
            data_row.addElement(arbitreAdapter.getValueAt(k, 0));
            data_row.addElement(arbitreAdapter.getValueAt(k, 1));
            data_row.addElement(arbitreAdapter.getValueAt(k, 2));
            data_row.addElement(arbitreAdapter.getValueAt(k, 3));
            data_row.addElement(arbitreAdapter.getValueAt(k, 4));
            data_row.addElement(arbitreAdapter.getValueAt(k, 5));
            data_row.addElement(arbitreAdapter.getValueAt(k, 6));
            data_row.addElement(arbitreAdapter.getValueAt(k, 7));
            data_row.addElement(arbitreAdapter.getValueAt(k, 8));

                  //  data_row.addElement(arbitreAdapter.getValueAt(k,11));
            model.addRow(data_row);
        }
        jTableFormation.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        article = new javax.swing.JLabel();
        Concours = new javax.swing.JLabel();
        GestionDopage = new javax.swing.JLabel();
        Stade = new javax.swing.JLabel();
        MatchAmicale = new javax.swing.JLabel();
        Tournoi = new javax.swing.JLabel();
        Club = new javax.swing.JLabel();
        Match = new javax.swing.JLabel();
        Joueurs = new javax.swing.JLabel();
        Actualite = new javax.swing.JLabel();
        Formation5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFormation = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(article);
        article.setBounds(0, 590, 210, 30);

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

        Formation5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Formation5MouseClicked(evt);
            }
        });
        getContentPane().add(Formation5);
        Formation5.setBounds(0, 540, 210, 40);

        jLabel1.setText("Libelle :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 100, 50, 14);

        jLabel2.setText("grade:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 140, 32, 14);

        jLabel3.setText("Nom du formateur:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 180, 90, 14);

        jLabel4.setText("Date debut formation:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 220, 110, 14);

        jLabel5.setText("date fin formation:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 250, 110, 14);

        jLabel6.setText("DateDebutPostultion:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 280, 110, 14);

        jLabel7.setText("Date fin  postulation:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 310, 110, 14);

        jLabel8.setText("frais formation:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 350, 100, 14);

        jTableFormation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "libelle", "grade", "nom", "date debutFormation", "dateFinFormation", "dateDebutPostulation", "dateFinPostulation", "frais"
            }
        ));
        jScrollPane1.setViewportView(jTableFormation);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 410, 820, 130);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 90, 120, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 140, 120, 20);

        jTextField4.setText("yyyy-mm-jj");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(380, 220, 120, 20);

        jTextField5.setText("yyyy-mm-jj");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(380, 250, 120, 20);

        jTextField6.setText("yyyy-mm-jj");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(380, 280, 120, 20);

        jTextField7.setText("yyyy-mm-jj");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(380, 310, 120, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(380, 340, 120, 20);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(643, 233, 110, 30);

        jButton2.setText("Modifier");
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 233, 110, 30);

        jButton3.setText("Supprimer");
        getContentPane().add(jButton3);
        jButton3.setBounds(950, 233, 120, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(380, 180, 120, 20);

        Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squad/ftt/images/formation1.jpg"))); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(-30, -90, 1260, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        GestionStade ge = new GestionStade();
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
        GestionEvenement ge = new GestionEvenement();
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

    private void Formation5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Formation5MouseClicked
        this.dispose();
       // GestionFormation ge = new GestionFormation();
        // ge.setSize(1220, 655);
        //ge.setVisible(true);
    }//GEN-LAST:event_Formation5MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   FormationDao formation=new FormationDao();
   Formation a =new Formation();
   
        UtilisateurDao user=new UtilisateurDao();
        a.setLibelle_formation(jTextField1.getText());
        a.setGrade(jTextField2.getText());
        
        a.setFormateur(user.findUserById(Integer.parseInt(jTextField1.getText())));
        a.setDate_debut_formation(Date.valueOf(jTextField4.getText()));
        a.setDate_fin_formation(Date.valueOf(jTextField5.getText()));
        a.setDate_debut_postilation(Date.valueOf(jTextField6.getText()));
        a.setDate_fin_postilation(Date.valueOf(jTextField7.getText()));
        a.setFrais_formation(Float.parseFloat(jTextField8.getText()));
         formation.add(a);
         DefaultTableModel model = (DefaultTableModel) jTableFormation.getModel();
        model.addRow(new Object[]{jTextField1.getText(), jTextField2.getText(), Integer.parseInt(jTextField1.getText()),Date.valueOf(jTextField4.getText()),Date.valueOf(jTextField5.getText()),Date.valueOf(jTextField6.getText()), Date.valueOf(jTextField7.getText()),Float.parseFloat(jTextField8.getText())});
       
   
   
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and fee6l */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GestionFormation.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(GestionFormation.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(GestionFormation.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(GestionFormation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }

        //</editor-fold>
            //</editor-fold>
        //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
               GestionFormation ge = new GestionFormation();
                     ge.setSize(1220, 665);
                    ge.setVisible(true);

                }
            });
        }
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
    private javax.swing.JLabel article;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFormation;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
