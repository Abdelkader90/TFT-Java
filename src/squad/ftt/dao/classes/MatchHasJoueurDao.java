/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.classes;
 
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.Match_has_joueur;
import squad.ftt.techniques.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maynoo
 */
public class MatchHasJoueurDao {

    private Connection connection;

    public MatchHasJoueurDao() {
        connection = DataSource.getInstance().getConnection();
    }

     
    public void addMatch_Joueur(Match_has_joueur a) {
        try {
            System.out.println("Enregistrement");
            String req = "insert into `match_has_joueur` (`Match_id_Match`,`Joueur_cin`) values (?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, a.getMatch().getId_match());
            ps.setDouble(2, a.getJoueur().getCin_joueur());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

       public void updateMatch_Joueur(Match_has_joueur a) {
    /*    try {
            System.out.println("Enregistrement");
            String req = "Update `match_has_joueur` set `Match_id_Match`=?,`Joueur_cin`=? where `id_match_has_joueur`=? ";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1, a.getMatch().getId_match());
            ps.setDouble(2, a.getJoueur().getCin_joueur());
            ps.setDouble(3, a.getId_match_has_joueur());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }

      public void deleteMatch_Joueur(Match_has_joueur a) {
  /*      String requete = "delete from `match_has_joueur` where `id_match_has_joueur`=? Order by `id_match_has_joueur`";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, a.getId_match_has_joueur());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    */
          }

    
    public List<Match_has_joueur> findAll() {
    /*    List<Match_has_joueur> listem = new ArrayList<>();
        String requete = "select * from `match_has_joueur` Order by `id_match_has_joueur`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            MatchDao md = new MatchDao();
            JoueurDao jd = new JoueurDao();
            while (resultat.next()) {
                Match_has_joueur mhj = new Match_has_joueur();
                mhj.setId_match_has_joueur(resultat.getInt(1));
                mhj.setMatch(md.findMatchById(resultat.getInt(2)));
                mhj.setJoueur(jd.findJoueurByCin(resultat.getInt(3)));

                listem.add(mhj);
            }
            return listem;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des evenement " + ex.getMessage());
            return null;
        }
    
            */return null;
            
    }

    
    public List<Matchtennis> findByJoueur(Joueur j) {
       /* List<Match> listeMatch = new ArrayList<>();
        String requete = "select * from `match_has_joueur` where `Joueur_cin`=? Order by `id_match_has_joueur`";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setDouble(1, j.getCin_joueur());
            System.out.println(j.getCin_joueur());
            ResultSet resultat = ps.executeQuery();
            MatchDao md = new MatchDao();
            while (resultat.next()) {
                
                Match m = md.findMatchById(resultat.getInt(2));
                listeMatch.add(m);
            }
            return listeMatch;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement de Match Has Joueur " + ex.getMessage());
            return null;
        }
   */return null;
               }

    
    public List<Joueur> findByMatch(Matchtennis m) {
      /*  List<Joueur> listejoueur = new ArrayList<>();
        String requete = "select * from `match_has_joueur` where `Match_id_Match`=? Order by `id_match_has_joueur`";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, m.getId_match());

            Statement statement = connection.createStatement();
            ResultSet resultat = ps.executeQuery();
            JoueurDao jd = new JoueurDao();
            while (resultat.next()) {
                Joueur j = jd.findJoueurByCin(resultat.getInt(3));
                listejoueur.add(j);
            }
            return listejoueur;
        } catch (SQLException ex) {
            System.out.println("erreur lors du cxxxment " + ex.getMessage());
            return null;
        }
    */ return null;
    } 
    

}
