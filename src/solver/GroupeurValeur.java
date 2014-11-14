package solver;

import parser.Chemin;

import java.util.*;


public class GroupeurValeur {
    private final int SMALLER = -1;
    private final int EQUAL = 0;
    private final int BIGGER = 1;


    /**
     * Génère d'une liste des groupes tous les éléments identique selon l'interface compareTo
     *
     * @param liste
     */
    public Map<Integer, List<Chemin>> deListeAMap(List<Chemin> liste) {

        QuickSort<Chemin> quickSort = new QuickSort<>(liste, 0, liste.size() - 1);
        for (Chemin aListe : liste) {
            System.out.printf("%d ", aListe.getPoids());

        }
        System.out.println();
        LinkedHashMap<Integer, List<Chemin>> myMap = new LinkedHashMap();
        int current = 0;

        for (int i = 0; i < liste.size(); i = current) {
            // C'est la valeur de référence pour comparer les éléments semblables de la liste
            parser.Chemin tmpVal = liste.get(i);
            List<parser.Chemin> tmpListe = new LinkedList<>();
            int j = 0;
            // tant que l'élément ordoné est égale, entrer la valeur dans la liste temporaire
            for (j = i; j < liste.size() && liste.get(j).compareTo(tmpVal) == EQUAL; j++) {
                tmpListe.add(liste.get(j));
            }
            myMap.put(tmpVal.getPointSource(), tmpListe);
            current = j;


        }
        return Collections.synchronizedMap(myMap);
    }


}
