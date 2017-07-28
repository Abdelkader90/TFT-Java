/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import squad.ftt.adapters.ArbitreAmicalAdapter;
import squad.ftt.adapters.JoueurAmicalAdapter;
import squad.ftt.dao.classes.JoueurDao;
import squad.ftt.dao.classes.Match_JoueurDao;
import squad.ftt.dao.classes.MatchtennisDao;
import squad.ftt.dao.classes.SetTennisDao;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Match_has_joueur;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.SetTennis;

/**
 *
 * @author esprit
 */
public class GestionMatchAmical extends javax.swing.JFrame {

    JoueurAmicalAdapter joueurAmicalAdapter = new JoueurAmicalAdapter();
    ArbitreAmicalAdapter arbitreAmicalAdapter = new ArbitreAmicalAdapter();
    Matchtennis m = new Matchtennis();
    int k = 0;
    int nb = 0;
    int bn = 0;

    /**
     * Creates new form GestionEvenement
     *
     * @param match
     */
    public GestionMatchAmical(Matchtennis match) {
        initComponents();
        m = match;
    }
  public void filterArbitre(String query) {
        TableRowSorter<ArbitreAmicalAdapter> tr = new TableRowSorter<ArbitreAmicalAdapter>(arbitreAmicalAdapter);
        jTable_arbitre.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
  }
  public void filterJoueur(String query) {
        TableRowSorter<JoueurAmicalAdapter> tr = new TableRowSorter<JoueurAmicalAdapter>(joueurAmicalAdapter);
        jTable_joueur.setRowSorter(tr);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_arbitre = new JTable(arbitreAmicalAdapter);
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_joueur = new JTable(joueurAmicalAdapter);
        jButton_cancel = new javax.swing.JButton();
        jButton_ajout = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_rechercheJoueur = new javax.swing.JTextField();
        jTextField_rechercheArbitre = new javax.swing.JTextField();
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

        jTable_arbitre.getColumn("id").setMinWidth(0);
        jTable_arbitre.getColumn("id").setMaxWidth(0);
        jTable_arbitre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_arbitreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_arbitreMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_arbitre);

        jTabbedPane1.addTab("Arbitre", jScrollPane1);

        jTable_joueur.getColumn("id").setMinWidth(0);
        jTable_joueur.getColumn("id").setMaxWidth(0);
        jTable_joueur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_joueurMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_joueur);

        jTabbedPane1.addTab("Joueur", jScrollPane2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(310, 120, 580, 240);

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cancel);
        jButton_cancel.setBounds(570, 550, 100, 30);

        jButton_ajout.setText("Ajouter");
        jButton_ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ajout);
        jButton_ajout.setBounds(310, 550, 90, 30);

        jButton_update.setText("modifier");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_update);
        jButton_update.setBounds(430, 550, 100, 30);

        jLabel1.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Recherche Arbitre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 390, 150, 30);

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Recherche Joueur");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 440, 150, 30);

        jTextField_rechercheJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rechercheJoueurActionPerformed(evt);
            }
        });
        jTextField_rechercheJoueur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_rechercheJoueurKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField_rechercheJoueur);
        jTextField_rechercheJoueur.setBounds(420, 450, 150, 30);

        jTextField_rechercheArbitre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_rechercheArbitreKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField_rechercheArbitre);
        jTextField_rechercheArbitre.setBounds(420, 400, 150, 30);

        Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squad/ftt/images/match1.jpg"))); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(0, -10, 1260, 650);

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

    private void jButton_ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajoutActionPerformed
        SetTennisDao setTennisDao = new SetTennisDao();
        Match_has_joueur match_has_joueur = new Match_has_joueur();
        Match_JoueurDao match_JoueurDao = new Match_JoueurDao();
        JoueurDao joueurDao = new JoueurDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        MatchtennisDao matchDao = new MatchtennisDao();
        for (int i = 0; i < arbitreAmicalAdapter.getRowCount(); i++) {
            boolean bool = Boolean.valueOf("" + arbitreAmicalAdapter.getValueAt(i, 5));
            if (bool) {
                m.setArbitre(utilisateurDao.findUserById((int) arbitreAmicalAdapter.getValueAt(i, 0)));
            }
        }
        for (int i = 0; i < joueurAmicalAdapter.getRowCount(); i++) {
            boolean bool = Boolean.valueOf("" + joueurAmicalAdapter.getValueAt(i, 4));
            if (bool) {
                m.getListJoueur().add(joueurDao.findJoueurByCin((double) joueurAmicalAdapter.getValueAt(i, 0)));
            }
        }
        matchDao.addMatch(m);
        for (int j=0; j<5 ;j++){
            SetTennis setTennis=new SetTennis();
            setTennis.setScore1(0);
            setTennis.setScore2(0);
            setTennis.setMatch(matchDao.findLastMatch());
            setTennisDao.addSetTennis(setTennis);        
        }
        for (Joueur joueur : m.getListJoueur()) {
            match_has_joueur.setJoueur(joueur);
            match_has_joueur.setMatch(matchDao.findLastMatch());
            match_JoueurDao.addMatch_Joueur(match_has_joueur);
        }
        this.dispose();
        GestionMatchs ge = new GestionMatchs();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_jButton_ajoutActionPerformed

    private void jTable_arbitreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_arbitreMousePressed
        if (k == 0) {
            k = 1;
            nb++;
            if (nb > 1) {
                JOptionPane.showMessageDialog(null, "choisir un seul arbitre", "Erreur", JOptionPane.ERROR_MESSAGE);
            } else {
                arbitreAmicalAdapter.setValueAt(true, jTable_arbitre.getSelectedRow(), 5);

            }
        } else {
            k = 0;

            arbitreAmicalAdapter.setValueAt(false, jTable_arbitre.getSelectedRow(), 5);
        }


    }//GEN-LAST:event_jTable_arbitreMousePressed

    private void jTable_joueurMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_joueurMousePressed

        if (k == 0) {
            k = 1;
            bn++;
            if (bn > 2) {
                JOptionPane.showMessageDialog(null, "choisir 2 joueur", "Erreur", JOptionPane.ERROR_MESSAGE);

            } else {
                joueurAmicalAdapter.setValueAt(true, jTable_joueur.getSelectedRow(), 4);

            }
        } else {
            k = 0;
            joueurAmicalAdapter.setValueAt(false, jTable_joueur.getSelectedRow(), 4);
        }
    }//GEN-LAST:event_jTable_joueurMousePressed

    private void jTable_arbitreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_arbitreMouseClicked

    }//GEN-LAST:event_jTable_arbitreMouseClicked

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        Match_JoueurDao match_JoueurDao = new Match_JoueurDao();
        MatchtennisDao matchDao = new MatchtennisDao();
        List<Joueur> listJoueur = new ArrayList<>();
        Match_has_joueur match_has_joueur = new Match_has_joueur();
        JoueurDao joueurDao = new JoueurDao();
        int a = 0;
        int cn = 0;
        for (int i = 0; i < arbitreAmicalAdapter.getRowCount(); i++) {
            boolean bool = Boolean.valueOf("" + arbitreAmicalAdapter.getValueAt(i, 5));
            if (bool) {
                a++;
                m.setArbitre(utilisateurDao.findUserById((int) arbitreAmicalAdapter.getValueAt(i, 0)));
            }
            matchDao.updateMatch(m);

        }
        for (int i = 0; i < joueurAmicalAdapter.getRowCount(); i++) {
            boolean bool = Boolean.valueOf("" + joueurAmicalAdapter.getValueAt(i, 4));
            if (bool) {
                cn++;
                listJoueur.add(joueurDao.findJoueurByCin((double) joueurAmicalAdapter.getValueAt(i, 0)));
            }
        }
        if (cn > 1) {
            for (Joueur joueur : match_JoueurDao.findByMatch(m)) {
                match_has_joueur.setMatch(m);
                System.out.println(joueur);
                match_has_joueur.setJoueur(joueur);
                match_JoueurDao.deleteMatch_Joueur(match_has_joueur);
            }
            for (Joueur joueur : listJoueur) {
                match_has_joueur.setJoueur(joueur);
                match_has_joueur.setMatch(m);
                match_JoueurDao.addMatch_Joueur(match_has_joueur);
            }
        }
        if (cn == 0) {
            listJoueur = matchDao.findMatchById(m.getId_match()).getListJoueur();
        }
        m.setListJoueur(listJoueur);
        this.dispose();
        GestionMatchs ge = new GestionMatchs();
        ge.setSize(1220, 655);
        ge.setVisible(true);

    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
  int confirm=JOptionPane.showConfirmDialog(null,"vos données seront perdus, continuer?");
        if(confirm ==0){
        this.dispose();
        GestionMatchs ge = new GestionMatchs();
        ge.setSize(1220, 655);
        ge.setVisible(true);}
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jTextField_rechercheJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rechercheJoueurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rechercheJoueurActionPerformed

    private void jTextField_rechercheArbitreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rechercheArbitreKeyReleased
       String query=jTextField_rechercheArbitre.getText();
       filterArbitre(query); 
    }//GEN-LAST:event_jTextField_rechercheArbitreKeyReleased

    private void jTextField_rechercheJoueurKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rechercheJoueurKeyReleased
        String query=jTextField_rechercheJoueur.getText();
       filterJoueur(query); 
    }//GEN-LAST:event_jTextField_rechercheJoueurKeyReleased

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
            java.util.logging.Logger.getLogger(GestionMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionMatchs ge = new GestionMatchs();
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
    private javax.swing.JLabel Formation;
    private javax.swing.JLabel GestionDopage;
    private javax.swing.JLabel Joueurs;
    private javax.swing.JLabel Match;
    private javax.swing.JLabel MatchAmicale;
    private javax.swing.JLabel Stade;
    private javax.swing.JLabel Tournoi;
    private javax.swing.JLabel article;
    private javax.swing.JButton jButton_ajout;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_arbitre;
    private javax.swing.JTable jTable_joueur;
    private javax.swing.JTextField jTextField_rechercheArbitre;
    private javax.swing.JTextField jTextField_rechercheJoueur;
    // End of variables declaration//GEN-END:variables
}
