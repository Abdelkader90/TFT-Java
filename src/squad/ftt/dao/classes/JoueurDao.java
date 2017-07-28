package squad.ftt.dao.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import squad.ftt.dao.interfaces.Ijoueur;
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Matchtennis;
import squad.ftt.techniques.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Gadour
 */
public class JoueurDao implements Ijoueur {

    private Connection connection;

    public JoueurDao() {
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void ajouterJoueur(Joueur j) {
        try {
            String req = "INSERT INTO `joueur`(`cin_Joueur`, `nom`, `prenom`, `date_de_naissance`, `categorie`, `point_aquis`, `Taille`, `poids`, `main_forte`, `Club_id_Club`, `nationaliter_joueur`,`img_joueur`,`img_joueur_path`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1, j.getCin_joueur());
            ps.setString(2, j.getNom());
            ps.setString(3, j.getPrenom());
            ps.setDate(4, j.getDate_naissance());
            ps.setString(5, j.getCategorie());
            ps.setInt(6, j.getPoint_aquis());
            ps.setInt(7, j.getTaille());
            ps.setInt(8, j.getPoids());
            ps.setString(9, j.getMain_forte());
            ps.setInt(10, j.getClub().getId_Club());
            ps.setString(11, j.getNationalite());
            
            File monImage= new File(j.getPicture());
            FileInputStream fis = new FileInputStream(monImage);
            ps.setBlob(12, fis, (int) monImage.length());
            
            ps.setString(13, j.getPic());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout du joueur" + ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifierJoueur(Joueur j) {
        String req = "UPDATE `joueur` SET `cin_Joueur`=?,`nom`=?,`prenom`=?,`date_de_naissance`=?,`categorie`=?,`point_aquis`=?,`Taille`=?,`poids`=?,`main_forte`=?,`Club_id_Club`=?,`nationaliter_joueur`=?,`img_joueur`=?,`img_joueur_path`=? WHERE cin_Joueur=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1, j.getCin_joueur());
            ps.setString(2, j.getNom());
            ps.setString(3, j.getPrenom());
            ps.setDate(4, j.getDate_naissance());
            ps.setString(5, j.getCategorie());
            ps.setInt(6, j.getPoint_aquis());
            ps.setInt(7, j.getTaille());
            ps.setInt(8, j.getPoids());
            ps.setString(9, j.getMain_forte());
            ps.setInt(10, j.getClub().getId_Club());
            ps.setString(11, j.getNationalite());
            if (j.getPicture()== null){
                
                ps.setBlob(12, FindImg(j.getCin_joueur()));

            }else{
                File monImage= new File(j.getPicture());
                FileInputStream fis = new FileInputStream(monImage);
                ps.setBlob(12, fis, (int) monImage.length());               
            }            
            ps.setString(13, j.getPic());
            ps.setDouble(14, j.getCin_joueur());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour du joueur" + ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void supprimerJoueur(Joueur j) {
        String req = "DELETE FROM `joueur` WHERE `cin_Joueur`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1, j.getCin_joueur());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("erreur lors de la supression du joueur" + ex.getMessage());
        }

    }

    @Override
    public List<Joueur> findAll() {
        List<Joueur> joueurs = new ArrayList<>();
        String req = "select * from `joueur`";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Joueur joueur = new Joueur();

                joueur.setCin_joueur(rs.getDouble("cin_joueur"));
                joueur.setNom(rs.getString("nom"));
                joueur.setPrenom(rs.getString("prenom"));
                joueur.setDate_naissance(rs.getDate("date_de_naissance"));
                joueur.setCategorie(rs.getString("categorie"));
                joueur.setPoint_aquis(rs.getInt("point_aquis"));
                joueur.setTaille(rs.getInt("Taille"));
                joueur.setPoids(rs.getInt("poids"));
                joueur.setMain_forte(rs.getString("main_forte"));
//                joueur.setId_club(rs.getInt("Club_id_Club"));
                joueur.setNationalite(rs.getString("nationaliter_joueur"));
                ///joueur.setPicture(rs.getString("image_joueur"));

                joueurs.add(joueur);
            }

        } catch (SQLException ex) {
            System.out.println("Affichage du joueur impossible" + ex.getMessage());
        }
        return joueurs;
    }
    public List<Joueur> Afficher() {
        List<Joueur> joueurs = new ArrayList<>();
        String req ="select * from joueur";
        try {
            PreparedStatement ps=connection.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Joueur joueur= new Joueur();
                ClubDao cd=new ClubDao();
                
                joueur.setCin_joueur(rs.getDouble("cin_joueur"));
                joueur.setNom(rs.getString("nom"));
                joueur.setPrenom(rs.getString("prenom"));
                joueur.setDate_naissance(rs.getDate("date_de_naissance"));
                joueur.setCategorie(rs.getString("categorie"));
                joueur.setPoint_aquis(rs.getInt("point_aquis"));
                joueur.setTaille(rs.getInt("Taille"));
                joueur.setPoids(rs.getInt("poids"));
                joueur.setMain_forte(rs.getString("main_forte"));
                joueur.setClub(cd.RechercherParId(rs.getInt("Club_id_Club")));
                joueur.setNationalite(rs.getString("nationaliter_joueur"));
                
                
                joueurs.add(joueur);
            }
            
        } catch (SQLException ex) {
            System.out.println("Affichage du joueur impossible"+ex.getMessage());
        }
        return joueurs;
    }
    @Override
    public Joueur findJoueurByCin(double cin) {

        Joueur joueur = new Joueur();
        ClubDao cd = new ClubDao();
        try {
            String req = "select * from `joueur` where `cin_Joueur`=?";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1, cin);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                joueur.setCin_joueur(rs.getDouble("cin_Joueur"));
                joueur.setNom(rs.getString("nom"));
                joueur.setPrenom(rs.getString("prenom"));
                joueur.setDate_naissance(rs.getDate("date_de_naissance"));
                joueur.setCategorie(rs.getString("categorie"));
                joueur.setPoint_aquis(rs.getInt("point_aquis"));
                joueur.setTaille(rs.getInt("Taille"));
                joueur.setPoids(rs.getInt("poids"));
                joueur.setMain_forte(rs.getString("main_forte"));
                joueur.setClub(cd.RechercherParId(rs.getInt("Club_id_Club")));
                joueur.setNationalite(rs.getString("nationaliter_joueur"));
                joueur.setPic(rs.getString("img_joueur_path"));
                joueur.setImg_joueur(rs.getBlob("img_joueur"));

            }
            return joueur;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du joueur" + ex.getMessage());
            return null;
        }
    }

    public float pourcentageParDate(Joueur j, Date d) {
      /*  Match_JoueurDao mjd = new Match_JoueurDao();
       MatchDao md = new MatchDao();
        Set_matchDao sd = new Set_matchDao();
        float pourcentage = -1;
        float nbJouer = 0, nbGagner = 0;

        List<Match> listeMatch = mjd.findByJoueur(j);

        for (Match m : listeMatch) {

            if (m.getDate_match().before(d)) {
                nbJouer++;
                Joueur gagnant = md.whoWon(m);
                if (gagnant.getCin_joueur() == j.getCin_joueur()) {
                    nbGagner++;
                }
                System.out.println("Winner" + gagnant.getNom() + '/' + j.getNom());
            }
            System.out.println("Match Jouer par" + j.getNom() + nbJouer + "Gagner=" + nbGagner);
            pourcentage = (nbGagner / nbJouer);

        }
        return pourcentage;
    */
        return 0;
              }
    
    public float pourcentageParAdversaire(Joueur j,Joueur adversaire) {
    /*    Match_JoueurDao mjd = new Match_JoueurDao();
        MatchDao md = new MatchDao();
        Set_matchDao sd = new Set_matchDao();
        float pourcentage = -1;
        float nbJouer = 0, nbGagner = 0;

        List<Match> listeMatch = mjd.findByJoueur(j);

        for (Match m : listeMatch) {
            System.out.println(m.getListJoueur().get(0).getNom()+"VS"+m.getListJoueur().get(1).getNom());
            if (m.getListJoueur().get(0).getCin_joueur()==adversaire.getCin_joueur()
                    || m.getListJoueur().get(1).getCin_joueur()==adversaire.getCin_joueur()
                    ) {
                nbJouer++;
                Joueur gagnant = md.whoWon(m);
                if (gagnant.getCin_joueur() == j.getCin_joueur()) {
                    nbGagner++;
                }
                
            }
            System.out.println("Match Contre" + adversaire.getNom() + nbJouer + "Gagner=" + nbGagner);
            pourcentage = (nbGagner / nbJouer);

        }
        return pourcentage;
   
 */  return 0;           
            }
    public Blob FindImg (double cin) {
        Joueur j = new Joueur();
        String req = "SELECT `img_joueur` FROM `joueur` WHERE `cin_joueur`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1, cin);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                j.setImg_joueur( rs.getBlob("img_joueur"));
            }
            return j.getImg_joueur();
            
            
        }catch(SQLException ex){
            System.out.println("image introuvable"+ex.getMessage());
            return null;
        }
    }
    
    public void PdfJoueur() throws FileNotFoundException{
    try {
           
            // - Chargement et compilation du rapport
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\admin\\Desktop\\testJasper\\firstJasperPDF.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("Titre", "Titre");
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\admin\\Desktop\\testJasper\\myreport.pdf");
            System.out.println("success");
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
         } 
}

}
