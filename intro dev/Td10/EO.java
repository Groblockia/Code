package Td10;

public class EO {
    private Orque[] ensTab;
    private int cardinal;
    public int max;

    public EO(int max){
        this.cardinal = 0;
        this.max = max;
        this.ensTab = new Orque[max];
    }

    public EO(Orque[] tableau, int max){
        this.cardinal = tableau.length;
        this.max = max;
        this.ensTab = new Orque[max];
        for (int i = 0; i < tableau.length; i++) {
            this.ensTab[i] = tableau[i];
        }
    }

    public EO(EO tab){
        this.max = tab.max;
        this.ensTab = new Orque[tab.ensTab.length];
        this.cardinal = tab.cardinal;
        for (int i = 0; i < tab.ensTab.length; i++) {
            this.ensTab[i] = tab.ensTab[i];
        }
    }

    public String toString(){
        String x = "";
        for (int i = 0; i < this.cardinal; i++) {
            if (i==0){
                x += "{"+this.ensTab[i]+ ", ";
            }
            else if (i==this.cardinal-1){
                x += this.ensTab[i]+"}";
            }
            else { x += this.ensTab[i]+", ";}
        }
        return x;
    }

    public int getCardinal(){
        return this.cardinal;
    }

    public int contientPratique(Orque test){
        for (int i = 0; i < this.ensTab.length; i++) {
            if (this.ensTab[i] == test){
                return i;
            }
        }
        return -1;
    }

    public  boolean contient(Orque test){
        for (int i = 0; i < this.cardinal; i++) {
            if (this.ensTab[i]==test){
                return true;
            }
        }
        return false;
    }

    private void ajoutPratique(Orque e){
        if (this.max == this.cardinal){
            throw new RuntimeException("tableau deja plein");
        }

        if (this.contient(e)){
            throw new RuntimeException("l'élément est déja dedans");
        }
        
        
        this.ensTab[this.cardinal] = e;
        this.cardinal ++;
        
    }

    private Orque retraitPratique(int i){
        this.ensTab[i] = this.ensTab[this.cardinal -1];
        this.cardinal --;
        return this.ensTab[i];
    }

    public boolean estVide(){
        for (int i = 0; i < this.ensTab.length; i++) {
            if(this.ensTab.length == 0){
                return false;
            }
        }
        return true;
    }

    public boolean deborde(){
        return this.cardinal>= this.max;
    }

    public boolean retraitElt(Orque x){
        if (this.contient(x)){
            int temp = contientPratique(x);
            this.retraitPratique(temp);
            return true;
        }
        else{ return false;}
    }

    public int ajoutElt(Orque x){
        if (this.deborde()){
            return -1;
        }
        if (this.contient(x)){
            System.out.println("déja dedans");
            return 0;
        }
        ajoutPratique(x);
        return 1;
    }

    /** Pré-requis : ensemble this est non vide
    * Résultat/action : enlève un élément de this (aléatoirement) et le renvoie
    */
    public Orque retraitEltAleatoirement() {
        int i = Ut.randomMinMax (0, this.cardinal - 1);
        Orque select = retraitPratique(i);
        return select;
    }

    /** Pré-requis : ensemble this est non vide
    * Résultat : un élément quelconque de this choisi aléatoirement
    */
    public Orque selectionEltAleatoirement() {
        int i = Ut.randomMinMax (0, this.cardinal - 1);
        return this.ensTab[i];
    }


    /** Pré-requis : ensemble this est non vide
    * Résultat : un élément quelconque de this
    */
    public Orque selectionElt() {
        return this.ensTab[this.cardinal - 1];
    }


    public static void main(String args[]){
        /* Orque o1 = new Orque();
        Orque o2 = new Orque();
        Orque o3 = new Orque();
        Orque o4 = new Orque();
        Orque o5 = new Orque();
        Orque[] x = {o1,o2,o3,o4,o5};
        Orque[] y = {o1,o5};
        EO e1 = new EO(x, 10);
        EO e2 = new EO(y, 10); */
        /* System.out.println("e1 = " + e1); */
        /* System.out.println("le cardinal est: " + e1.getCardinal()); */
        /* System.out.println("a quel indice se situe 3 dans l'ensemble?  " + e1.contientPratique(3)); */
        /* System.out.println("a quel indice se situe 51 dans l'ensemble?  " + e1.contientPratique(51)); */
        /* System.out.println("l'ensemble contient o4?  " + e1.contient(o4)); */
        /* System.out.println("l'ensemble contient 88748374?  " + e1.contient(88748374)); */
        /* System.out.println("e1 est inclus dans e2? " + e1.estInclus(e2)); */
        /* System.out.println("e1 est égal a e2? " + e1.estEgal(e2)); */
        /* System.out.println("e1 est disjoint de e2? " + e1.estDisjoint(e2)); */
        /* System.out.println("intersection de e1 et e2 = "+ e1.intersection(e2)); */
        /* System.out.println("union de e1 et e2 = "+ e1.reunion(e2)); */
        /* System.out.println("différence de e1 et e2 = "+ e1.difference(e2));  */
    }

}

