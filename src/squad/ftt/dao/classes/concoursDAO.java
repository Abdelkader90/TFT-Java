/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.classes;
import squad.ftt.entities.Concours;
import squad.ftt.techniques.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import java.text.DateFormat;
/**
 *
 * @author Houssem
 */
public class concoursDAO {
    Connection cnx;
    public concoursDAO() {
        cnx = DataSource.getInstance().getConnection();
    }
    Statement st = null;
    public void ajouterConcours(Concours c) {
        String requete = "INSERT INTO concours(libelle_concour,date_debut_concour,lieu_concour,description_concours,frais_participation,date_debut_depot,date_fin_depot,type_concour) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = cnx.prepareStatement(requete);
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");
            //java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            //st.setDouble(1, c.getId_Concour());
            st.setString(1, c.getLibelle_concour());
            st.setDate(2, c.getDate_debut_concour());
            st.setString(3, c.getLieu_concour());
            st.setString(4, c.getDescription_concours());
            st.setFloat(5, c.getFrais_participation());
            st.setDate(6, c.getDate_debut_depot());
            st.setDate(7, c.getDate_fin_depot());
            st.setString(8, c.getType_concour());
            st.executeUpdate();
            System.out.println("objet ajouté");
        } catch (SQLException ex) {
            System.out.println("objet non ajouté");
        }
    }
    public Concours findConcoursById(int id_Concour) {
        String requete = "SELECT * FROM `concours` WHERE id_Concour=?";
        Concours c = new Concours();
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, id_Concour);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c.setId_Concour(rs.getInt(1));
                c.setLibelle_concour(rs.getString(2));
                c.setDate_debut_concour(rs.getDate(3));
                c.setLieu_concour(rs.getString(4));
                c.setDescription_concours(rs.getString(5));
                c.setFrais_participation(rs.getFloat(6));
                c.setDate_debut_depot(rs.getDate(7));
                c.setDate_fin_depot(rs.getDate(8));
                c.setType_concour(rs.getString(9));
            }                
            return c;
        } catch (SQLException ex) {
            System.err.println("Erreur Recherche1");
            return null;
        }
    }
    public void modifierConcours(Concours c, int id_Concour) {
        String requete = "UPDATE concours set libelle_concour=? , date_debut_concour=? , lieu_concour=? , description_concours=? , frais_participation=? , date_debut_depot=? , date_fin_depot=? , type_concour=? where id_Concour=" + id_Concour;
        try {
            PreparedStatement pst = cnx.prepareStatement(requete);
            if (c.getLibelle_concour() != null) {
                pst.setString(1, c.getLibelle_concour());
            }
            if (c.getDate_debut_concour() != null) {
                pst.setDate(2, c.getDate_debut_concour());
            }
            if (c.getLieu_concour() != null) {
                pst.setString(3, c.getLieu_concour());
            }
            if (c.getDescription_concours() != null) {
                pst.setString(4, c.getDescription_concours());
            }
            if (c.getFrais_participation() != null) {
                pst.setDouble(5, c.getFrais_participation());
            }
            if (c.getDate_debut_depot() != null) {
                pst.setDate(6, c.getDate_debut_depot());
            }
            if (c.getDate_fin_depot() != null) {
                pst.setDate(7, c.getDate_fin_depot());
            }
            if (c.getType_concour() != null) {
                pst.setString(8, c.getType_concour());
            }
            pst.executeUpdate();
            System.out.println("modification avec succes");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public List<Concours> DisplayAllConcours() {
        List<Concours> listeConcours = new ArrayList<>();
        String requete = "select * from concours";
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Concours c = new Concours();
                c.setId_Concour(resultat.getInt(1));
                c.setLibelle_concour(resultat.getString(2));
                c.setDate_debut_concour(resultat.getDate(3));
                c.setLieu_concour(resultat.getString(4));
                c.setDescription_concours(resultat.getString(5));
                c.setFrais_participation(resultat.getFloat(6));
                c.setDate_debut_depot(resultat.getDate(7));
                c.setDate_fin_depot(resultat.getDate(8));
                c.setType_concour(resultat.getString(9));
                listeConcours.add(c);
            }
            return listeConcours;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement de la liste des concours " + ex.getMessage());
            return null;
        }
    }
    public boolean deleteConcours(int id_Concour) {
        boolean testDelete = false;
        String req = "delete from concours where id_Concour=?";
        try {
            PreparedStatement ste = cnx.prepareStatement(req);
            ste.setInt(1, id_Concour);
            int res = ste.executeUpdate();
            if (res != 0) {
                testDelete = true;
                System.out.println("Un concours a Ã©tÃ© suuprimÃ© avec succÃ©e émoticône smile ");
            }
        } catch (SQLException ex) {
            System.out.println("Echec de suppression ! " + ex.getMessage());
            ex.printStackTrace();
        }
        return testDelete;
    }
    public static void main(String[] args) {
        concoursDAO c = new concoursDAO();
        Concours match = c.findConcoursById(1);
        System.out.println(match.getLibelle_concour());
        c.ajouterConcours(match);
        c.modifierConcours(match, 1);
        c.deleteConcours(1);
        
    }
}