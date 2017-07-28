package squad.ftt.entities;

import java.sql.Date;
/**
 *
 * @author esprit
 */
public class Soldes {
        private double Valeur;
	private int User_id_user;
	private Date date_ajout;
	private String preuve;
        private String type_transaction;

    public String getType_transaction() {
        return type_transaction;
    }

    public void setType_transaction(String type_transaction) {
        this.type_transaction = type_transaction;
    }

    public Soldes() {
      }
        
	public double getValeur(){
		return Valeur;
	}

	public void setValeur(double Valeur){
		this.Valeur=Valeur;
	}

	public int getUser_id_user(){
		return User_id_user;
	}

	public void setUser_id_user(int User_id_user){
		this.User_id_user=User_id_user;
	}

	public java.util.Date getDate_ajout(){
		return date_ajout;
	}

	public void setDate_ajout(Date date_ajout){
		this.date_ajout=date_ajout;
	}

	public String getPreuve(){
		return preuve;
	}

	public void setPreuve(String preuve){
		this.preuve=preuve;
	}
}
