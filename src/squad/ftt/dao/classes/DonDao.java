/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.classes;

import squad.ftt.dao.interfaces.IDAO;
import squad.ftt.entities.Don;
import squad.ftt.techniques.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import squad.ftt.entities.Club;

/**
 *
 * @author Gadour
 */
public class DonDao implements IDAO<Don> {

    private Connection connection;

    public DonDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void Ajouter(Don d) {
        try {
            String req = "INSERT INTO `don`(`somme`, `date_don`, `Club_id_Club`) VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setFloat(1, d.getSomme());
            ps.setDate(2, d.getDate_don());
            ps.setInt(3, d.getClub().getId_Club());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout d'un don" + ex.getMessage());
        }
    }

    @Override
    public void Modifier(Don d) {
        String req = "UPDATE `don` SET `somme`=?,`date_don`=?,`Club_id_Club`=? WHERE `id_Don`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setFloat(1, d.getSomme());
            ps.setDate(2, d.getDate_don());
            ps.setInt(3, d.getClub().getId_Club());
            ps.setInt(4, d.getId_Don());

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour du don" + ex.getMessage());
        }
    }

    @Override
    public void Supprimer(Don d) {
        String req = "DELETE FROM `don` WHERE id_Don=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, d.getId_Don());

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("erreur lors de la supression du don" + ex.getMessage());
        }
    }

    @Override
    public List<Don> Afficher() {
        List<Don> dons = new ArrayList<>();

        ClubDao cd = new ClubDao();

        String req = "select * from don";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Don d = new Don();
                d.setId_Don(rs.getInt("id_Don"));
                d.setSomme(rs.getFloat("somme"));
                d.setDate_don(rs.getDate("date_don"));
                d.setClub(cd.RechercherParId(rs.getInt("Club_id_Club")));

                dons.add(d);

            }

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'affichage du don" + ex.getMessage());
        }
        return dons;
    }

    public List<Don> Afficher(int idcllub) {
        List<Don> dons = new ArrayList<>();

        ClubDao cd = new ClubDao();

        String req = "select * from don where `Club_id_Club`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, idcllub);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Don d = new Don();
                d.setId_Don(rs.getInt("id_Don"));
                d.setSomme(rs.getFloat("somme"));
                d.setDate_don(rs.getDate("date_don"));
                d.setClub(cd.RechercherParId(rs.getInt("Club_id_Club")));

                dons.add(d);

            }

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'affichage du don" + ex.getMessage());
        }
        return dons;
    }

    @Override
    public Don RechercherParId(int id) {
        Don d = new Don();
        ClubDao cd = new ClubDao();

        String req = "select * from don where id_Don=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d.setId_Don(rs.getInt("id_Don"));
                d.setSomme(rs.getFloat("somme"));
                d.setDate_don(rs.getDate("date_don"));
                d.setClub(cd.RechercherParId(rs.getInt("Club_id_Club")));

            }
            return d;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du don" + ex.getMessage());
            return null;
        }
    }

}
