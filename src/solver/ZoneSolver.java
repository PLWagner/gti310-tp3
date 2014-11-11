package solver;

import parser.Chemin;
import parser.Zone;

import java.util.List;

/**
 * Created by michael on 14-11-11.
 */
public class ZoneSolver implements Solver<Zone, List<Chemin> > {

    Zone zone;
    List<Chemin> listeChemins;

    @Override
    public List<Chemin> solve(Zone _zone) {

        zone = _zone;

        listeChemins = zone.getListeChemins();


        return null
                ;

    }
}
