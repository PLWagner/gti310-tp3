package parser;

/**
 * Created by michael on 14-11-11.
 */
public class Chemin {


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
}
