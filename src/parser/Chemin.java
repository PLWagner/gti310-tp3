package parser;

/**
 * Created by michael on 14-11-11.
 */
public class Chemin implements Comparable<Chemin>{


    int pointSource;

    int pointArrivee;
    int poids;

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
    public int compareTo(Chemin chemin) {
        final int SMALLER = -1;
        final int EQUAL = 0;
        final int BIGGER = 1;
        if (this.getPoids() < chemin.getPoids() ){

            return SMALLER;
        } else if(this.getPoids() > chemin.getPoids() ){
            return BIGGER;
        }

        return EQUAL;
    }
}
