/*
package avlTree;


public abstract class SearchTree<T> extends BinTree<T> {

    //-----------------------------------------------------------------------
//							CLASSE SEARCH_TREE
//-----------------------------------------------------------------------
// Cette classe permet de creer des arbres binaires de fouille de
// n'importe quel type. Le type choisit doit permettre le (=) et le (<).
//-----------------------------------------------------------------------



    abstract AVLNode<T> trouverValeur(AVLNode<T> arbre);

    abstract AVLNode<T> trouverPere(AVLNode<T> arbre);


    boolean present(T  element)
    {


        return (trouverValeur(element) != null ? true : false );


    }


//-----------------------------------------------------------------------
// 					METHODES PRIVEES DE SEARCH_TREE
//-----------------------------------------------------------------------

    AVLNode<T> maximum(AVLNode<T> arbre){
        if (arbre == null)
            return null;

        while (arbre.getFilsD() != null)
            arbre = arbre.getFilsD();
        return arbre;
    }






    AVLNode<T> minimum(AVLNode<T> arbre){
        if (arbre == null)
            return null;

        while (arbre.getFilsD() != null)
            arbre = arbre.getFilsG();
        return arbre;
    }


// Retourne l'adresse du noeud ou se situe une valeur (NULL si absente).
        AVLNode<T> trouverValeur(T element){
        // On cherche le pere.
        AVLNode<T> noeud = racine;
        while (noeud != null && !(noeud.getData().equals(element))){

            if (Double.valueOf(element.toString()) < Double.valueOf(noeud.getData().toString())) {
                noeud = noeud.getFilsG();}
            else
                noeud = noeud.getFilsD();

        }

        return noeud;
        }


// Retourne l'adresse du pere HYPOTHETIQUE d'un element A AJOUTER
// (non present dans l'arbre). Si l'arbre est vide, on retourne NULL.

        AVLNode<T>  trouverPere(T element)
        {
        if (nb_noeuds == 0)
        return null;


        // On cherche le pere.
        AVLNode<T> pere = racine;
        int pere_trouve = 0;
        do
        {
        if (Double.valueOf(element.toString()) < Double.valueOf(pere.getData().toString()) && pere.getData() != null){
        pere = pere.getFilsG();}
        else if (Double.valueOf(element.toString()) > Double.valueOf(pere.getData().toString())&& pere.getFilsD() != null)
        pere = pere.getFilsD();
        else
        pere_trouve = 1;
        } while (pere_trouve == 0);

        return pere;

        }



//-----------------------------------------------------------------------
// 					METHODES PUBLIQUES DE SEARCH_TREE
//-----------------------------------------------------------------------

        int add(T  element)
        {
        // Si la valeur est deja la, on ne l'ajoute pas une seconde fois.
        if (present(element))
        return 0;

        // On trouve le pere, on cree le noeud et on verifie la memoire.
        AVLNode<T> pere = trouverPere(element);
        AVLNode<T> nouveau = new AVLNode<>(element, pere);
        if (nouveau == null)
        return 0;

        // On attache le pere et le fils.
        if (pere == null)
        racine = nouveau;
        else if (Double.valueOf(element.toString()) < Double.valueOf(pere.getData().toString()))
        pere.setFilsG(nouveau);
        else
        pere.setFilsD(nouveau);
        ++nb_noeuds;
        return 1;
        }


        int remove(T element)
        {
        // On trouve l'element.
        AVLNode<T>  noeud = trouverValeur(element);
        if (noeud == null)
        return 0;

        // On trouve le plus grand des plus petits.
        AVLNode<T>  remplacant = maximum(noeud.getFilsG());

        // S'il n'y a pas de remplacant, on escamote le noeud.
        if (remplacant == null)
        {
        if (noeud.equals(racine))
        racine = noeud.getFilsD();
        else if (noeud.getPere().getFilsG().equals(noeud))
        noeud.getPere().setFilsG(noeud.getFilsD());
        else
        noeud.getPere().setFilsD(noeud.setFilsD(noeud.getFilsD());
        if (noeud.get!= NULL)
        noeud->filsd->pere = noeud->pere;
        }
        else	// J'ai un maximum des minima.
        {
        noeud->data = remplacant->data;
        if (remplacant->pere->filsg == remplacant)
        remplacant->pere->filsg = remplacant->filsg;
        else
        remplacant->pere->filsd = remplacant->filsg;
        if (remplacant->filsg != NULL)
        remplacant->filsg->pere = remplacant->pere;
        noeud = remplacant;
        }
        delete noeud;
        --nb_noeuds;
        return 1;
        }


        template <class T>
        int search_tree<T>::maximum(T & element) const
        {
        node<T> * noeud = maximum(racine);
        if (noeud == NULL)
        return 0;

        element = noeud->data;
        return 1;
        }


        template <class T>
        int search_tree<T>::minimum(T & element) const
        {
        node<T> * noeud = minimum(racine);
        if (noeud == NULL)
        return 0;

        element = noeud->data;
        return 1;
        }
//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
//						FIN DE LA CLASSE SEARCH_TREE
//-----------------------------------------------------------------------
//-----------------------------------------------------------------------



        }



*/
