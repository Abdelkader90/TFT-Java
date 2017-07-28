/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.dao.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import squad.ftt.dao.interfaces.ISetTennis;
import squad.ftt.entities.Matchtennis;
import squad.ftt.entities.SetTennis;
import squad.ftt.techniques.DataSource;

/**
 *
 * @author hppro
 */
public class SetTennisDao implements ISetTennis{
    private final Connection connection;
     public SetTennisDao(){
         connection = DataSource.getInstance().getConnection();
     }

    @Override
    public void addSetTennis(SetTennis setTennis) {
     try {
            String req = "insert into `sets` (`score_j1`,`score_j2`,`Match_id_Match`) values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, setTennis.getScore1());
            ps.setInt(2, setTennis.getScore2());
            ps.setInt(3, setTennis.getMatch().getId_match());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StadeDao.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @Override
    public void updateSetTennis(SetTennis setTennis) {
        String requete = "update `sets` set `score_j1`=?, `score_j2`=?  where `id_set`=?";

        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, setTennis.getScore1());
            ps.setInt(2, setTennis.getScore2());
           
            ps.setInt(3, setTennis.getId());          
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    @Override
    public void removeSets(int id) {
        String requete = "delete from `sets` where `id_set`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("sets supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }

        
    }

    @Override
    public SetTennis findSetTennisById(int id) {
        MatchtennisDao matchDao = new MatchtennisDao();
        SetTennis setTennis = new SetTennis();
        String requete = "SELECT * FROM `sets` WHERE `id_set`=?";

        try {
            PreparedStatement ps = connection.prepareStatement(requete);

            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                setTennis.setId(resultat.getInt(1));
                setTennis.setScore1(resultat.getInt(2));
                setTennis.setScore2(resultat.getInt(3));
                setTennis.setMatch(matchDao.findMatchById(resultat.getInt(4)));
            }
            return setTennis;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du match " + ex.getMessage());
            return null;
        }
    
        }
    

    @Override
    public List<SetTennis> findSetTennisByMatch(Matchtennis matchTennis) {     
       List<SetTennis> listeSets = new ArrayList<>();
       SetTennisDao setTennisDao= new SetTennisDao();
       MatchtennisDao matchTennisDao =new MatchtennisDao();
        String requete = "select * from `sets` where `Match_id_Match`=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, matchTennis.getId_match());
            ResultSet resultat = ps.executeQuery();
           
            while (resultat.next()) {
                SetTennis setTennis=new SetTennis();
                setTennis.setId(resultat.getInt(1));
                setTennis.setScore1(resultat.getInt(2));
                setTennis.setScore2(resultat.getInt(3));
                setTennis.setMatch(matchTennisDao.findMatchById(resultat.getInt(4)));
                listeSets.add(setTennis);
            }
            return listeSets;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des evenement " + ex.getMessage());
            return null;
        }
        }
        
    
}
