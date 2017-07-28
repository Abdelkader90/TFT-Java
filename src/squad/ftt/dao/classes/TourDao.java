package squad.ftt.dao.classes;

import squad.ftt.entities.Evenement;
import squad.ftt.entities.Tour;
import squad.ftt.techniques.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hppro
 */
public class TourDao {
    private final Connection connection;
     public TourDao(){
         connection = DataSource.getInstance().getConnection();
        
     }

  
    public void addTour(Tour tour) {
        try {
            System.out.println("Enregistrement Tour");
            String req = "INSERT INTO `tour`(`nbre_match`, `Evenement_Id_Evenement`, `nbre_points`) VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1,tour.getNombreMatch());
            ps.setInt(2,tour.getEvenement().getId_event());
            ps.setInt(3,tour.getNbPoint());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Tour findTourById(int id_tour) {
         EvenementDao evenementDao=new EvenementDao();
         Tour tour = new Tour();
        String requete = "select * from `tour` where `id_tour`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_tour);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                tour.setId(resultat.getInt(1));
                tour.setNombreMatch(resultat.getInt(2));
                tour.setEvenement(evenementDao.findEvenementById(resultat.getInt(3)));
                tour.setNbPoint(resultat.getInt(4));
               
            }
            return tour;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la xx " + ex.getMessage());
            return null;
        }
        }
 public Tour findLastTour() {
         Tour evenement = new Tour();
         EvenementDao edao= new EvenementDao();
        String requete = "SELECT * FROM `tour` ORDER BY id_Tour DESC LIMIT 1; ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                evenement.setId(resultat.getInt(1));
                evenement.setNombreMatch(resultat.getInt(2));
                evenement.setNbPoint(resultat.getInt(3));
                evenement.setEvenement(edao.findEvenementById(resultat.getInt(4)));
            }
            return evenement;

        } catch (SQLException ex) {
            System.out.println("erreur get Last Tour " + ex.getMessage());
            return null;
        }
    }    





}
   
    


