package squad.ftt.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import squad.ftt.adapters.ChoixArbitreAdapter;
import squad.ftt.adapters.ChoixJoueurAdapter;
import squad.ftt.adapters.ChoixStadeAdapter;
import squad.ftt.dao.classes.EvenementDao;
import squad.ftt.dao.classes.JoueurDao;
import squad.ftt.dao.classes.MatchHasJoueurDao;
import squad.ftt.dao.classes.MatchtennisDao;
import squad.ftt.dao.classes.StadeDao;
import squad.ftt.dao.classes.TourDao;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Evenement;
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Match_has_joueur;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.Stade;
import squad.ftt.entities.Tour;
import squad.ftt.entities.Utilisateur;

/**
 *
 * @author Rached
 */
public class ChoixEvenement extends javax.swing.JFrame {

    public ChoixEvenement() {
           initComponents();  
           ChoixStadeAdapter stadeAdapter=new ChoixStadeAdapter();      
            DefaultTableModel model =(DefaultTableModel) stade_tab.getModel();
            Vector column_name=new Vector();
            Vector data_row;        
            for (int i=0 ; i<stadeAdapter.getColumnCount();i++){
              column_name.addElement(stadeAdapter.getColumnName(i));
              model.setColumnIdentifiers(column_name);}  
              for ( int k=0 ; k<stadeAdapter.getRowCount();k++)
                   {
                    data_row=new Vector();
               
                    data_row.addElement(stadeAdapter.getValueAt(k,1));
                    data_row.addElement(stadeAdapter.getValueAt(k,2));
                    data_row.addElement(stadeAdapter.getValueAt(k,3));
                    data_row.addElement(stadeAdapter.getValueAt(k,4));
                    data_row.addElement(Boolean.FALSE);
                       model.addRow(data_row);
                    }
                    stade_tab.setModel(model);  
                         
                         
            ChoixJoueurAdapter joueurAdapter=new ChoixJoueurAdapter();      
            DefaultTableModel mJoueur =(DefaultTableModel) joueur_tab.getModel();
            Vector column_name2=new Vector();
            Vector data_row2;        
            for (int i=0 ; i<joueurAdapter.getColumnCount();i++){
              column_name2.addElement(joueurAdapter.getColumnName(i));
              mJoueur.setColumnIdentifiers(column_name2);}  
              for ( int k=0 ; k<joueurAdapter.getRowCount();k++)
                   {
                    data_row2=new Vector();
                    data_row2.addElement(joueurAdapter.getValueAt(k,1));
                    data_row2.addElement(joueurAdapter.getValueAt(k,2));
                    data_row2.addElement(joueurAdapter.getValueAt(k,3));
                    data_row2.addElement(joueurAdapter.getValueAt(k,4));
                    data_row2.addElement(Boolean.FALSE);
                       mJoueur.addRow(data_row2);
                    }
                      joueur_tab.setModel(mJoueur);   
       
            ChoixArbitreAdapter arbitreAdapter=new ChoixArbitreAdapter();      
            DefaultTableModel mArbitre =(DefaultTableModel) arbitre_tab.getModel();
            Vector column_name3=new Vector();
            Vector data_row3;        
            for (int i=0 ; i<arbitreAdapter.getColumnCount();i++){
              column_name3.addElement(arbitreAdapter.getColumnName(i));
              mArbitre.setColumnIdentifiers(column_name3);}  
              for ( int k=0 ; k<arbitreAdapter.getRowCount();k++)
                   {
                    data_row3=new Vector();
                    data_row3.addElement(arbitreAdapter.getValueAt(k,1));
                    data_row3.addElement(arbitreAdapter.getValueAt(k,2));
                    data_row3.addElement(arbitreAdapter.getValueAt(k,3));
                    data_row3.addElement(arbitreAdapter.getValueAt(k,4));
                    data_row3.addElement(Boolean.FALSE);
                       mArbitre.addRow(data_row3);
                    }
                      arbitre_tab.setModel(mArbitre);   
              
                   
        
    }      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confirmer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        recherche = new javax.swing.JTextField();
        tableau = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        stade_tab = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbitre_tab = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        joueur_tab = new javax.swing.JTable();
        annuler = new javax.swing.JButton();
        etat = new javax.swing.JCheckBox();
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

        Confirmer.setText("Ajouter");
        Confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmerMouseClicked(evt);
            }
        });
        Confirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmerActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmer);
        Confirmer.setBounds(250, 530, 170, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Voulez vous afftecter des joueurs Automatiquement : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 110, 390, 30);

        recherche.setText("Votre recherche ici");
        recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheKeyReleased(evt);
            }
        });
        getContentPane().add(recherche);
        recherche.setBounds(270, 20, 230, 30);

        stade_tab.setModel(new javax.swing.table.DefaultTableModel(

        ));
        stade_tab = new JTable(stade_tab.getModel()) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;

                    case 1:
                    return String.class;

                    case 2:
                    return String.class;

                    case 3:
                    return String.class;

                    case 4:
                    return Boolean.class;

                    default:
                    return String.class;
                }
            }
        };
        jScrollPane1.setViewportView(stade_tab);
        {

        };

        tableau.addTab("Stade", jScrollPane1);

        arbitre_tab.setModel(new javax.swing.table.DefaultTableModel(

        ));
        arbitre_tab = new JTable(arbitre_tab.getModel()) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;
                    case 3:
                    return String.class;
                    case 4:
                    return Boolean.class;
                    default:
                    return String.class;
                }
            }
        };
        jScrollPane2.setViewportView(arbitre_tab);

        tableau.addTab("Arbitre", jScrollPane2);

        joueur_tab.setModel(new javax.swing.table.DefaultTableModel(

        ));
        joueur_tab = new JTable(joueur_tab.getModel()) {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    return String.class;
                    case 1:
                    return String.class;
                    case 2:
                    return String.class;
                    case 3:
                    return String.class;
                    case 4:
                    return Boolean.class;
                    default:
                    return String.class;
                }
            }
        };
        jScrollPane3.setViewportView(joueur_tab);

        tableau.addTab("Joueurs", jScrollPane3);

        getContentPane().add(tableau);
        tableau.setBounds(250, 160, 530, 330);

        annuler.setText("Annuler");
        annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerMouseClicked(evt);
            }
        });
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });
        getContentPane().add(annuler);
        annuler.setBounds(440, 530, 170, 30);

        etat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etatActionPerformed(evt);
            }
        });
        getContentPane().add(etat);
        etat.setBounds(620, 111, 20, 20);

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

        Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squad/ftt/images/event1.jpg"))); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(0, -10, 1260, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheKeyReleased
        String query= recherche.getText();
        DefaultTableModel model =(DefaultTableModel) stade_tab.getModel();
        TableRowSorter<DefaultTableModel>tr=new TableRowSorter<DefaultTableModel>(model);
        stade_tab.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query)); 
    }//GEN-LAST:event_rechercheKeyReleased
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

    private void ConfirmerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmerMouseClicked
   
     JOptionPane jop3 = new JOptionPane();
 
        
        
     if(GestionEvenement.filePath!=null)
     {   File source = new File(GestionEvenement.filePath);

          URI  u=null;
         try {
             u = new URI("file:///C://wamp//www//SquadWeb//web//uploads/"+source.getName());
         } catch (URISyntaxException ex) {
             Logger.getLogger(ChoixEvenement.class.getName()).log(Level.SEVERE, null, ex);
         }

     
     File dest = new File(u);
        try {
            copyFileUsingFileStreams(source, dest);
        } catch (IOException ex) {
            Logger.getLogger(GestionEvenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    List<Stade> stadeList = new ArrayList<Stade>();
    ChoixStadeAdapter stadeAdapter=new ChoixStadeAdapter();  
    StadeDao stadeDao = new StadeDao();
  
    List<Utilisateur> arbitreList = new ArrayList<Utilisateur>();
    ChoixArbitreAdapter arbitreAdapter=new ChoixArbitreAdapter();  
    UtilisateurDao UtilisateurDao = new UtilisateurDao();
  
    List<Joueur> joueurList = new ArrayList<>();
    ChoixJoueurAdapter joueurAdapter=new ChoixJoueurAdapter();  
    JoueurDao joueurDao = new JoueurDao();
        
    for( int i=0; i<stade_tab.getRowCount();i++)
    {      
        if((Boolean) stade_tab.getValueAt(i,4))
        {
         stadeList.add( stadeDao.findStadeById((int) stadeAdapter.getValueAt(i, 0)));
        }
    }

    for( int i=0; i<joueur_tab.getRowCount();i++)
    {   
        if((Boolean) joueur_tab.getValueAt(i,4))
        {
        joueurList.add( joueurDao.findJoueurByCin((Double) joueurAdapter.getValueAt(i, 0)));
        }
    }  
    
    for( int i=0; i<arbitre_tab.getRowCount();i++)
    {   
        if((Boolean) arbitre_tab.getValueAt(i,4))
        {
        arbitreList.add( UtilisateurDao.findUserById((int) arbitreAdapter.getValueAt(i, 0)));
        }
    }  
    
      Boolean b = true;
      Evenement e = new Evenement();
      e = GestionEvenement.evenement;
      int nbre = GestionEvenement.evenement.getNombreJoueur()/2;
    
       if(arbitreList.size()<nbre )
       {     jop3.showMessageDialog(null, "Nombre d'arbitre insuffisant", "Erreur", JOptionPane.ERROR_MESSAGE);  
             b=false;
       }
       if( joueurList.size()<e.getNombreJoueur() && etat.isSelected())
       {     jop3.showMessageDialog(null, "Nombre de joueur insuffisant", "Erreur", JOptionPane.ERROR_MESSAGE);  
             b=false;
       }
       if(stadeList.size()<nbre )
       {     jop3.showMessageDialog(null, "Nombre de stade insuffisant", "Erreur", JOptionPane.ERROR_MESSAGE);  
             b=false;
       }
   
    
    
   if(b)
   {
    //Ajout Evenement
    EvenementDao edao = new  EvenementDao();
    edao.addEvenement( GestionEvenement.evenement );
    TourDao tourDao = new TourDao();

   Date sqlDate =GestionEvenement.evenement.getDate_debut()  ;
Calendar cal = Calendar.getInstance();
cal.setTime(sqlDate);
cal.add(Calendar.DAY_OF_YEAR,0);
cal.set(Calendar.HOUR_OF_DAY, 0);
cal.set(Calendar.MINUTE, 0);
cal.set(Calendar.SECOND, 0);
cal.set(Calendar.MILLISECOND, 0);
java.sql.Date sqlTommorow = new java.sql.Date(cal.getTimeInMillis());
    
    
       MatchtennisDao md = new MatchtennisDao();  
     for (int i = 1; i <= (Math.log( GestionEvenement.evenement.getNombreJoueur() ) / Math.log(2)); i++) {
        //creation de tour    
         tourDao.addTour(new Tour(nbre,i*nbre,edao.findEvenementLast()));
       

 
    for(int j = 0 ;j<nbre ;j++ )     
    { 
            // Création des matchs (Spécifié le nombre point)     
      Matchtennis m = new Matchtennis(5,sqlTommorow,stadeList.get(j),tourDao.findLastTour(),arbitreList.get(j));
      md.addMatch(m);
      m= md.findLastMatch();
      System.out.println("ajout match"+i);
    // Creation Match_H_Joueur
      if ( i== 1){
      Match_has_joueur m1 = new Match_has_joueur(m, joueurList.get(j));
            Match_has_joueur m2 = new Match_has_joueur(m, joueurList.get(joueurList.size()-1-j));
            MatchHasJoueurDao mhd = new MatchHasJoueurDao();
            mhd.addMatch_Joueur(m1);
            mhd.addMatch_Joueur(m2);
      }

    }  
    cal.add(Calendar.DAY_OF_YEAR,2);
cal.set(Calendar.HOUR_OF_DAY, 0);
cal.set(Calendar.MINUTE, 0);
cal.set(Calendar.SECOND, 0);
cal.set(Calendar.MILLISECOND, 0);
sqlTommorow = new java.sql.Date(cal.getTimeInMillis());
    nbre= nbre/2;
}
   
    
    this.dispose();
    GestionEvenement ge = new GestionEvenement();
    ge.setSize(1220, 665);
    ge.setVisible(true);
    
   }
    
    
    
    }//GEN-LAST:event_ConfirmerMouseClicked

    private void ConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmerActionPerformed

    }//GEN-LAST:event_ConfirmerActionPerformed

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerMouseClicked

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
    this.dispose();
    GestionEvenement ge = new GestionEvenement();
    ge.setSize(1220, 665);
    ge.setVisible(true);
   
        
        
    }//GEN-LAST:event_annulerActionPerformed

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

    private void etatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etatActionPerformed

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
            java.util.logging.Logger.getLogger(ChoixEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoixEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoixEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoixEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChoixEvenement ge = new ChoixEvenement();
                ge.setSize(1220, 665);
                ge.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualite;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Concours;
    private javax.swing.JButton Confirmer;
    private javax.swing.JLabel Fond;
    private javax.swing.JLabel Formation5;
    private javax.swing.JLabel GestionDopage;
    private javax.swing.JLabel Joueurs;
    private javax.swing.JLabel Match;
    private javax.swing.JLabel MatchAmicale;
    private javax.swing.JLabel Stade;
    private javax.swing.JLabel Tournoi;
    private javax.swing.JButton annuler;
    private javax.swing.JTable arbitre_tab;
    private javax.swing.JLabel article;
    private javax.swing.JCheckBox etat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable joueur_tab;
    private javax.swing.JTextField recherche;
    private javax.swing.JTable stade_tab;
    private javax.swing.JTabbedPane tableau;
    // End of variables declaration//GEN-END:variables
}
