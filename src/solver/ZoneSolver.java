package solver;

import parser.Chemin;
import parser.Zone;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by michael on 14-11-11.
 */
public class ZoneSolver implements Solver<Zone, List<List<Chemin>>> {

	
//	ZoneSolver(Zone _zone){
//		
//        Zone zone = _zone;
//	}

	
    @SuppressWarnings("unchecked")
	@Override
    public List<List<Chemin> > solve(Zone _zone) {
    	
    	List<Chemin> cheminsUtilises = new CopyOnWriteArrayList<>();


    	List<List<Chemin>> listDeListDeChemin = new CopyOnWriteArrayList<>();

        Zone zone = _zone;
		int nombreSommets = zone.getNbSommets();

        GroupeurValeur grpVal = new GroupeurValeur();
        Map<Integer, List<Chemin>> map;
        map = grpVal.deListeAMap(zone.getListeChemins());
        
        int profondeur =0;
        boolean isDeepest = false;
        int valDepart = zone.getSommetDepart();
        parcourirArbre(map.get(zone.getSommetDepart()), map, cheminsUtilises, profondeur, isDeepest, valDepart, listDeListDeChemin, nombreSommets);
        
   

        return null;

    }
    
    public List<List<Chemin>> parcourirArbre(List<Chemin> listeChemins, Map<Integer, List<Chemin>> mapChemins, List<Chemin> cheminsUtilises, int profondeur, boolean isDeepest, int valDepart, List<List<Chemin>> listDeListDeChemin, int nombreSommets) {
		//print("Entrer dans parcourir arbre : ", isDeepest);
		List tempCheminUtilises = cheminsUtilises;
		if (listeChemins == null) {
			return null;
		}
		for (int i = 0; i < listeChemins.size(); i++) {
			if (listeChemins.get(i).getPointArrivee() == valDepart) {
				profondeur++;
				List<parser.Chemin> listToSave = cheminsUtilises;
				cheminsUtilises.add(listeChemins.get(i));
				listDeListDeChemin.add(listToSave);
				//System.out.println("Ye!!!"+  "\tSource: " + listeChemins.get(i).getPointSource() + "\tDest : " + listeChemins.get(i).getPointArrivee() +  " ");

				//if (isValidSequence(listToSave)){
				System.err.print("Voci la liste à sauvegarder  : ");
				for (Chemin chemin : listToSave) {
					System.err.print(" " + "Source: " + chemin.getPointSource() + "  Dest : " + chemin.getPointArrivee());
				}
				System.err.println();
				//	}

				if (cheminsUtilises.size() > 0) {
					cheminsUtilises.remove(cheminsUtilises.size() - 1);
				}


				break;

			} else if (!isUsed(cheminsUtilises, listeChemins.get(i))) {
				profondeur++;
				//print("Profondeur : " + profondeur , isDeepest);
				//print("avant if "+ "\tSource: " + listeChemins.get(i).getPointSource() + "\tDest : " + listeChemins.get(i).getPointArrivee(), isDeepest);
				cheminsUtilises.add(listeChemins.get(i));
				parcourirArbre(mapChemins.get(listeChemins.get(i).getPointArrivee()), mapChemins, tempCheminUtilises, profondeur, isDeepest, valDepart, listDeListDeChemin, nombreSommets);
				isDeepest = false;
				if (cheminsUtilises.size() > 0) {
					cheminsUtilises.remove(cheminsUtilises.size() - 1);
				}


			}


		}

		return listDeListDeChemin;
	}

    
    void print(String message , boolean isDeepest ){
    	
    	System.out.println(message);
    }
    
    
    private boolean isUsed(List<Chemin> cheminsUtilises, Chemin cheminAverifier) {
    	for (Chemin chemin : cheminsUtilises) {
    		//System.err.println("is used : "+ "\tSource: " + chemin.getPointSource() + "\tDest : " + chemin.getPointArrivee());
		}
    	
    	
    	return cheminsUtilises.contains(cheminAverifier);
		
	}


	private boolean  isValidSequence(List<Chemin> listeAvalider){
		boolean isOk= true;
		boolean tmpBool= false;
		List<Chemin> tmpListe = listeAvalider;
		//QuickSort<Chemin> qSort = new QuickSort<>(tmpListe, 0 , tmpListe.size());
		//Collections.sort(tmpListe, new CheminComparator());

		for (int i = 0; i < listeAvalider.size() ; i++) {
			for (int j = 1; j <= listeAvalider.size(); j++)

			{
				//System.out.println(listeAvalider.get(i).getPointArrivee());
				if (listeAvalider.get(i).getPointArrivee() == j )  {

					tmpBool = true;
				} else {
					tmpBool = false;
				}
			}
			if (!tmpBool){
				for (Chemin chemin : tmpListe)
					System.out.print(" " + chemin.getPointArrivee()+ " ");
				System.out.println("Arrivé");
				return false;

			}
		}
	//	System.out.println();

		return true;
	}
	class CheminComparator implements Comparator<Chemin> {
		@Override
		public int compare(Chemin a, Chemin b) {
			final int SMALLER = -1;
			final int EQUAL = 0;
			final int BIGGER = 1;
			if (a.getPointSource() < b.getPointSource()) {

				return SMALLER;
			} else if (a.getPointSource() > b.getPointSource()) {
				return BIGGER;
			}

			return EQUAL;
		}
	}
}
