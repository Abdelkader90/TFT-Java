package squad.ftt.gui;

import squad.ftt.entities.RSSFeedReader;
import squad.ftt.entities.Event;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
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
import squad.ftt.entities.Articles;
import squad.ftt.dao.classes.ArticlesDao;
import squad.ftt.adapters.ArticlesAdapter;
import squad.ftt.dao.classes.ActualitesDao;
import squad.ftt.entities.Actualites;
import static squad.ftt.gui.GestionEvenement.filePath;
/**
*
* @author rached
*/
public class GestionArticles extends javax.swing.JFrame {
    private String imageNom;
    public GestionArticles() {

        initComponents();
    ArticlesAdapter articleAdapter = new ArticlesAdapter();
        DefaultTableModel model = (DefaultTableModel) tabArticles.getModel();
        Vector column_name = new Vector();
        Vector data_row = new Vector();
        for (int i = 0; i < articleAdapter.getColumnCount(); i++) {
            column_name.addElement(articleAdapter.getColumnName(i));
            model.setColumnIdentifiers(column_name);
        }
        for (int k = 0; k < articleAdapter.getRowCount(); k++) {
            data_row = new Vector();
            data_row.addElement(articleAdapter.getValueAt(k, 1));
            data_row.addElement(articleAdapter.getValueAt(k, 3));
            data_row.addElement(articleAdapter.getValueAt(k, 2));
            data_row.addElement(articleAdapter.getValueAt(k, 5));
           
            model.addRow(data_row);
        }
        tabArticles.setModel(model);
    }

    public void filter(String query) {
        DefaultTableModel model = (DefaultTableModel) tabArticles.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tabArticles.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabArticles = new javax.swing.JTable();
        libelle = new javax.swing.JTextField();
        imageName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        prix = new javax.swing.JSpinner();
        parcourir = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        Actualite = new javax.swing.JLabel();
        Joueurs = new javax.swing.JLabel();
        Match = new javax.swing.JLabel();
        Club = new javax.swing.JLabel();
        Tournoi = new javax.swing.JLabel();
        MatchAmicale = new javax.swing.JLabel();
        GestionDopage = new javax.swing.JLabel();
        Stade = new javax.swing.JLabel();
        Concours = new javax.swing.JLabel();
        Formation5 = new javax.swing.JLabel();
        article = new javax.swing.JLabel();
        Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabArticles.setModel(new javax.swing.table.DefaultTableModel(

        ));
        tabArticles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabArticlesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabArticles);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 110, 550, 140);
        getContentPane().add(libelle);
        libelle.setBounds(390, 270, 150, 30);

        imageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageNameActionPerformed(evt);
            }
        });
        getContentPane().add(imageName);
        imageName.setBounds(390, 460, 150, 30);

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
        jLabel3.setText("Libelle Article");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 270, 150, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Description");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 350, 150, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("prix");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 310, 150, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Image");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 460, 150, 30);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane2.setViewportView(description);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(390, 350, 300, 100);
        getContentPane().add(prix);
        prix.setBounds(390, 310, 150, 30);

        parcourir.setText("Parcourir");
        parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcourirActionPerformed(evt);
            }
        });
        getContentPane().add(parcourir);
        parcourir.setBounds(560, 460, 130, 30);
        getContentPane().add(image);
        image.setBounds(880, 270, 260, 290);

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

        Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squad/ftt/images/Produit1.jpg"))); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(0, 0, 1260, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArticlesAdapter ea = new ArticlesAdapter();
        ArticlesDao aDao = new ArticlesDao();
        aDao.removeArticlesById((int) ea.getValueAt(tabArticles.getSelectedRow(),0));
     this.dispose();
        GestionArticles ge = new GestionArticles();
        ge.setSize(1220, 655);
        ge.setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabArticlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabArticlesMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabArticles.getModel();
        libelle.setText( model.getValueAt(tabArticles.getSelectedRow(), 0).toString() );
        prix.setValue( model.getValueAt(tabArticles.getSelectedRow(), 2));
        description.setText((String) model.getValueAt(tabArticles.getSelectedRow(), 1));
        
    }//GEN-LAST:event_tabArticlesMouseClicked

    private void parcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcourirActionPerformed
JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
      if(fc.getSelectedFile()!=null)
      {File f = fc.getSelectedFile();
        String fileName = f.getAbsolutePath();
        imageName.setText(fileName);
        ImageIcon imgIcon = new ImageIcon(fileName);
        Image img1 = imgIcon.getImage();
        Image img2 = img1.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        image.setIcon(new ImageIcon(img2));
        filePath=imageName.getText();
        imageNom=f.getName();
      }    
      }//GEN-LAST:event_parcourirActionPerformed
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
       ArticlesDao ad = new ArticlesDao();
      
      Articles a = new Articles();
       a.setLibelle_article(libelle.getText());
       a.setDescription(description.getText());
       a.setImg_article(imageNom);
       a.setPrix(Float.valueOf(String.valueOf(prix.getValue())));
       ad.addArticles(a);
       this.dispose();
       GestionArticles ge= new GestionArticles();
       ge.setSize(1220, 655);
       ge.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
 
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabArticles.getModel();
        ArticlesAdapter ea = new ArticlesAdapter();
        ArticlesDao aDao = new ArticlesDao();
        Articles a = new Articles();
        a.setId_articles( (int) ea.getValueAt(tabArticles.getSelectedRow(),0));
        a.setLibelle_article(libelle.getText() );
        a.setDescription(description.getText() );
        a.setPrix( Float.parseFloat(prix.getValue().toString()+"f" ));
        a.setEtat_article("disponnible");
        aDao.updateArticle(a);
        this.dispose();
        GestionArticles ge = new GestionArticles();
        ge.setSize(1220, 655);
        ge.setVisible(true); 
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionArticles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionArticles ge = new GestionArticles();
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
    private javax.swing.JLabel article;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel image;
    private javax.swing.JTextField imageName;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField libelle;
    private javax.swing.JButton parcourir;
    private javax.swing.JSpinner prix;
    private javax.swing.JTable tabArticles;
    // End of variables declaration//GEN-END:variables
}
