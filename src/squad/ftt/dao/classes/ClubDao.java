/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.classes;

import squad.ftt.dao.interfaces.IDAO;
import squad.ftt.entities.Club;
import squad.ftt.techniques.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gadour
 */
public class ClubDao implements IDAO<Club> {
    
    private final Connection connection;
    public ClubDao(){
        connection = DataSource.getInstance().getConnection();
    }

    @Override
    public void Ajouter(Club c) {
        try {
            String req = "INSERT INTO `club`(`libelle_club`, `emplacement_club`, `nbre_terrains`, `description_club`, `img_club`, `img_club_blob`) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            
            ps.setString(1, c.getLibelle_club());
            ps.setString(2, c.getEmplacement_club());
            ps.setInt(3, c.getNbre_terrains());
            ps.setString(4, c.getDescritption_club());
            ps.setString(5, c.getPic());
            
            File monImage= new File(c.getImg_club());
            FileInputStream fis = new FileInputStream(monImage);
            ps.setBlob(6, fis, (int) monImage.length());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout du club"+ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Modifier(Club cl) {
        String req="UPDATE `club` SET `libelle_club`=?,`emplacement_club`=?,`nbre_terrains`=?,`description_club`=?,`img_club`=?,`img_club_blob`=? WHERE `id_Club`=?";
        try {
            PreparedStatement ps= connection.prepareStatement(req);
            
            ps.setString(1, cl.getLibelle_club());
            ps.setString(2, cl.getEmplacement_club());
            ps.setInt(3, cl.getNbre_terrains());
            ps.setString(4, cl.getDescritption_club());
            ps.setString(5, cl.getPic());
            System.out.println(cl.getImg_club());
            if (cl.getImg_club()== null){
                
                ps.setBlob(6, FindImg(cl.getId_Club()));

            }else{
                File monImage= new File(cl.getImg_club());
                FileInputStream fis = new FileInputStream(monImage);
                ps.setBlob(6, fis, (int) monImage.length());               
                }
            
            ps.setInt(7, cl.getId_Club());
            
            
            ps.executeUpdate();
        } catch (SQLException ex){
            System.out.println("Mise à jour du club impossible"+ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Supprimer(Club c) {
        String req= "DELETE FROM `club` WHERE id_Club=?";
        try {
            PreparedStatement ps=connection.prepareStatement(req);
            
            ps.setInt(1, c.getId_Club());
            ps.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Supression du club impossible"+ex.getMessage());
        }
    }

    @Override
    public List<Club> Afficher() {
        List<Club> clubs = new ArrayList<>();
        String req="select * from club";
        
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Club c = new Club();
                c.setId_Club(rs.getInt("id_Club"));
                c.setLibelle_club(rs.getString("libelle_club"));
                c.setEmplacement_club(rs.getString("emplacement_club"));
                c.setNbre_terrains(rs.getInt("nbre_terrains"));
                c.setDescritption_club(rs.getString("description_club"));
                
                clubs.add(c);
            }
        } catch (SQLException ex){
            System.out.println("affichage du club impossible"+ex.getMessage());
        }
        
        return clubs;
    }

    @Override
    public Club RechercherParId(int id) {
        Club c = new Club();
        String req= "select * from club where id_Club=?";
        try {
            PreparedStatement ps=connection.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                c.setId_Club(rs.getInt("id_Club"));
                c.setLibelle_club(rs.getString("libelle_club"));
                c.setEmplacement_club(rs.getString("emplacement_club"));
                c.setNbre_terrains(rs.getInt("nbre_terrains"));
                c.setDescritption_club(rs.getString("description_club"));
                c.setPic(rs.getString("img_club"));
                c.setImg_club_blob(rs.getBlob("img_club_blob"));
            }
            return c;
        }catch (SQLException ex){
            System.out.println("erreur lors de la recherche d'un club" + ex.getMessage());
            return null;
        }
        
    }
    public int FindId (String lib){
        Club cl = new Club();
        String req = "SELECT `id_Club` FROM `club` WHERE `libelle_club`=?";
        try{
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, lib);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            cl.setId_Club(rs.getInt("id_Club"));
            }
            return cl.getId_Club();
            
            
        }catch(SQLException ex){
            System.out.println("id club introuvable"+ex.getMessage());
            return 0;
        }
        
    }
    public Blob FindImg (int id) {
        Club cl = new Club();
        String req = "SELECT `img_club_blob` FROM `club` WHERE `id_Club`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cl.setImg_club_blob(rs.getBlob("img_club_blob"));
            }
            return cl.getImg_club_blob();
            
            
        }catch(SQLException ex){
            System.out.println("image introuvable"+ex.getMessage());
            return null;
        }
    }

    
}
