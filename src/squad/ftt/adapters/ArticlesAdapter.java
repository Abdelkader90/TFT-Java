package squad.ftt.adapters;


import squad.ftt.dao.classes.EvenementDao;
import squad.ftt.entities.Evenement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import squad.ftt.dao.classes.ActualitesDao;
import squad.ftt.dao.classes.ArticlesDao;
import squad.ftt.entities.Actualites;
import squad.ftt.entities.Articles;

/**
 *
 */
public class ArticlesAdapter extends AbstractTableModel {

    String[] headers;
    public List<Articles> articles = new ArrayList<>();
    ArticlesDao actDao;
    
    public ArticlesAdapter() {
        this.headers = new String[]{"Libelle","Description","prix","etat"};
        actDao = new ArticlesDao();
        articles = actDao.findAll();
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
                return articles.get(rowIndex).getPrix();
            case 3:
                return articles.get(rowIndex).getDescription();
            case 4:
                return articles.get(rowIndex).getImg_article();
            case 5:
                return articles.get(rowIndex).getEtat_article();
            default:
                return null;
        }
    }

}
