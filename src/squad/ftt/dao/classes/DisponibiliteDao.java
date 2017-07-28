package squad.ftt.dao.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import squad.ftt.dao.interfaces.IDisponibiliteDao;
import squad.ftt.entities.Articles;
import squad.ftt.entities.Disponibiliter;
import squad.ftt.entities.Utilisateur;
import squad.ftt.techniques.DataSource;

/**
 *
 * @author pc Sana
 */
public class DisponibiliteDao implements IDisponibiliteDao {

    Statement ste;
    PreparedStatement pst;
    ResultSet rs;
    Connection connex;

    public DisponibiliteDao() {
        connex = DataSource.getInstance().getConnection();

    }

    public void addDisponibilite(Disponibiliter d) {

        try {

            String req = "INSERT INTO `Disponibiliter`(`date_empechement` ,`User_id_user`)VALUES (?,?)";

            pst = connex.prepareStatement(req);

            pst.setDate(1, d.getDate_empechement());
            pst.setInt(2, d.getUser().getId());
            System.out.println(pst);

            pst.executeUpdate();
            System.out.println("oui");

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Disponibiliter> findAll() {
        List<Disponibiliter> listeDisponibilite = new ArrayList<>();
        String requete = "select * from `disponibiliter`";
        try {
            Statement statement = connex
                    .createStatement();
            ResultSet result = statement.executeQuery(requete);

            while (result.next()) {
                Disponibiliter valueObject = new Disponibiliter();
                valueObject.setId_Dispo(result.getInt(1));
                valueObject.setDate_empechement(result.getDate(2));
                UtilisateurDao ud = new UtilisateurDao();
                valueObject.setUser(ud.findUserById(result.getInt(3)));
                listeDisponibilite.add(valueObject);
            }
            return listeDisponibilite;
        } catch (SQLException ex) {
            System.out.println("erreur lors du charniggent " + ex.getMessage());
            return null;
        }
    }

}
