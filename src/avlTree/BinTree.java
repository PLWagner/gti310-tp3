package avlTree;


//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
//							CLASSE BINTREE
//-----------------------------------------------------------------------
// Cette classe permet de creer des arbres de n'importe quel type.
// Le type choisit doit permettre l'affectation (=).
//-----------------------------------------------------------------------

abstract class BinTree<T> {

    AVLNode<T> racine;    // Racine de l'arbre.
    int nb_noeuds;        // Nombre de noeuds de l'arbre.


    // CONSTRUCTEUR
    public BinTree() {
        racine = null;
        nb_noeuds = 0;
    }

    // Methodes privees recursives.
    private void detruireArbre(AVLNode<T> arbre) {
        if (arbre != null) {
            detruireArbre(arbre.getFilsG());
            detruireArbre(arbre.getFilsD());
            arbre = null;
        }


    }

    private int profondeurArbre(AVLNode<T> arbre) {

        int profGauche = profondeurArbre(arbre.getFilsG());
        int profDroite = profondeurArbre(arbre.getFilsD());
        return 1 + ((profGauche > profDroite) ? profGauche : profDroite);
    }

    private int compterFeuillesArbre(AVLNode<T> node) {
        return 0;
    }

/*    void parcoursPrefixe(const node<T> *, void (*f) (const T &)) const;
    void parcoursInfixe(const node<T> *, void (*f) (const T &)) const;
    void parcoursSuffixe(const node<T> *, void (*f) (const T &)) const;*/

/*    void parcoursPrefixe(AVLNode<T> node void (*f) (T &));
    void parcoursInfixe(AVLNode<T> node, void (*f) (T &));
    void parcoursSuffixe(AVLNode<T> node, void (*f) (T &));*/


    void parcoursPrefixe(AVLNode<T> arbre) {
        if (arbre != null) {
            System.out.println(arbre.getData());
            parcoursPrefixe(arbre.getFilsG());
            parcoursPrefixe(arbre.getFilsD());
        }
    }

    void parcoursInfixe(AVLNode<T> arbre) {
        if (arbre != null) {
            parcoursInfixe(arbre.getFilsG());
            System.out.println(arbre.getData());
            parcoursInfixe(arbre.getFilsD());
        }
    }


    void parcoursSufixe(AVLNode<T> arbre) {
        if (arbre != null) {
            parcoursSufixe(arbre.getFilsG());
            parcoursSufixe(arbre.getFilsD());
            System.out.println(arbre.getData());
        }
    }


    void empty() {
    }

    {
        if (nb_noeuds > 0) {
            detruireArbre(racine.getFilsG());
            detruireArbre(racine.getFilsD());
            racine = null;
            nb_noeuds = 0;
        }
    }


/*
}





    // METHODES DE MODIFICATION
    // Permet d'ajouter un element par rapport au courant.
    int add(const T &) = 0;
    int remove(const T &) = 0;

    // Vide l'arbre.
    virtual void empty();

    // Offre de parcours en modification.
    inline void prefix(void (*f) (T &)) { parcours_prefixe(racine, f);}
    inline void infix(void (*f) (T &))  { parcours_infixe(racine, f);}
    inline void suffix(void (*f) (T &)) { parcours_suffixe(racine, f);}


    // METHODES DE CONSULTATION
    // Offre de parcours en consultation.
    inline void prefix(void (*f) (const T &)) const { parcours_prefixe(racine, f);}
    inline void infix(void (*f) (const T &)) const  { parcours_infixe(racine, f);}
    inline void suffix(void (*f) (const T &)) const { parcours_suffixe(racine, f);}

    inline int size() const { return nb_noeuds;}	// Nombre de noeuds.
    inline int count_leaves() const					// Nombre de feuilles.
    { return compter_feuilles_arbre(racine);}
    inline int depth() const                        // Profondeur de l'arbre.
    { return profondeur_arbre(racine);}*/
};

