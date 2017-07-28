package squad.ftt.dao.classes;

import squad.ftt.dao.interfaces.IevenementDao;
import squad.ftt.entities.Evenement;
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
import squad.ftt.entities.Actualites;

/**
 *
 * @author hppro
 */
public class ActualitesDao {
    private final Connection connection;
     public ActualitesDao(){
         connection = DataSource.getInstance().getConnection();
     }

    public void addActualites(Actualites a) {
        try {
            System.out.println("Enregistrement");
            String req = "  INSERT INTO Actualites (titre, corps,dateRedaction, etat, photo) VALUES (?, ?, ?, ?, ?) ";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1,a.getTitre());
            ps.setString(2,a.getCorps());
            ps.setDate(3,a.getDateRedaction());
            ps.setString(4,a.getEtat());
            ps.setString(5,a.getPhoto());
  
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Evenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void updateActualite(Actualites a) {
        String requete = "UPDATE Actualites SET titre = ?, corps = ?, dateRedaction = ?,etat = ?, photo = ? WHERE (idActualite = ? )";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1,a.getTitre());
            ps.setString(2,a.getCorps());
            ps.setDate(3,a.getDateRedaction());
            ps.setString(4,a.getEtat());
            ps.setString(5,a.getPhoto());
            ps.setInt(6,a.getIdActualite());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    
    }
        
    public void removeActualitesById(int id_act) {
        String requete = "delete from `Actualites` where `idActualite`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_act);
            ps.executeUpdate();
            System.out.println("Actualites supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }    
    }
        
    public List<Actualites> findAll() {
      List<Actualites> listeEvents = new ArrayList<>();
        String requete = "select * from `Actualites`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet result = statement.executeQuery(requete);

            while (result.next()) {
                Actualites valueObject = new Actualites();
                   valueObject.setIdActualite(result.getInt("idActualite")); 
                   valueObject.setTitre(result.getString("titre")); 
                   valueObject.setCorps(result.getString("corps")); 
                   valueObject.setDateRedaction(result.getDate("dateRedaction")); 
                   valueObject.setEtat(result.getString("etat")); 
                   valueObject.setPhoto(result.getString("photo")); 

                listeEvents.add(valueObject);
            }
            return listeEvents;
        } catch (SQLException ex) {
            System.out.println("erreur lors du charniggent " + ex.getMessage());
            return null;
        }
    }

    public Actualites findActualiteById(int id_act) {
         Actualites valueObject = new Actualites();
        String requete = "SELECT * FROM `actualites` WHERE `idActualites`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_act);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                    valueObject.setIdActualite(result.getInt("idActualite")); 
                   valueObject.setTitre(result.getString("titre")); 
                   valueObject.setCorps(result.getString("corps")); 
                   valueObject.setDateRedaction(result.getDate("dateRedaction")); 
                   valueObject.setEtat(result.getString("etat")); 
                   valueObject.setPhoto(result.getString("photo")); 
            }
            return valueObject;

        } catch (SQLException ex) {
            System.out.println("erreur FindActualiteById " + ex.getMessage());
            return null;
        }
    }
    
}
