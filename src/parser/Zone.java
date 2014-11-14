package parser;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private int nbSommets;
    private int valPourInfini;
    private int sommetDepart;
    @SuppressWarnings("CanBeFinal")
    private ArrayList<Chemin> listeChemins = new ArrayList<>();


    /*
     * CONSTRUCTEUR
     */
    public Zone() {
    }


    /*
     * ACCESSEURS
     */
    public int getNbSommets() {
        return nbSommets;
    }

    /*
     * MUTATEURS
     */
    public void setNbSommets(int nbSommets) {
        this.nbSommets = nbSommets;
    }

    public int getValPourInfini() {
        return valPourInfini;
    }

    public void setValPourInfini(int valPourInfini) {
        this.valPourInfini = valPourInfini;
    }

    public int getSommetDepart() {
        return sommetDepart;
    }

    public void setSommetDepart(int sommetDepart) {
        this.sommetDepart = sommetDepart;
    }

    public List<Chemin> getListeChemins() {
        return listeChemins;
    }

    public void setChemins(Chemin chemin) {
        this.listeChemins.add(chemin);
    }
}
