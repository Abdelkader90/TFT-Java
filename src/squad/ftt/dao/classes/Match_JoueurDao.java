/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.classes;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import squad.ftt.dao.interfaces.IMatch_joueur;
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Match_has_joueur;
import squad.ftt.entities.Matchtennis;
import squad.ftt.techniques.DataSource;

/**
 *
 * @author Maynoo
 */
public class Match_JoueurDao implements IMatch_joueur {

    private final Connection connection;

    public Match_JoueurDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void addMatch_Joueur(Match_has_joueur a) {
        try {
            System.out.println("Enregistrement");
            String req = "insert into `Match_has_joueur` (`Match_id_match`,`Joueur_cin`) values (?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, a.getMatch().getId_match());
            ps.setDouble(2, a.getJoueur().getCin_joueur());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteMatch_Joueur(Match_has_joueur a) {
        String requete = "delete from `Match_has_joueur` where `Match_id_match`=? and `Joueur_cin`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, a.getMatch().getId_match());
            ps.setDouble(2, a.getJoueur().getCin_joueur());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public List<Match_has_joueur> findAll() {
        List<Match_has_joueur> listem = new ArrayList<>();
        String requete = "select * from `Match_has_joueur`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            MatchtennisDao md = new MatchtennisDao();
            JoueurDao jd = new JoueurDao();
            while (resultat.next()) {
                Match_has_joueur mhj = new Match_has_joueur();
                mhj.setMatch(md.findMatchById(resultat.getInt(1)));
                mhj.setJoueur(jd.findJoueurByCin(resultat.getDouble(2)));

                listem.add(mhj);
            }
            return listem;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des evenement " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Matchtennis> findByJoueur(Joueur j) {
        List<Matchtennis> listeMatch = new ArrayList<>();
        String requete = "select * from `Match_has_joueur` where `id_joueur`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setDouble(1, j.getCin_joueur());
            Statement statement = connection
                    .createStatement();

            ResultSet resultat = statement.executeQuery(requete);
            MatchtennisDao md = new MatchtennisDao();
            JoueurDao jd = new JoueurDao();
            while (resultat.next()) {
                Matchtennis m = md.findMatchById(resultat.getInt(1));
                listeMatch.add(m);
            }
            return listeMatch;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des evenement " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Joueur> findByMatch(Matchtennis m) {
        List<Joueur> listejoueur = new ArrayList<>();
        String requete = "select * from `match_has_joueur` where `Match_id_Match`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, m.getId_match());
            ResultSet resultat = ps.executeQuery();
            JoueurDao jd = new JoueurDao();
           
            while (resultat.next()) {
                Joueur j = jd.findJoueurByCin(resultat.getDouble(3));
                
                listejoueur.add(j);
            }
            return listejoueur;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des evenement " + ex.getMessage());
            return null;
        }
    }

}
