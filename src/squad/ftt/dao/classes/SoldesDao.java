package squad.ftt.dao.classes;

import squad.ftt.dao.interfaces.IevenementDao;
import squad.ftt.entities.Evenement;
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
import squad.ftt.entities.Actualites;
import squad.ftt.entities.Articles;
import squad.ftt.entities.Soldes;
import squad.ftt.entities.Utilisateur;

/**
 *
 * @author Rached
 */
public class SoldesDao {
    private final Connection connection;
     public SoldesDao(){
         connection = DataSource.getInstance().getConnection();
     }

    public void addSoldes(Soldes a) {
        try {
            System.out.println("Enregistrement Soldes");
            String req = "INSERT INTO Soldes (valeur,User_id_user,date_ajout,preuve,type_transaction) VALUES (?, ?, ?, ?,?) ";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setDouble(1,a.getValeur());
            ps.setInt(2,a.getUser_id_user());
            ps.setDate(3, (Date) a.getDate_ajout());
            ps.setString(4,a.getPreuve());
            ps.setString(5,a.getType_transaction());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Evenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public float getUserSoldes(Utilisateur a) {
       float s=0;
        try {
             
            String req = "select * from soldes where user_id_user="+a.getId();
            PreparedStatement ps = connection.prepareStatement(req);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
              if ( resultat.getString("type_transaction").equals("retrait") )
              { s=s-resultat.getFloat("valeur");
              }
              else
              {s=s+resultat.getFloat("valeur");
              }
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(Evenement.class.getName()).log(Level.SEVERE, null, ex);
        }
    return s;
    }

    
}
