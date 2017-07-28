package squad.ftt.entities;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hppro
 */
public class Matchtennis {
    private int id_match;
    private int nombre_point;
    private Date date_match;
    private Stade stade;
    private Tour tour;
    private List<Joueur> ListJoueur;
    private Utilisateur arbitre;
    
    public Matchtennis(){
        
    } 

    public Matchtennis( int nombre_point,Date date_match, Stade stade, Tour tour, Utilisateur arbitre) {
        this.nombre_point = nombre_point;
        this.date_match = date_match;
        this.stade = stade;
        this.tour = tour;
        this.arbitre = arbitre;
    }
    
    
 
 
    public int getNombre_point() {
        return nombre_point;
    }

    
    public void setNombre_point(int nombre_point) {
        this.nombre_point = nombre_point;
    }

    
    public Date getDate_match() {
        return date_match;
    }

    
    public void setDate_match(Date date_match) {
        this.date_match = date_match;
    }

    
    public Stade getStade() {
        return stade;
    }

   
    public void setStade(Stade stade) {
        this.stade = stade;
    }
    
     public Utilisateur getArbitre() {
        return arbitre;
    }

    
    public void setArbitre(Utilisateur arbitre) {
        this.arbitre = arbitre;
    
    }

    /**
     * @return the id_match
     */
    public int getId_match() {
        return id_match;
    }

    /**
     * @param id_match the id_match to set
     */
    public void setId_match(int id_match) {
        this.id_match = id_match;
    }

    /**
     * @return the ListJoueur
     */
    public List<Joueur> getListJoueur() {
        return ListJoueur;
    }

    /**
     * @param ListJoueur the ListJoueur to set
     */
    public void setListJoueur(List<Joueur> ListJoueur) {
        this.ListJoueur = ListJoueur;
    }

    /**
     * @return the tour
     */
    public Tour getTour() {
        return tour;
    }

    /**
     * @param tour the tour to set
     */
    public void setTour(Tour tour) {
        this.tour = tour;
    }
    
}
