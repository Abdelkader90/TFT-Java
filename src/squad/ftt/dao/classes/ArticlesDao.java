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
import squad.ftt.entities.Articles;

/**
 *
 * @author Rached
 */
public class ArticlesDao {
    private final Connection connection;
     public ArticlesDao(){
         connection = DataSource.getInstance().getConnection();
     }

    public void addArticles(Articles a) {
        try {
            System.out.println("Enregistrement");
            String req = "INSERT INTO Articles (libelle_article,prix,description,img_article) VALUES (?, ?, ?, ?) ";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1,a.getLibelle_article());
            ps.setFloat(2,a.getPrix());
            ps.setString(3,a.getDescription());
            ps.setString(4,a.getImg_article());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Evenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void updateArticle(Articles a) {
        String requete = "UPDATE Articles SET libelle_article = ?, prix = ?, description = ?,etat_article = ?  WHERE (id_article = ? )";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1,a.getLibelle_article());
            ps.setFloat(2,a.getPrix());
            ps.setString(3,a.getDescription());
            ps.setString(4,a.getEtat_article());
            ps.setInt(5,a.getId_articles());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    
    }
        
    public void removeArticlesById(int id_act) {
        String requete = "delete from `Articles` where `id_article`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_act);
            ps.executeUpdate();
            System.out.println("Actualites supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }    
    }
        
    public List<Articles> findAll() {
      List<Articles> listeEvents = new ArrayList<>();
        String requete = "select * from `Articles`";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet result = statement.executeQuery(requete);

            while (result.next()) {
                Articles valueObject = new Articles();
                   valueObject.setId_articles(result.getInt(1)); 
                   valueObject.setLibelle_article(result.getString(2)); 
                   valueObject.setPrix(result.getFloat(3)); 
                   valueObject.setDescription(result.getString(4));     
                   valueObject.setImg_article(result.getString(6)); 
                   valueObject.setEtat_article(result.getString(7)); 
                listeEvents.add(valueObject);
            }
            return listeEvents;
        } catch (SQLException ex) {
            System.out.println("erreur lors du charniggent " + ex.getMessage());
            return null;
        }
    }
    public List<Articles> findAllDisponnible() {
      List<Articles> listeEvents = new ArrayList<>();
        String requete = "select * from `Articles` where `etat_article` ='disponnible'";
        try {
             
            Statement statement = connection
                    .createStatement();
            ResultSet result = statement.executeQuery(requete);

            while (result.next()) {
                Articles valueObject = new Articles();
                   valueObject.setId_articles(result.getInt(1)); 
                   valueObject.setLibelle_article(result.getString(2)); 
                   valueObject.setPrix(result.getFloat(3)); 
                   valueObject.setDescription(result.getString(4));     
                   valueObject.setImg_article(result.getString(6)); 
                   valueObject.setEtat_article(result.getString(7)); 
                listeEvents.add(valueObject);
            }
            return listeEvents;
        } catch (SQLException ex) {
            System.out.println("erreur lors du charniggent " + ex.getMessage());
            return null;
        }
    }

    public Articles findArticleById(int id_art) {
UtilisateurDao a = new UtilisateurDao();
        Articles valueObject = new Articles();
        String requete = "SELECT * FROM `articles` WHERE `id_article`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id_art);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                   valueObject.setId_articles(result.getInt("id_article")); 
                   valueObject.setLibelle_article(result.getString("libelle_article")); 
                   valueObject.setPrix(result.getFloat("prix")); 
                   valueObject.setDescription(result.getString("description")); 
                   valueObject.setEtat_article(result.getString("etat_article")); 
                   valueObject.setImg_article(result.getString("img_article")); 
                   valueObject.setUser_id_user(a.findUserById(result.getInt("User_id_user"))); 
            }
            return valueObject;

        } catch (SQLException ex) {
            System.out.println("erreur FindArticleById " + ex.getMessage());
            return null;
        }
    }
    
}
