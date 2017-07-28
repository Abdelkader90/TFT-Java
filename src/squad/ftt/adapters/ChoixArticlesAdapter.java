package squad.ftt.adapters;

import squad.ftt.entities.Joueur;
import squad.ftt.dao.classes.JoueurDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.ArticlesDao;
import squad.ftt.dao.classes.UtilisateurDao;
import squad.ftt.entities.Articles;
import squad.ftt.entities.Utilisateur;

public class ChoixArticlesAdapter extends AbstractTableModel {
    
    String[] headers;
  public  List<Articles> articles = new ArrayList<>();
    ArticlesDao articlesDao;

    public ChoixArticlesAdapter() {
        this.headers = new String[]{"Articles","Description","Prix", "Ajout Panier"};
        articlesDao = new ArticlesDao();
        articles = articlesDao.findAllDisponnible();
    }

    @Override
    public int getRowCount() {
        return articles.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public String getColumnName(int i) {
        return headers[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int colmunIndex) {
        switch (colmunIndex) {
            case 0:
                return articles.get(rowIndex).getId_articles();
            case 1:
                return articles.get(rowIndex).getLibelle_article();
            case 2:
                return articles.get(rowIndex).getDescription();
            case 3:
                return articles.get(rowIndex).getPrix();
            case 4:
                return articles.get(rowIndex).getImg_article();
            default:
                return null;
        }
    }
}
