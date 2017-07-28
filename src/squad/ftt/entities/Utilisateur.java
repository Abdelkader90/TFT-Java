/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Date;

public class Utilisateur{
        private int id;
	private String username;
	private String username_canonical;
	private String email;
	private String email_canonical;
	private String salt;
	private String password;
	private String confirmation_token;
	private double cin_user;
	private String nom;
	private String prenom;
	private Date date_de_naissance;
	private String nationaliter;
	private double tel;
	private String grade_arbitre;
	private String role;
	private String type_arbitre;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
        private boolean selected;
    public void setId(int id) {
        this.id = id;
    }

        public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username=username;
	}

	public String getUsername_canonical(){
		return username_canonical;
	}

	public void setUsername_canonical(String username_canonical){
		this.username_canonical=username_canonical;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail_canonical(){
		return email_canonical;
	}

	public void setEmail_canonical(String email_canonical){
		this.email_canonical=email_canonical;
	}

	public String getSalt(){
		return salt;
	}

	public void setSalt(String salt){
		this.salt=salt;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getConfirmation_token(){
		return confirmation_token;
	}

	public void setConfirmation_token(String confirmation_token){
		this.confirmation_token=confirmation_token;
	}

	public double getCin_user(){
		return cin_user;
	}

	public void setCin_user(double cin_user){
		this.cin_user=cin_user;
	}

	public String getNom(){
		return nom;
	}

	public void setNom(String nom){
		this.nom=nom;
	}

	public String getPrenom(){
		return prenom;
	}

	public void setPrenom(String prenom){
		this.prenom=prenom;
	}

	public java.util.Date getDate_de_naissance(){
		return date_de_naissance;
	}

	public void setDate_de_naissance(Date date_de_naissance){
		this.date_de_naissance=date_de_naissance;
	}

	public String getNationaliter(){
		return nationaliter;
	}

	public void setNationaliter(String nationaliter){
		this.nationaliter=nationaliter;
	}

	public double getTel(){
		return tel;
	}

	public void setTel(double tel){
		this.tel=tel;
	}

	public String getGrade_arbitre(){
		return grade_arbitre;
	}

	public void setGrade_arbitre(String grade_arbitre){
		this.grade_arbitre=grade_arbitre;
	}

	public String getRole(){
		return role;
	}

	public void setRole(String role){
        	this.role=role;
	}

	public String getType_arbitre(){
		return type_arbitre;
	}

	public void setType_arbitre(String type_arbitre){
		this.type_arbitre=type_arbitre;
	}

    public int getId() {
       return this.id;
    }
}