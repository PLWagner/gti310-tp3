package solver;

import java.util.List;

/**
 * Created by michael on 14-11-13.
 */
public interface RechercheInterface<K, V> {


    public List<K> rechercher(List<K> liste, V valeur, int debut, int fin);

}
