package squad.ftt.dao.classes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.dao.interfaces.Iformation;
import squad.ftt.entities.Formation;
import squad.ftt.techniques.DataSource;

public class FormationDao implements Iformation {

    private Connection connection;

    public FormationDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void add(Formation f) {

        try {
            String req = "insert into `formation` values (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, f.getId_Formation());
            ps.setString(2, f.getLibelle_formation());
            ps.setString(3, f.getGrade());
            ps.setDouble(4, f.getFormateur().getCin_user());
            ps.setDate(5, f.getDate_debut_formation());
            ps.setDate(6, f.getDate_fin_formation());
            ps.setDate(7, f.getDate_debut_postilation());
            ps.setDate(8, f.getDate_fin_postilation());
            ps.setFloat(9, f.getFrais_formation());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQL Error:" + ex);
        }

    }

    @Override
    public void update(Formation f) {
        try {
            String req = "update `formation` set `libelle`=?,`grade`=?,`id_formateur`=?,`prix`=? where `id_Formation`=?";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, f.getId_Formation());
            ps.setString(2, f.getLibelle_formation());
            ps.setString(3, f.getGrade());
            ps.setDouble(4, f.getFormateur().getCin_user());
            ps.setDate(5, f.getDate_debut_formation());
            ps.setDate(6, f.getDate_fin_formation());
            ps.setDate(7, f.getDate_debut_postilation());
            ps.setDate(8, f.getDate_fin_postilation());
            ps.setFloat(9, f.getFrais_formation());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQL Error:" + ex);
        }
    }

    @Override
    public void delete(Formation f) {

        try {
            String req = "delete from `formation` where `id_Formation`=?";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, f.getId_Formation());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQL Error:" + ex);
        }
    }

    @Override
    public List<Formation> findAll() {

        List<Formation> listeFormation = new ArrayList<>();
        String requete = "select * from `formation`";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            System.out.println("niggas");
            while (resultat.next()) {

                UtilisateurDao ad = new UtilisateurDao();
                Formation f = new Formation();
                f.setId_Formation(resultat.getInt(1));
                f.setLibelle_formation(resultat.getString(2));
                f.setGrade(resultat.getString(3));
                f.setFormateur(ad.findUserById(resultat.getInt(4)));
                f.setDate_debut_formation(resultat.getDate(5));
                f.setDate_fin_formation(resultat.getDate(6));
                f.setDate_debut_postilation(resultat.getDate(7));
                f.setDate_fin_postilation(resultat.getDate(8));
                f.setFrais_formation(resultat.getFloat(9));
                listeFormation.add(f);
            }
            return listeFormation;
        } catch (SQLException ex) {
            System.out.println("SQL Error: " + ex);
            return null;
        }
    }

    @Override
    public Formation findOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Formation findFormationById(int id_Formation) {

        String requete = "SELECT * FROM `formation` WHERE  id_Formation=?";
        Formation f = new Formation();
        UtilisateurDao ad = new UtilisateurDao();
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_Formation);
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {
                f.setId_Formation(resultat.getInt(1));
                f.setLibelle_formation(resultat.getString(2));
                f.setGrade(resultat.getString(3));
                f.setFormateur(ad.findUserById(resultat.getInt(4)));
                f.setDate_debut_formation(resultat.getDate(5));
                f.setDate_fin_formation(resultat.getDate(6));
                f.setFrais_formation(resultat.getFloat(7));

            }

            return f;
        } catch (SQLException ex) {
            System.err.println("Erreur Recherche1");
            return null;
        }
    }
}
/* public Formation findOne(int id_formation) {

 String requete = "select * from `formation` where `id_Formation`='"+id_formation+"'";
 Formation f = new Formation();
 ArbitreDao ad = new ArbitreDao();
 try {
 Statement statement = connection.createStatement();
 ResultSet resultat = statement.executeQuery(requete);

 while (resultat.next()) {
 f.setId_formation(resultat.getInt(1));
 f.setLibelle_formation(resultat.getString(2));
 f.setGrade_formation(resultat.getString(3));
 f.setFormateur(ad.findUserByCin(resultat.getDouble(4)));
 f.setPrix(resultat.getInt(5));    
 }
 return(f);
 } catch (SQLException ex) {
 System.out.println("SQL Error: " + ex);
 return null;
 }
 }

 @Override
 public void add(Formation f) {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void update(Formation f) {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void delete(Formation f) {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public List<Formation> findAll() {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 */
