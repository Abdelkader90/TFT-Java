/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author pc Sana
 */
public class Arbitre {
Double cin_Arbitre;
String nom_arbitre;
String prenom_arbitre;
Double tel_arbitre;
String grade;
Date date_de_naissance;
String mail_arbitre;
String 	login_arbitre;

    public Arbitre(Double cin_Arbitre, String nom_arbitre, String prenom_arbitre, Double tel_arbitre, String grade, Date date_de_naissance, String mail_arbitre, String login_arbitre, String password_arbitre) {
        this.cin_Arbitre = cin_Arbitre;
        this.nom_arbitre = nom_arbitre;
        this.prenom_arbitre = prenom_arbitre;
        this.tel_arbitre = tel_arbitre;
        this.grade = grade;
        this.date_de_naissance = date_de_naissance;
        this.mail_arbitre = mail_arbitre;
        this.login_arbitre = login_arbitre;
        this.password_arbitre = password_arbitre;
    }
String password_arbitre;


    public Arbitre() {
    }

   

    
    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getMail_arbitre() {
        return mail_arbitre;
    }

    public void setMail_arbitre(String mail_arbitre) {
        this.mail_arbitre = mail_arbitre;
    }

    public String getLogin_arbitre() {
        return login_arbitre;
    }

    public void setLogin_arbitre(String login_arbitre) {
        this.login_arbitre = login_arbitre;
    }

    public String getPassword_arbitre() {
        return password_arbitre;
    }

    public void setPassword_arbitre(String password_arbitre) {
        this.password_arbitre = password_arbitre;
    }

    public Double getCin_Arbitre() {
        return cin_Arbitre;
    }

    public void setCin_Arbitre(Double cin_Arbitre) {
        this.cin_Arbitre = cin_Arbitre;
    }

    public String getNom_arbitre() {
        return nom_arbitre;
    }

    public void setNom_arbitre(String nom_arbitre) {
        this.nom_arbitre = nom_arbitre;
    }

    public String getPrenom_arbitre() {
        return prenom_arbitre;
    }

    public void setPrenom_arbitre(String prenom_arbitre) {
        this.prenom_arbitre = prenom_arbitre;
    }

    public Double getTel_arbitre() {
        return tel_arbitre;
    }

    public void setTel_arbitre(Double tel_arbitre) {
        this.tel_arbitre = tel_arbitre;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Arbitre other = (Arbitre) obj;
        if (!Objects.equals(this.cin_Arbitre, other.cin_Arbitre)) {
            return false;
        }
        if (!Objects.equals(this.nom_arbitre, other.nom_arbitre)) {
            return false;
        }
        if (!Objects.equals(this.prenom_arbitre, other.prenom_arbitre)) {
            return false;
        }
        if (!Objects.equals(this.tel_arbitre, other.tel_arbitre)) {
            return false;
        }
        return true;
    }
                    
                    
    
}
