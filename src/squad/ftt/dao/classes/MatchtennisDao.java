package squad.ftt.dao.classes;

import squad.ftt.entities.Joueur;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.Tour;
import squad.ftt.techniques.DataSource;
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

/**
 *
 * @author hppro
 */
public class MatchtennisDao  {

    private final Connection connection;

    public MatchtennisDao() {
        connection = DataSource.getInstance().getConnection();
    }

   
    public void addMatch(Matchtennis match) {
        try {
            String req = "INSERT INTO `matchtennis`(`date_match`, `valeur_en_point`,`Stade_id_Stade`, `Tour_id_Tour`, `User_id_user`) VALUES (?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDate(1, match.getDate_match());
            ps.setInt(2, match.getNombre_point());
            ps.setInt(3, match.getStade().getId_stade());
            ps.setInt(4, match.getTour().getId());
            ps.setInt(5, (int) match.getArbitre().getId());
            

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MatchtennisDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    public void updateMatch(Matchtennis match) {

        
        String requete = "update `matchtennis` set `date_match`=?, `valeur_en_point`=?,`Stade_id_stade`=?, `Tour_id_Tour`=?,`User_id_user`=?  where `id_Match`=?";

        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setDate(1, match.getDate_match());
            ps.setInt(2, match.getNombre_point());
            ps.setInt(3, match.getStade().getId_stade());
            ps.setInt(4, match.getTour().getId());
            ps.setInt(5, (int) match.getArbitre().getId());
            ps.setInt(6, match.getId_match());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

        
    }
 
    public void removeMatchById(int id_match) {

        String requete = "delete from `matchtennis` where `id_Match`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_match);
            ps.executeUpdate();
            System.out.println("Match supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }

    }

   
    public List<Matchtennis> findAll() {
       UtilisateurDao arbitreDao = new UtilisateurDao();
        StadeDao stadeDao = new StadeDao();
        TourDao tourDao = new TourDao();
        List<Matchtennis> listeMatches = new ArrayList<>();
        Match_JoueurDao mjd = new Match_JoueurDao();
        String requete = "select * from `matchtennis`";

        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Matchtennis match = new Matchtennis();
                match.setId_match(resultat.getInt(1));
                match.setDate_match(resultat.getDate(2));
                match.setNombre_point(resultat.getInt(3));
                match.setStade(stadeDao.findStadeById(resultat.getInt(4)));
                match.setTour(tourDao.findTourById(resultat.getInt(5)));              
                match.setArbitre(arbitreDao.findUserById((int) resultat.getInt(6)));
                match.setListJoueur(mjd.findByMatch(match));
                listeMatches.add(match);
            }
            return listeMatches;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des matches " + ex.getMessage());
            return null;
        }
        }

     
    public Matchtennis findMatchById(int id_match) {
    
        Matchtennis match = new Matchtennis();
        TourDao td = new TourDao();
        StadeDao sd = new StadeDao();
        UtilisateurDao arbitreDao = new UtilisateurDao();
        Match_JoueurDao mjd = new Match_JoueurDao();
        String requete = "SELECT * FROM `matchtennis` WHERE `id_Match`=?";

        try {
            PreparedStatement ps = connection.prepareStatement(requete);

            ps.setInt(1, id_match);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                match.setId_match(resultat.getInt(1));
                match.setDate_match(resultat.getDate(2));
                match.setNombre_point(resultat.getInt(3));
                match.setStade(sd.findStadeById(resultat.getInt(4)));
                match.setTour(td.findTourById(resultat.getInt(5))); 
                match.setArbitre(arbitreDao.findUserById((int) resultat.getInt(6)));
                match.setListJoueur(mjd.findByMatch(match));
            }
            return match;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du match " + ex.getMessage());
            return null;
        }
    
        }

  
    public List<Matchtennis> findMatchByDate(Date date_match) {
/*
        String requete = "select * from `match` where `date`=?";
        List<Matchtennis> listeMatches = new ArrayList();
        TourDao td = new TourDao();
        StadeDao sd = new StadeDao();
        
               try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setDate(1, date_match);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Matchtennis match = new Matchtennis();
                match.setId_match(resultat.getInt(1));
                Matchtennis m = new Matchtennis();
                m.setId_match(resultat.getInt(1));
                match.setDate_match(resultat.getDate(2));
                match.setNombre_point(resultat.getInt(3));
                match.setArbitre(ad.findUserByCin(resultat.getDouble(4)));
                match.setTour(td.findTourById(resultat.getInt(5)));
                match.setStade(sd.findStadeById(resultat.getInt(6)));
               match.setListJoueur(mjd.findByMatch(m));
                listeMatches.add(match);
            }
            return listeMatches;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du match " + ex.getMessage());
            return null;
        }

  */ return null;
        }
    
    

    public Joueur whoWon(Matchtennis m) {
        
      /*  Set_matchDao sd = new Set_matchDao();
        
        List<Joueur> listeJoueur = m.getListJoueur();
        int scorej1 = sd.nbSetMatchByJoueur(m, listeJoueur.get(0));
        int scorej2 = sd.nbSetMatchByJoueur(m, listeJoueur.get(1));
        if(scorej1>scorej2)
        {
            
            return listeJoueur.get(0);
        }
        else
        {
            return listeJoueur.get(1);
        }
     */  
   return null;
    }



public Matchtennis findLastMatch() {
         Matchtennis evenement = new Matchtennis();
         StadeDao sd = new StadeDao();
         TourDao td = new TourDao();
         UtilisateurDao ad = new UtilisateurDao();
        String requete = "SELECT * FROM `Matchtennis` ORDER BY id_Match DESC LIMIT 1; ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                evenement.setId_match(resultat.getInt(1));
                evenement.setDate_match(resultat.getDate(2));   
                evenement.setNombre_point(resultat.getInt(3));
                evenement.setStade(sd.findStadeById(resultat.getInt(4)));
                evenement.setTour(td.findTourById(resultat.getInt(5) ));
                evenement.setArbitre(ad.findUserById(resultat.getInt(6)));
            }
            return evenement;

        } catch (SQLException ex) {
            System.out.println("erreur get Last Match  " + ex.getMessage());
            return null;
        }
    }

    public List<Matchtennis> findMatchByEvenement( int idEvent) {
        UtilisateurDao arbitreDao = new UtilisateurDao();
        StadeDao stadeDao = new StadeDao();
        TourDao tourDao = new TourDao();
        List<Matchtennis> listeMatches = new ArrayList<>();      
        String requete = "select * from `matchtennis` where Tour_id_Tour in ( select id_Tour from Tour where Evenement_id_Evenement="+idEvent+"  )   ";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
            Matchtennis match = new Matchtennis();
            match.setId_match(resultat.getInt(1));
            Matchtennis m = new Matchtennis();
            m.setId_match(resultat.getInt(1));
            match.setDate_match(resultat.getDate(2));
            match.setNombre_point(resultat.getInt(3));
            match.setArbitre(arbitreDao.findUserById(resultat.getInt(6)));
            match.setTour(tourDao.findTourById(resultat.getInt(5)));
            match.setStade(stadeDao.findStadeById(resultat.getInt(4)));
            listeMatches.add(match);
            }
            return listeMatches;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des matches " + ex.getMessage());
            return null;
        }
    }
}
