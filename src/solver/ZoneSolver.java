package solver;

import parser.Chemin;
import parser.Zone;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

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
    	
    	List<Chemin> cheminsUtilises = new LinkedList<Chemin>();
    	
    

        Zone zone = _zone;

        GroupeurValeur grpVal = new GroupeurValeur();
        LinkedHashMap<Integer, List<Chemin>> map = new LinkedHashMap<Integer, List<Chemin>>();
        map = grpVal.deListeAMap(zone.getListeChemins());
        
        int profondeur =0;
        boolean isDeepest = false;
        int valDepart = zone.getSommetDepart();
        parcourirArbre(map.get(zone.getSommetDepart()), map, cheminsUtilises, profondeur, isDeepest, valDepart);
        
   

        return null;

    }
    
    public void parcourirArbre(List<Chemin> listeChemins, LinkedHashMap<Integer, List<Chemin>> mapChemins, List<Chemin> cheminsUtilises, int profondeur, boolean isDeepest, int valDepart ){
    	print("Entrer dans parcourir arbre : ", isDeepest);
    	
    	for (int i = 0; i < listeChemins.size(); i++) {
    		if (listeChemins.get(i).getPointArrivee() == valDepart){
    			profondeur++;
    			System.out.println("Ye!!!"+  "\tSource: " + listeChemins.get(i).getPointSource() + "\tDest : " + listeChemins.get(i).getPointArrivee());
    			if (cheminsUtilises.size()>1) {
        			cheminsUtilises.remove(i);
				}
    			
    			return;
    			
    		} else 		
    		if (!isUsed(cheminsUtilises, listeChemins.get(i))){
    			profondeur++;
    			print("Profondeur : " + profondeur , isDeepest);
    			print("avant if "+ "\tSource: " + listeChemins.get(i).getPointSource() + "\tDest : " + listeChemins.get(i).getPointArrivee(), isDeepest);
    			cheminsUtilises.add(listeChemins.get(i));
        		parcourirArbre(mapChemins.get(listeChemins.get(i).getPointArrivee()), mapChemins, cheminsUtilises, profondeur, isDeepest, valDepart);
        		isDeepest = false;
        		if (cheminsUtilises.size()>1) {
        			cheminsUtilises.remove(i);
				}
        		
        		
        		
    		}
    		
    	
			
		}
    	
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
}
