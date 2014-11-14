package avlTree;

//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
//							CLASSE NODE
//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
// Noeud de l'arbre.
// ATTENTION : Il ne faut pas mettre de destructeur dans le noeud. La
// destruction des sous-arbres sera geree par l'arbre, pas le noeud!
//-----------------------------------------------------------------------
class AVLNode<T> {
    @SuppressWarnings("CanBeFinal")
    T data;
    private AVLNode pere;


    private AVLNode filsG;
    private AVLNode filsD;


    public AVLNode(T element, AVLNode<T> _pere) {
        data = element;
        pere = _pere;
    }


    public AVLNode getFilsG() {
        return filsG;
    }

    public void setFilsG(AVLNode filsG) {
        this.filsG = filsG;
    }

    public AVLNode getFilsD() {
        return filsD;
    }

    public void setFilsD(AVLNode filsD) {
        this.filsD = filsD;
    }

    public AVLNode getPere() {
        return pere;
    }

    public void setPere(AVLNode pere) {
        this.pere = pere;
    }

    public T getData() {
        return data;
    }


}