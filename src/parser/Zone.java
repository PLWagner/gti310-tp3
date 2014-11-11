package parser;

import java.util.List;

public class Zone {
	int nbSommets;
	int valPourInfini;
	int sommetDepart;
	List<Chemin> listeChemins;

	
	/*
	 * CONSTRUCTEUR
	 */
	public Zone(){}
	
	
	/*
	 * ACCESSEURS
	 */
	public int getNbSommets() {
		return nbSommets;
	}
	public int getValPourInfini() {
		return valPourInfini;
	}
	public int getSommetDepart() {
		return sommetDepart;
	}
	public List<Chemin> getListeChemins(){return listeChemins;}

	
	/*
	 * MUTATEURS
	 */
	public void setNbSommets(int nbSommets) {
		this.nbSommets = nbSommets;
	}

	public void setValPourInfini(int valPourInfini) {
		this.valPourInfini = valPourInfini;
	}

	public void setSommetDepart(int sommetDepart) {
		this.sommetDepart = sommetDepart;
	}

	public void setListeChemins(List<Chemin> listeChemins) {
		this.listeChemins = listeChemins;
	}
}
