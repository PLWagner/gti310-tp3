package solver;

import parser.Chemin;
import parser.Zone;
import parser.ZoneParser;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;


/**
 * Created by michael on 14-11-12.
 */

public class QuickSort<T> {
    final int SMALLER = -1;
    final int EQUAL = 0;
    final int BIGGER = 1;

    List<Chemin> listToTest;
    List<Comparable<T>> listeComparable;
    Comparable pivot;

    public static void main(String[] args) {
        System.out.println("Unreal Networks Solver !");
        ZoneParser parser = new ZoneParser();
        Zone MyZone = parser.parse(args[0]);
        Object obj;

        obj = 1;
        System.out.println("Mon obj" + (obj.equals(1)));
        int tab[] = {7, 1, 9, 3, 4, 5, 8};
        List<Chemin> test = MyZone.getListeChemins();

        for(int i = 0; i < test.size(); i++)
        {
            System.out.printf("%d ", test.get(i).getPoids());

        }


        System.out.println();
        GroupeurValeur grpVal = new GroupeurValeur();
        LinkedHashMap<Integer, List> myMap = grpVal.deListeAMap(test);
        // QuickSort quick = new QuickSort(test, 0, test.size()-1);

        for(int i = 0; i < myMap.size(); i++)
        {

            List<Chemin> tempList = myMap.get(i);
            for (int j = 0; j < tempList.size(); j++) {
                System.out.printf("%d ", tempList.get(i).getPoids());
            }
            //  System.out.printf("%d ", myMap.get(i).getPoids());

        }


    }

    void echanger(List<Comparable<T>> liste, int a, int b)
    {
        Comparable<T> temp = liste.get(a);
        liste.set(a, liste.get(b));
        liste.set(b,temp);
    }

    public QuickSort(List liste, int debut, int fin)
    {
        listToTest  = liste;

        listeComparable = liste;
        int gauche = debut-1;
        int droite = fin+1;

        // reset Pivot
        pivot = null;
        pivot = listeComparable.get(debut);

	    /* Si le tableau est de longueur nulle, il n'y a rien à faire. */
        if(debut >= fin)
            return;

        while(true)
        {
            do droite--; while(listeComparable.get(droite).compareTo((T) pivot) == BIGGER);

            do gauche++; while(listeComparable.get(gauche).compareTo((T) pivot) == SMALLER);

            if(gauche < droite)
                echanger(listeComparable, gauche, droite);
            else break;
        }

/*       for(int i = 0; i < liste.size(); i++)
        {
            listeComparable = liste;
            System.out.printf("%d ", listToTest.get(i).getPointSource());


        }
        System.out.println();*/
	    /*
		 * Maintenant, tous les éléments inférieurs au pivot sont avant ceux
		 * supérieurs au pivot. On a donc deux groupes de cases à trier. On
		 * utilise pour cela... la méthode quickSort elle-même !
		 */
        new QuickSort(listeComparable, debut, droite);
        new QuickSort(listeComparable, droite+1, fin);
/*        profondeur = profondeur- 1;
        if (profondeur == 0){
            System.out.println("Profondeur = 0!");
             liste = listeComparable;
        }*/

    }

}
/*

public class QuickSort<T> {

*/





/*

    public static void main(String[] args) {

        int tab[] = {7, 1, 9, 3, 4, 5, 8};
        for(int j = 0; j < tab.length; j++)
        {
            System.out.printf("%d ", tab[j]);
        }
        System.out.println();
        int i;
        QuickSort quick = new QuickSort(tab, 0, tab.length-1);

        for(i = 0; i < tab.length; i++)
        {
            System.out.printf("%d ", tab[i]);

        }



    }

    void echanger(List<Integer> liste, int a, int b)
    {
        int temp = liste.indexOf(a);
        liste.add(a, liste.indexOf(b));
        liste.set(b,temp);
    }

    public QuickSort(List<Integer> liste, int debut, int fin)
    {
        int gauche = debut-1;
        int droite = fin+1;
        int pivot = liste.indexOf(debut);

	    */
/* Si le tableau est de longueur nulle, il n'y a rien à faire. *//*

        if(debut >= fin)
            return;

        while(true)
        {
            do droite--; while(liste.indexOf(droite) > pivot);

            do gauche++; while(liste.indexOf(gauche) < pivot);

            if(gauche < droite)
                echanger(liste, gauche, droite);
            else break;
        }

        for(int i = 0; i < liste.getL; i++)
        {
            System.out.printf("%d ", tableau[i]);

        }
        System.out.println();
	    */
/*
		 * Maintenant, tous les éléments inférieurs au pivot sont avant ceux
		 * supérieurs au pivot. On a donc deux groupes de cases à trier. On
		 * utilise pour cela... la méthode quickSort elle-même !
		 *//*

        new QuickSort(tableau, debut, droite);
        new QuickSort(tableau, droite+1, fin);
    }
*/




