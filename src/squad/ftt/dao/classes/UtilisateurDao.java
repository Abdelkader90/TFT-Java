package squad.ftt.dao.classes;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
import squad.ftt.entities.Utilisateur;


/**
 *
 * @author pc hp
 */
public class UtilisateurDao {

    Statement ste;
    PreparedStatement pst;
    ResultSet rs;
    Connection connex;

    public UtilisateurDao() {
        connex = DataSource.getInstance().getConnection();

    }
    Statement st = null;

    public void Inscription(Utilisateur u) {
         String verif = "";
         
        try {
            URL url = new URL("http://localhost/SquadWeb/web/insertInscription.php?username="+u.getUsername()+"&email="+u.getEmail()+"&enabled=1&salt=aa&password="+u.getPassword()+""
                 + "&cin_user="+u.getCin_user()+"&nom="+u.getNom()+"&prenom="+u.getPrenom()+"&date_de_naissance="+u.getDate_de_naissance()+"&nationaliter="+u.getNationaliter()+"&tel="+u.getTel()+"&role="+u.getRole()); 
            URLConnection con = url.openConnection();
            InputStream input = con.getInputStream();
            while (input.available() > 0) {
                verif = verif + (char) input.read();
            }
        } catch (MalformedURLException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("");
        }
        System.out.println(verif);
    }

    public Utilisateur findUtilisateurByLogin(String username) {
        String requete = "SELECT * FROM `utilisateur` WHERE username=?";
        Utilisateur u = new Utilisateur();
        try {
            PreparedStatement ps = connex.prepareStatement(requete);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                u.setUsername(rs.getString("username"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setCin_user(rs.getDouble("cin_user"));
                u.setNom(rs.getString("nom"));
                u.setPrenom(rs.getString("prenom"));
                u.setDate_de_naissance(rs.getDate("date_de_naissance"));
                u.setNationaliter(rs.getString("nationaliter"));
                u.setTel(rs.getDouble("tel"));
                u.setRole(rs.getString("role"));
                u.setGrade_arbitre(rs.getString("grade_arbitre"));
                u.setType_arbitre(rs.getString("type_arbitre"));

            }
            return u;
        } catch (SQLException ex) {
            System.err.println("Erreur Recherche1");
            return null;
        }

    }

    public boolean checkusername(String username) {
        String requete = "SELECT * FROM `utilisateur` WHERE username=?";
        Utilisateur u = new Utilisateur();
        try {
            PreparedStatement ps = connex.prepareStatement(requete);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            System.out.println(ps);

            rs.last();
            int nbrRow = rs.getRow();
            if (nbrRow == 0) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Erreur Recherche2");
            return false;
        }

    }

    public void ajouterUtilisateur(Utilisateur u) {

            String verif = "";
         
        try {
            URL url = new URL("http://localhost/SquadWeb/web/insertInscription.php?username="+u.getUsername()+"&email="+u.getEmail()+"&enabled=1&salt=aa&password="+u.getPassword()+""
                 + "&cin_user="+u.getCin_user()+"&nom="+u.getNom()+"&prenom="+u.getPrenom()+"&date_de_naissance="+u.getDate_de_naissance()+"&nationaliter="+u.getNationaliter()+"&tel="+u.getTel()+"&role="+u.getRole()); 
            URLConnection con = url.openConnection();
            InputStream input = con.getInputStream();
            while (input.available() > 0) {
                verif = verif + (char) input.read();
            }
        } catch (MalformedURLException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("");
        }
        System.out.println(verif);

    }

    public void modifierUtilisateur(Utilisateur u) {

        String requete = "UPDATE `utilisateur`  set  `username`=?, `email`=?,`password`=?,`cin_user`=?,`nom`=?, `prenom`=?, `date_de_naissance`=?, `nationaliter`=?, `tel`=?,  `grade_arbitre`=?,`role`=? ,`type_arbitre`=? where `cin_user`=?  ";

        try {
            PreparedStatement ps = connex.prepareStatement(requete);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setDouble(4, u.getCin_user());
            ps.setString(5, u.getNom());
            ps.setString(6, u.getPrenom());
            ps.setDate(7, (Date) u.getDate_de_naissance());
            ps.setString(8, u.getNationaliter());
            ps.setDouble(9, u.getTel());
            ps.setString(10, u.getGrade_arbitre());
            ps.setString(11, u.getRole());
            ps.setString(12, u.getType_arbitre());
            ps.setDouble(13, u.getCin_user());

            ps.executeUpdate();
            
            System.out.println("Mise à jour effectuée avec succès");
            
        } catch (SQLException ex) {
            
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

    }

    public List<Utilisateur> findAll(String role) {
        List<Utilisateur> listeUser = new ArrayList<>();
        String requete = "select * from `Utilisateur` WHERE `role` LIKE '%" + role + "%' ";
        try {

            Statement statement = connex.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Utilisateur u = new Utilisateur();
                u.setId(resultat.getInt(1));
                u.setUsername(resultat.getString(2));
                u.setUsername_canonical(resultat.getString(3));
                u.setEmail(resultat.getString(4));
                u.setEmail_canonical(resultat.getString(5));
                u.setSalt(resultat.getString(6));
                u.setPassword(resultat.getString(7));
                u.setConfirmation_token(resultat.getString(8));
                u.setCin_user(resultat.getDouble(9));
                u.setNom(resultat.getString(10));
                u.setPrenom(resultat.getString(11));
                u.setDate_de_naissance(resultat.getDate(12));
                u.setNationaliter(resultat.getString(13));
                u.setTel(resultat.getDouble(14));
                u.setGrade_arbitre(resultat.getString(15));
                u.setRole(resultat.getString(16));
                u.setType_arbitre(resultat.getString(17));
                listeUser.add(u);
            }
            return listeUser;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement de la liste des utilisateurs " + ex.getMessage());
            return null;
        }
    }

    // Récupérer tous les utilisateur  
    public List<Utilisateur> findAll() {
        List<Utilisateur> listeUser = new ArrayList<>();
        String requete = "select * from `Utilisateur` ";
        try {

            Statement statement = connex.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Utilisateur u = new Utilisateur();
                u.setId(resultat.getInt("id"));
                u.setUsername(resultat.getString("username"));
                u.setUsername_canonical(resultat.getString("username_canonical"));
                u.setEmail(resultat.getString("email"));
                u.setEmail_canonical(resultat.getString("email_canonical"));
                u.setSalt(resultat.getString("salt"));
                u.setPassword(resultat.getString("password"));
                u.setConfirmation_token(resultat.getString("confirmation_token"));
                u.setCin_user(resultat.getDouble("cin_user"));
                u.setNom(resultat.getString("nom"));
                u.setPrenom(resultat.getString("prenom"));
                u.setDate_de_naissance(resultat.getDate("date_de_naissance"));
                u.setNationaliter(resultat.getString("nationaliter"));
                u.setTel(resultat.getDouble("tel"));
                u.setGrade_arbitre(resultat.getString("grade_arbitre"));
                u.setRole(resultat.getString("role"));
                u.setType_arbitre(resultat.getString("type_arbitre"));
                listeUser.add(u);
            }
            return listeUser;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement de la liste des utilisateurs " + ex.getMessage());
            return null;
        }
    }

    // retourne un Utilisateur par ID 
    public Utilisateur findUserById(int idUser) {
        Utilisateur u = new Utilisateur();
        String requete = "select * from `Utilisateur` where `id`=?";
        try {
            PreparedStatement ps = connex.prepareStatement(requete);
            ps.setDouble(1, idUser);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {

                u.setId(resultat.getInt("id"));
                u.setUsername(resultat.getString("username"));
                u.setUsername_canonical(resultat.getString("username_canonical"));
                u.setEmail(resultat.getString("email"));
                u.setEmail_canonical(resultat.getString("email_canonical"));
                u.setSalt(resultat.getString("salt"));
                u.setPassword(resultat.getString("password"));
                u.setConfirmation_token(resultat.getString("confirmation_token"));
                u.setCin_user(resultat.getDouble("cin_user"));
                u.setNom(resultat.getString("nom"));
                u.setPrenom(resultat.getString("prenom"));
                u.setDate_de_naissance(resultat.getDate("date_de_naissance"));
                u.setNationaliter(resultat.getString("nationaliter"));
                u.setTel(resultat.getDouble("tel"));
                u.setGrade_arbitre(resultat.getString("grade_arbitre"));
                u.setRole(resultat.getString("role"));
                u.setType_arbitre(resultat.getString("type_arbitre"));
            }
            return u;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la récupértion des User " + ex.getMessage());
            return null;
        }
    }

    public void removeUtilisateurByCin(Double cin_user) {
        String requete = "delete from `Utilisateur` where `cin_user`=?";
        try {
            PreparedStatement ps = connex.prepareStatement(requete);
            ps.setDouble(1, cin_user);
            ps.executeUpdate();
            System.out.println("Utilisateur supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
 
     public Utilisateur findAuthen(String username, String password) throws SQLException, IOException {

        String verif = "";
        try {
            URL url = new URL("http://localhost/SquadWeb/web/test.php?login=" + username + "&motDePasse=" + password); 
            URLConnection con = url.openConnection();
            InputStream input = con.getInputStream();
            while (input.available() > 0) {
                verif = verif + (char) input.read();
            }
        } catch (MalformedURLException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("");
        }

        if (verif.equals("valide")) {
            String requete = "select * from Utilisateur where username=?";
            PreparedStatement ps = connex.prepareStatement(requete);
            ps.setString(1, username);
            String r = "";
            ResultSet resultat = ps.executeQuery();
            Utilisateur user = new Utilisateur();
            while (resultat.next()) {
                String a = resultat.getString("roles");
                System.out.println(a);
                if (a.contains("ADMIN")) {
                    r = "admin";
                } else if (a.contains("FAN")) {
                    r = "fan";
                } else if (a.contains("RESPONSABLE")) {
                    r = "responsable";
                }else 
                { r="medecin"; } 
                user.setId(resultat.getInt("id"));
                user.setUsername(resultat.getString("username"));
                user.setRole(r);

            }
            return user;
        } else {
            return null;
        }

        /*try {
         PreparedStatement ps = connection.prepareStatement(requete);
         ps.setString(1, username);
         ps.setString(2, password);
         ResultSet resultat = ps.executeQuery();
         Fos_user  user = new Fos_user();
         while (resultat.next()) {
         //resultat.getString("description")
         String r =" ";
         user.setId(resultat.getInt("id"));
         user.setUsername(resultat.getString("libelle"));
         user.setRoles(r);
                
         }
         return user;
         } catch (SQLException ex) {
         System.out.println("erreur lors du chargement" + ex.getMessage());
         return null;
         }
        
         return null;
         7 : 
         */
    }
    

    public static void main(String[] args) {
        UtilisateurDao ud = new UtilisateurDao();

        Utilisateur u = ud.findUserById(41);
        System.out.println(u.getNom());

        ud.ajouterUtilisateur(u);

        u.setRole("Arbitre");
        ud.modifierUtilisateur(u);
        ud.removeUtilisateurByCin(u.getCin_user());

    }
}
