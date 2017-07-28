package squad.ftt.dao.classes;

import squad.ftt.dao.interfaces.IstadeDao;
import squad.ftt.entities.Stade;
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
public class StadeDao  implements IstadeDao{
     private final Connection connection;
     public StadeDao(){
         connection = DataSource.getInstance().getConnection();
     }

    @Override
    public void addStade(Stade stade) {
        try {
            String req = "insert into `stade` (`libelle_stade`,`emplacement`,`type_terrains`,`capacite`) values (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, stade.getLibelle());
            ps.setString(2, stade.getLieu());
            ps.setString(3, stade.getTerrain());
            ps.setInt(4, stade.getCapacite());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateStade(Stade stade) {
        String requete = "update `stade` set `libelle_stade`=?, `emplacement`=?, `type_terrains`=?, `capacite`=? where `id_Stade`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, stade.getLibelle());
            ps.setString(2, stade.getLieu());
            ps.setString(3, stade.getTerrain());
            ps.setInt(4, stade.getCapacite());
            ps.setInt(5, stade.getId_stade());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    
    }
        
    

    @Override
    public void removeStadeByLibelle(String libelle) {
        
    }

    @Override
    public void removeSatdeById(int id_stade) {
        String requete = "delete from `stade` where `id_Stade`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_stade);
            ps.executeUpdate();
            System.out.println("Stade supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    
    }
        
    @Override
    public List<Stade> findAll() {
      List<Stade> listeStades = new ArrayList<>();
        String requete = "select * from `Stade`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Stade stade = new Stade();
                stade.setId_stade(resultat.getInt(1));
                stade.setLibelle(resultat.getString(2));
                stade.setLieu(resultat.getString(3));
                stade.setTerrain(resultat.getString(4));
                stade.setCapacite(resultat.getInt(5));


                listeStades.add(stade);
            }
            return listeStades;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stades " + ex.getMessage());
            return null;
        }
    }


    @Override
    public Stade findStadeById(int id_stade) {
         Stade stade = new Stade();
        String requete = "select * from `stade` where `id_Stade`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_stade);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                stade.setId_stade(resultat.getInt(1));
                stade.setLibelle(resultat.getString(2));
                stade.setLieu(resultat.getString(3));
                stade.setTerrain(resultat.getString(4));
                stade.setCapacite(resultat.getInt(5));
            }
            return stade;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du stade " + ex.getMessage());
            return null;
        }
    }
    @Override
    public Stade findStadeByLibelle(String libelle) {
         Stade stade = new Stade();
        String requete = "select * from `stade` where `libelle_stade`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, libelle);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                stade.setId_stade(resultat.getInt(1));
                stade.setLibelle(resultat.getString(2));
                stade.setLieu(resultat.getString(3));
                stade.setTerrain(resultat.getString(4));
                stade.setCapacite(resultat.getInt(5));
            }
            return stade;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du stade " + ex.getMessage());
            return null;
        }
    }
     @Override
     public Stade findLastStade(){
        Stade stade = new Stade();
         
       String requete = "select * from `stade` where `id_Stade` = (SELECT MAX(`id_Stade`) from `stade`)"; 
       try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
     while (resultat.next()) {   
                stade.setId_stade(resultat.getInt(1));
                stade.setLibelle(resultat.getString(2));
                stade.setLieu(resultat.getString(3));
                stade.setTerrain(resultat.getString(4));
                stade.setCapacite(resultat.getInt(5));
}
    return stade;

    } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du stade " + ex.getMessage());
        return null; }
    }

   
   
    }
        
    
    

   