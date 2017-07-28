package squad.ftt.entities;

/**
 *
 * @author rached
 */
public class Articles {
       private int id_articles;
       private String libelle_article;
       private float prix;
       private String img_article;    
       private String etat_article;
       private String description;
       private Utilisateur user_id_user;

    public Articles(String libelle_article, float prix, String img_article, String etat_article, String description) {
        this.libelle_article = libelle_article;
        this.prix = prix;
        this.img_article = img_article;
        this.etat_article = etat_article;
        this.description = description;
    }

    public Articles() {
    }
    
    
       
       
    public int getId_articles() {
        return id_articles;
    }

    public void setId_articles(int id_articles) {
        this.id_articles = id_articles;
    }

    public String getLibelle_article() {
        return libelle_article;
    }

    public void setLibelle_article(String libelle_article) {
        this.libelle_article = libelle_article;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getImg_article() {
        return img_article;
    }

    public void setImg_article(String img_article) {
        this.img_article = img_article;
    }

    public String getEtat_article() {
        return etat_article;
    }

    public void setEtat_article(String etat_article) {
        this.etat_article = etat_article;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Utilisateur getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(Utilisateur user_id_user) {
        this.user_id_user = user_id_user;
    }
       
    
}
