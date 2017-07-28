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

/**
 *
 * @author hppro
 */
public class EvenementDao implements IevenementDao{
    private final Connection connection;
     public EvenementDao(){
         connection = DataSource.getInstance().getConnection();
     }

    @Override
    public void addEvenement(Evenement evenement) {
        try {
            System.out.println("Enregistrement");
            String req = "insert into `evenement` (`libelle_evenement`,`date_debut`,`date_fin`,`site`,`type`,`nbre_joueur`,`image_eve`) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, evenement.getLibelle());
            ps.setDate(2,evenement.getDate_debut());
            ps.setDate(3, evenement.getDate_fin());
            ps.setString(4, evenement.getSite());
            ps.setString(5, evenement.getType());
            ps.setInt(6, evenement.getNombreJoueur());
            ps.setString(7, evenement.getImage());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Evenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void addPhoto(Evenement evenement) {
        try {
            System.out.println("Enregistrement");
            String req = "insert into `evenement` (`libelle`,`date_deb`,`date_fin`,`site`,`type`,`nombreJoueur`,`id`) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, evenement.getLibelle());
            ps.setDate(2,evenement.getDate_debut());
            ps.setDate(3, evenement.getDate_fin());
            ps.setString(4, evenement.getSite());
            ps.setString(5, evenement.getType());
            ps.setInt(6, evenement.getNombreJoueur());
            ps.setInt(7,evenement.getId_event());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Evenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    @Override
    public void updateEvenement(Evenement evenement) {
        String requete = "update `evenement` set `libelle_Evenement`=?, `date_debut`=?, `date_fin`=?, `site`=?, `type`=? where `id_Evenement`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, evenement.getLibelle());
            ps.setDate(2, evenement.getDate_debut());
            ps.setDate(3, evenement.getDate_fin());
            ps.setString(4, evenement.getSite());
            ps.setString(5, evenement.getType());
            ps.setInt(6, evenement.getId_event());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    
    }
        
    

    @Override
    public void removeEvenementByLibelle(String libelle) {
        
    }

    @Override
    public void removeEvenementById(int id_event) {
        String requete = "delete from `evenement` where `id_Evenement`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_event);
            ps.executeUpdate();
            System.out.println("evenement supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    
    }
        
    @Override
    public List<Evenement> findAll() {
      List<Evenement> listeEvents = new ArrayList<>();
        String requete = "select * from `evenement`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Evenement evenement = new Evenement();
                evenement.setId_event(resultat.getInt(1));
                evenement.setLibelle(resultat.getString(2));
                evenement.setDate_debut(resultat.getDate(3));
                evenement.setDate_fin(resultat.getDate(4));
                evenement.setSite(resultat.getString(5));
                evenement.setType(resultat.getString(6));
                evenement.setNombreJoueur(resultat.getInt(7)  );
                evenement.setImage( resultat.getString(8)  );

                listeEvents.add(evenement);
            }
            return listeEvents;
        } catch (SQLException ex) {
            System.out.println("erreur lors du charniggent " + ex.getMessage());
            return null;
        }
    }


    @Override
    public Evenement findEvenementById(int id_event) {
         Evenement evenement = new Evenement();
        String requete = "SELECT * FROM `evenement` WHERE `id_Evenement`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_event);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                evenement.setId_event(resultat.getInt(1));
                evenement.setLibelle(resultat.getString(2));
                evenement.setDate_debut(resultat.getDate(3));
                evenement.setDate_fin(resultat.getDate(4));
                evenement.setSite(resultat.getString(5));
                evenement.setType(resultat.getString(6));
                evenement.setNombreJoueur(resultat.getInt(7)  );
                evenement.setImage( resultat.getString(8)  );
            }
            return evenement;

        } catch (SQLException ex) {
            System.out.println("errexxxde l'evenement " + ex.getMessage());
            return null;
        }
    }
    public Evenement findEvenementLast() {
         Evenement evenement = new Evenement();
        String requete = "SELECT * FROM `evenement` ORDER BY id_Evenement DESC LIMIT 1; ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                evenement.setId_event(resultat.getInt(1));
                evenement.setLibelle(resultat.getString(2));
                evenement.setDate_debut(resultat.getDate(3));
                evenement.setDate_fin(resultat.getDate(4));
                evenement.setSite(resultat.getString(5));
                evenement.setType(resultat.getString(6));
                evenement.setNombreJoueur(resultat.getInt(7)  );
                evenement.setImage( resultat.getString(8)  );
            }
            return evenement;

        } catch (SQLException ex) {
            System.out.println("Erreur Get Last Evenement " + ex.getMessage());
            return null;
        }
    }
    @Override
    public Evenement findEvenementByLibelle(String libelle) {
         Evenement evenement = new Evenement();
        String requete = "select * from `evenement` where Upper(`libelle`) like Upper(%?%)";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, libelle);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                evenement.setId_event(resultat.getInt(1));
                evenement.setLibelle(resultat.getString(2));
                evenement.setDate_debut(resultat.getDate(3));
                evenement.setDate_fin(resultat.getDate(4));
                evenement.setSite(resultat.getString(5));
                evenement.setType(resultat.getString(6));
                evenement.setNombreJoueur(resultat.getInt(7)  );
                evenement.setImage( resultat.getString(8)  );
            }
            return evenement;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de levenement " + ex.getMessage());
            return null;
        }
    }
    
}
