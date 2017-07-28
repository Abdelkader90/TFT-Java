package squad.ftt.entities;

/**
 *
 * @author hppro
 */
public class Stade {
    private int id_stade;
    private  String libelle;
    private String lieu;
    private int capacite;
    private String terrain;
    
    public Stade(){
        
    }
     public Stade(String libelle, String lieu, String terrain, int capacite){
         this.libelle=libelle;
         this.lieu=lieu;
         this.terrain=terrain;
         this.capacite=capacite;
     }
    
    public int getId_stade(){
    return id_stade;
    }
    
    

   
    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    
    public String getLieu() {
        return lieu;
    }

    
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    
    public int getCapacite() {
        return capacite;
    }

    
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    
    public String getTerrain() {
        return terrain;
    }

   
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public void setId_stade(int id_stade) {
     this.id_stade=id_stade  ;
    }
    
    
}
