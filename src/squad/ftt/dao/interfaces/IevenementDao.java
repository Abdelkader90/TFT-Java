package squad.ftt.dao.interfaces;

import squad.ftt.entities.Evenement;
import java.util.List;

/**
 *
 * @author hppro
 */
public interface IevenementDao {
    void addEvenement(Evenement evenement);

    void updateEvenement(Evenement evenement);

    void removeEvenementByLibelle(String libelle);

    void removeEvenementById(int id_evenement);

    List<Evenement> findAll();

    Evenement findEvenementById(int id_evenement);

    Evenement findEvenementByLibelle(String libelle);

    
}
