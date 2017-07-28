/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;

import java.sql.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Utilisateur;
import squad.ftt.adapters.UtilisateurAdapter;

/**
 *
 * @author hp
 */
public class GestionUtilisateurs extends javax.swing.JFrame {

    UtilisateurDao Udao = new UtilisateurDao();
    Utilisateur U = new Utilisateur();

    public GestionUtilisateurs() {

        initComponents();
        UtilisateurAdapter utilisateurAdapter = new UtilisateurAdapter();
        DefaultTableModel model = (DefaultTableModel) utilisateur_table.getModel();
        Vector column_name = new Vector();
        Vector data_row = new Vector();
        System.out.println("aaaaa");
        for (int i = 0; i < utilisateurAdapter.getColumnCount(); i++) {
            column_name.addElement(utilisateurAdapter.getColumnName(i));
            model.setColumnIdentifiers(column_name);
        }
        for (int k = 0; k < utilisateurAdapter.getRowCount(); k++) {
            data_row = new Vector();
            data_row.addElement(utilisateurAdapter.getValueAt(k, 0));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 1));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 2));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 3));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 4));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 5));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 6));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 7));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 8));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 9));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 10));
            data_row.addElement(utilisateurAdapter.getValueAt(k, 11));

            model.addRow(data_row);
        }
        utilisateur_table.setModel(model);

    }

    public void filter(String query) {
        DefaultTableModel model = (DefaultTableModel) utilisateur_table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        utilisateur_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_pwd = new javax.swing.JPasswordField();
        txt_cin_user = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        date_naiss_cal = new com.toedter.calendar.JDateChooser();
        txt_nationaliter = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        grade_combo = new javax.swing.JComboBox();
        role_combo = new javax.swing.JComboBox();
        type_combo = new javax.swing.JComboBox();
        AjoutUser = new javax.swing.JButton();
        ModifUser = new javax.swing.JButton();
        SuppUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        utilisateur_table = new javax.swing.JTable();
        Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        Stade.setBounds(0, 400, 200, 40);

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

        article.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articleMouseClicked(evt);
            }
        });
        getContentPane().add(article);
        article.setBounds(0, 590, 210, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Username: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 250, 110, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("E-mail:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 290, 70, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Mot de passe:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 330, 120, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("CIN:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 370, 70, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nom:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 410, 70, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Prénom:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 450, 100, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Date de naissance:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 500, 150, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Nationalité: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 540, 110, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Téléphone: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(820, 250, 110, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Grade Arbitre:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(820, 350, 110, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Role: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(820, 300, 60, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Type Arbitre:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(820, 400, 100, 17);

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username);
        txt_username.setBounds(430, 240, 120, 30);
        getContentPane().add(txt_mail);
        txt_mail.setBounds(430, 280, 120, 30);

        txt_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pwd);
        txt_pwd.setBounds(430, 320, 120, 30);
        getContentPane().add(txt_cin_user);
        txt_cin_user.setBounds(430, 360, 120, 30);
        getContentPane().add(txt_nom);
        txt_nom.setBounds(430, 400, 120, 30);
        getContentPane().add(txt_prenom);
        txt_prenom.setBounds(430, 440, 120, 30);

        date_naiss_cal.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date_naiss_cal);
        date_naiss_cal.setBounds(430, 490, 170, 30);
        getContentPane().add(txt_nationaliter);
        txt_nationaliter.setBounds(430, 530, 120, 30);
        getContentPane().add(txt_tel);
        txt_tel.setBounds(950, 240, 120, 30);

        grade_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","A 1", "A 2", "A 3", "A 4" }));
        grade_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_comboActionPerformed(evt);
            }
        });
        getContentPane().add(grade_combo);
        grade_combo.setBounds(950, 340, 120, 30);

        role_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Administrateur", "Medecin", "Respondable", "Arbitre" }));
        role_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_comboActionPerformed(evt);
            }
        });
        getContentPane().add(role_combo);
        role_combo.setBounds(950, 290, 120, 30);

        type_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amateur", "National", "International" }));
        getContentPane().add(type_combo);
        type_combo.setBounds(950, 390, 120, 30);

        AjoutUser.setText("Créer Utilisateur");
        AjoutUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutUserActionPerformed(evt);
            }
        });
        getContentPane().add(AjoutUser);
        AjoutUser.setBounds(730, 570, 120, 30);

        ModifUser.setText("Modifier Utilisateur");
        ModifUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifUserActionPerformed(evt);
            }
        });
        getContentPane().add(ModifUser);
        ModifUser.setBounds(860, 570, 130, 30);

        SuppUser.setText("Retirer Utilisateur");
        SuppUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppUserActionPerformed(evt);
            }
        });
        getContentPane().add(SuppUser);
        SuppUser.setBounds(1000, 570, 130, 30);

        utilisateur_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username","E-mail","Mot de passe","CIN","Nom","Prénom","Date de naissance","Nationalité","Téléphone","Grade Arbitre","Role","Type Arbitre"
            }
        ));
        utilisateur_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                utilisateur_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(utilisateur_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 100, 940, 110);

        Fond.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\SquadJava\\src\\squad\\ftt\\images\\arbitre2.jpg")); // NOI18N
        getContentPane().add(Fond);
        Fond.setBounds(10, -10, 1260, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        GestionEvenement ge = new GestionEvenement();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_TournoiMouseClicked

    private void MatchAmicaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchAmicaleMouseClicked
        this.dispose();
        GestionUtilisateurs ge = new GestionUtilisateurs();
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

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void grade_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade_comboActionPerformed

    private void role_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_comboActionPerformed
                if (! role_combo.getSelectedItem().equals("Arbitre"))
                {  grade_combo.setEnabled(false);
                   type_combo.setEnabled(false);
                }
                if ( role_combo.getSelectedItem().equals("Arbitre"))
                {  grade_combo.setEnabled(true);
                   type_combo.setEnabled(true);
                }
    }//GEN-LAST:event_role_comboActionPerformed

    private void utilisateur_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_utilisateur_tableMouseClicked

        String name = (String) utilisateur_table.getValueAt(utilisateur_table.getSelectedRow(), 0);
        U = Udao.findUtilisateurByLogin(name);
        String T = String.valueOf(U.getTel());
        String C = String.valueOf(U.getCin_user());
        txt_username.setText(U.getUsername());
        txt_mail.setText(U.getEmail());
        txt_pwd.setText(U.getPassword());
        txt_cin_user.setText(C);
        txt_nom.setText(U.getNom());
        txt_prenom.setText(U.getPrenom());
        date_naiss_cal.setDate(U.getDate_de_naissance());
        System.out.println(U.getDate_de_naissance());
        txt_nationaliter.setText(U.getNationaliter());
        txt_tel.setText(T);
        grade_combo.setSelectedItem(U.getGrade_arbitre());
        role_combo.setSelectedItem(U.getRole());
        type_combo.setSelectedItem(U.getType_arbitre());


    }//GEN-LAST:event_utilisateur_tableMouseClicked

    private void AjoutUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutUserActionPerformed
        UtilisateurDao utilisateurs = new UtilisateurDao();
        Utilisateur u = new Utilisateur();
        int cin;

        if (txt_username.getText().equals("")
                | txt_mail.getText().equals("")
                | txt_pwd.getPassword().toString().equals("")
                | txt_cin_user.getText().equals("")
                | txt_nom.getText().equals("")
                | txt_prenom.getText().equals("")
                | date_naiss_cal.getDate() == null
                | txt_nationaliter.getText().equals("")
                | txt_tel.getText().equals("")
                | grade_combo.getSelectedItem() == null
                | role_combo.getSelectedItem() == null
                | type_combo.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        } else if (!txt_mail.getText().matches("^[a-zA-Z0-9\\.\\-\\_]+@([a-zA-Z0-9\\-\\_\\.]+\\.)+([a-zA-Z]{2,4})$")) {
            JOptionPane.showMessageDialog(null, "Le mail doit contenir un @ ");
        } else {
            java.util.Date utildate = date_naiss_cal.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());

            u.setUsername(txt_username.getText());
            u.setEmail(txt_mail.getText());
            u.setPassword(txt_pwd.getText());
            u.setCin_user(Float.parseFloat(txt_cin_user.getText()));
            u.setNom(txt_nom.getText());
            u.setPrenom(txt_prenom.getText());
            u.setDate_de_naissance(sqlDate);
            u.setNationaliter(txt_nationaliter.getText());
            u.setTel(Float.parseFloat(txt_tel.getText()));
            u.setGrade_arbitre(grade_combo.getSelectedItem().toString());
            u.setRole(role_combo.getSelectedItem().toString());
            u.setType_arbitre(type_combo.getSelectedItem().toString());

            int rep = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir ajouter cet utilisateur?", "Attention", JOptionPane.YES_NO_OPTION);
            if (rep == JOptionPane.YES_OPTION) {

                utilisateurs.ajouterUtilisateur(u);

                JOptionPane.showMessageDialog(null, "Un utilisateur a été ajouté avec succes");

                utilisateur_table.setModel(new UtilisateurAdapter());

                txt_username.setText("");
                txt_mail.setText("");
                txt_pwd.setText("");
                txt_cin_user.setText("");
                txt_nom.setText("");
                txt_prenom.setText("");
                date_naiss_cal.setDateFormatString("");
                txt_nationaliter.setText("");
                txt_tel.setText("");
                grade_combo.setSelectedItem("");
                role_combo.setSelectedItem("");
                type_combo.setSelectedItem("");

            }


    }//GEN-LAST:event_AjoutUserActionPerformed
    }
    private void ModifUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifUserActionPerformed
                                  
        UtilisateurDao utilisateurs = new UtilisateurDao();
        Utilisateur u = new Utilisateur();
        
        int cin;
        if (utilisateur_table.getSelectedRow() > -1) {

            java.util.Date utilDate = date_naiss_cal.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            u.setUsername(txt_username.getText());
            u.setEmail(txt_mail.getText());
            u.setPassword(txt_pwd.getPassword().toString());
            u.setCin_user(Float.parseFloat(txt_cin_user.getText()));
            u.setNom(txt_nom.getText());
            u.setPrenom(txt_prenom.getText());
            u.setDate_de_naissance(sqlDate);
            u.setNationaliter(txt_nationaliter.getText());
            u.setTel(Float.parseFloat(txt_tel.getText()));
            u.setGrade_arbitre(grade_combo.getSelectedItem().toString());
            u.setRole(role_combo.getSelectedItem().toString());
            u.setType_arbitre(type_combo.getSelectedItem().toString());

    int rep = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir modifier cet utilisateur?", "Attention", JOptionPane.YES_NO_OPTION);
    if (rep == JOptionPane.YES_OPTION) {

        utilisateurs.modifierUtilisateur(u);

            JOptionPane.showMessageDialog(null, "Un utilisateur a été modifié avec succes");


                utilisateur_table.setModel(new UtilisateurAdapter());
                txt_username.setText("");
                txt_mail.setText("");
                txt_pwd.setText("");
                txt_cin_user.setText("");
                txt_nom.setText("");
                txt_prenom.setText("");
                date_naiss_cal.setDateFormatString("");
                txt_nationaliter.setText("");
                txt_tel.setText("");
                grade_combo.setSelectedItem("");
                role_combo.setSelectedItem("");
                type_combo.setSelectedItem("");

            }
        } else if (utilisateur_table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un utilisateur à modifier");
        }
    }//GEN-LAST:event_ModifUserActionPerformed

    private void SuppUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppUserActionPerformed

        if (utilisateur_table.getSelectedRow() > -1) {

            int reply = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir supprimer cet utilisateur ?", "Attention", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                
                String name = (String) utilisateur_table.getValueAt(utilisateur_table.getSelectedRow(), 0);
                U = Udao.findUtilisateurByLogin(name);
                Double cin = U.getCin_user();
                Udao.removeUtilisateurByCin(cin);
                JOptionPane.showMessageDialog(null, "Un utilisateur a été supprimé ");
                utilisateur_table.setModel(new UtilisateurAdapter());
                
            }}
         
        else if (utilisateur_table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un utilisateur à supprimer");
        }

    }//GEN-LAST:event_SuppUserActionPerformed

    private void txt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdActionPerformed

    private void articleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articleMouseClicked
            this.dispose();
        AffichageArticles ge = new AffichageArticles();
        ge.setSize(1220, 655);
        ge.setVisible(true);
    }//GEN-LAST:event_articleMouseClicked

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
            java.util.logging.Logger.getLogger(GestionUtilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUtilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUtilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUtilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                GestionUtilisateurs ge = new GestionUtilisateurs();
                ge.setSize(1220, 665);
                ge.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualite;
    private javax.swing.JButton AjoutUser;
    private javax.swing.JLabel Club;
    private javax.swing.JLabel Concours;
    private javax.swing.JLabel Fond;
    private javax.swing.JLabel Formation5;
    private javax.swing.JLabel GestionDopage;
    private javax.swing.JLabel Joueurs;
    private javax.swing.JLabel Match;
    private javax.swing.JLabel MatchAmicale;
    private javax.swing.JButton ModifUser;
    private javax.swing.JLabel Stade;
    private javax.swing.JButton SuppUser;
    private javax.swing.JLabel Tournoi;
    private javax.swing.JLabel article;
    private com.toedter.calendar.JDateChooser date_naiss_cal;
    private javax.swing.JComboBox grade_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox role_combo;
    private javax.swing.JTextField txt_cin_user;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nationaliter;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JPasswordField txt_pwd;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_username;
    private javax.swing.JComboBox type_combo;
    private javax.swing.JTable utilisateur_table;
    // End of variables declaration//GEN-END:variables
}