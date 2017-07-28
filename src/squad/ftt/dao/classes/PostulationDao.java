package squad.ftt.dao.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import squad.ftt.entities.Concours;
import squad.ftt.entities.Formation;
import squad.ftt.entities.Postulation;

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
import squad.ftt.dao.interfaces.IPostulationDao;
import squad.ftt.techniques.DataSource;

/**
 *
 * @author pc Sana
 */
public class PostulationDao implements IPostulationDao {

    Statement ste;
    PreparedStatement pst;
    Connection connection;
    ResultSet rs;
    Connection connex;

    public PostulationDao() throws IOException {
        connex = DataSource.getInstance().getConnection();
    }

    @Override
    public void ajouterPostulation(Postulation p) {

        try {
            String req = "INSERT INTO `postulation` (`Id_Postulation`,`Concours_id_Concour`, `User_id_user`, `nbre_match`, `anciennete`, `cv_arbitre`) VALUES (?,?,?,?,?,?)";

            try {
                pst = connex.prepareStatement(req);
            } catch (SQLException ex) {
                Logger.getLogger(PostulationDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pst.setInt(1, p.getId_Postulation());
            pst.setInt(2, p.getConcours_id_Concour());

            // pst.setInt(3, 1);
            pst.setDouble(3, p.getUser().getId());
            pst.setInt(4, p.getNbre_match());
            pst.setDouble(5, p.getAnciennete());
            pst.setString(6, p.getCv_arbitre());

            System.out.println(pst);

            pst.executeUpdate();
            System.out.println("oui");

        } catch (SQLException ex) {
            Logger.getLogger(PostulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Formation> findAll() {

        List<Formation> listeFormation = new ArrayList<>();
        String requete = "select * from `formation`";

        UtilisateurDao ad = new UtilisateurDao();

        try {
            Statement statement = connex.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
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

    public List<Concours> DisplayConcoursByGrade() {
        List<Concours> listeConcours = new ArrayList<>();

        String requete = "SELECT * FROM `concours` WHERE type_concour='a1'";
        try {
            Statement statement = connex.createStatement();
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
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }

    public void ajouterPostulationFormation(Postulation p) {

        try {
            String req = "INSERT INTO `postulation` (`id_Postulation`,Formation_id_Formation, `User_id_user`, `nbre_match`, `anciennete`, `cv_arbitre`) VALUES (?,?,?,?,?,?)";

            try {
                pst = connex.prepareStatement(req);
            } catch (SQLException ex) {
                Logger.getLogger(PostulationDao.class.getName()).log(Level.SEVERE, null, ex);
            }

            pst.setInt(1, p.getId_Postulation());
            // pst.setInt(2, 1);
            pst.setInt(2, p.getFormation_id_Formation());
            pst.setDouble(3, p.getUser().getId());
            pst.setInt(4, p.getNbre_match());
            pst.setDouble(5, p.getAnciennete());
            pst.setString(6, p.getCv_arbitre());
            System.out.println(pst);
            pst.executeUpdate();
            System.out.println("oui");

        } catch (SQLException ex) {
            Logger.getLogger(PostulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Concours> DisplayConcoursByGrade(String grade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
