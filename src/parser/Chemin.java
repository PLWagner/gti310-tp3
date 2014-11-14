package parser;

import com.sun.istack.internal.NotNull;

/**
 * Created by michael on 14-11-11.
 */
public class Chemin implements Comparable<Chemin> {


    @SuppressWarnings("CanBeFinal")
    final int pointSource;

    @SuppressWarnings("CanBeFinal")
    final int pointArrivee;
    
    final boolean utilise = false;
    @SuppressWarnings("CanBeFinal")
    final int poids;

    public Chemin(int _pointSource, int _pointArrivee, int _poids) {
        this.pointSource = _pointSource;
        this.pointArrivee = _pointArrivee;
        this.poids = _poids;
    }


    public int getPointSource() {
        return pointSource;
    }

    public int getPointArrivee() {
        return pointArrivee;
    }

    public int getPoids() {
        return poids;
    }

    @Override
    @NotNull
    public int compareTo(Chemin chemin) {
        final int SMALLER = -1;
        final int EQUAL = 0;
        final int BIGGER = 1;
        if (this.getPointSource() < chemin.getPointSource()) {

            return SMALLER;
        } else if (this.getPointSource() > chemin.getPointSource()) {
            return BIGGER;
        }

        return EQUAL;
    }
}
