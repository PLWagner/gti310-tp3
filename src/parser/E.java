package parser;

public class E {
	int nbSommets;
	int valPourInfini;
	int sommetDepart;
	int[] sourceList = new int[]{};
	int[] destinationList = new int[]{};
	int[] poidsList = new int[]{};
	
	/*
	 * CONSTRUCTEUR
	 */
	public E(){}
	
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
	public int[] getSourceList() {
		return sourceList;
	}
	public int[] getDestinationList() {
		return destinationList;
	}
	public int[] getPoidsList() {
		return poidsList;
	}
	
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
	public void setSourceList(int[] sourceList) {
		this.sourceList = sourceList;
	}
	public void setDestinationList(int[] destinationList) {
		this.destinationList = destinationList;
	}
	public void setPoidsList(int[] poidsList) {
		this.poidsList = poidsList;
	}
	
	
	
}
