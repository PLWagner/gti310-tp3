package solver;

import java.util.*;
import parser.Chemin;


public class GroupeurValeur{
    final int SMALLER = -1;
    final int EQUAL = 0;
    final int BIGGER = 1;


    /**
     * Génère d'une liste des groupes tous les éléments identique selon l'interface compareTo
     * @param liste
     */
    public LinkedHashMap deListeAMap(List<Chemin> liste){

        QuickSort<parser.Chemin> quickSort = new QuickSort<Chemin>(liste, 0, liste.size() -1);
        for (int j = 0; j < liste.size(); j++) {
            System.out.printf("%d ", liste.get(j).getPoids());
        }
        LinkedHashMap<Integer,List> myMap =  new LinkedHashMap();
       ;
        int current = 0;

        for (int i = 0; i < liste.size(); i= current) {
            // C'est la valeur de référence pour comparer les éléments semblables de la liste
            parser.Chemin tmpVal = (Chemin) liste.get(i);
            List<parser.Chemin> tmpListe = new LinkedList<>();
            int j =0;
                // tant que l'élément ordoné est égale, entrer la valeur dans la liste temporaire
                for (j = i ;  j < liste.size() ||liste.get(j).compareTo((Chemin) liste.get(current)) == EQUAL  ; j++) {
                    tmpListe.add((Chemin) liste.get(i));
                }
            myMap.put(tmpVal.getPoids(), tmpListe);
            current = j;



        }
        return myMap;
    }



}
