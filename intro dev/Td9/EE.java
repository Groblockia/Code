package Td9;

public class EE {
    private int[] ensTab;
    private int cardinal;
    public int max;

    public EE(int max){
        this.cardinal = 0;
        this.max = max;
        this.ensTab = new int[max];
    }

    public EE(int[] tableau, int max){
        this.cardinal = tableau.length;
        this.max = max;
        this.ensTab = new int[max];
        for (int i = 0; i < tableau.length; i++) {
            this.ensTab[i] = tableau[i];
        }
    }

    public EE(EE tab){
        this.max = tab.max;
        this.ensTab = new int[tab.ensTab.length];
        this.cardinal = tab.cardinal;
        for (int i = 0; i < tab.ensTab.length; i++) {
            this.ensTab[i] = tab.ensTab[i];
        }
    }

    public String toString(){
        String x = "";
        for (int i = 0; i < this.ensTab.length; i++) {
            if (i==0){
                x += "{"+this.ensTab[i]+ ", ";
            }
            else if (i==this.ensTab.length-1){
                x += this.ensTab[i]+"}";
            }
            else { x += this.ensTab[i]+", ";}
        }
        return x;
    }

    public int getCardinal(){
        return this.cardinal;
    }

    public int contientPratique(int test){
        for (int i = 0; i < this.ensTab.length; i++) {
            if (this.ensTab[i] == test){
                return i;
            }
        }
        return -1;
    }

    public  boolean contient(int test){
        for (int i = 0; i < this.ensTab.length; i++) {
            if (this.ensTab[i]==test){
                return true;
            }
        }
        return false;
    }

    private void ajoutPratique(int e){
        if (this.max == this.cardinal){
            throw new RuntimeException("tableau deja plein");
        }

        if (this.contient(e)){
            throw new RuntimeException("l'élément est déja dedans");
        }
        this.cardinal ++;
        this.ensTab[this.cardinal] = e;
    }

    private int retraitPratique(int i){
        this.ensTab[i] = this.ensTab[this.cardinal -1];
        this.cardinal --;
        return this.ensTab[i];
    }

    public boolean estVide(){
        for (int i = 0; i < this.ensTab.length; i++) {
            if(this.ensTab[i]!= 0){
                return false;
            }
        }
        return true;
    }

    public boolean deborde(){
        return this.cardinal>= this.max;
    }

    public boolean retraitElt(int x){
        if (this.contient(x)){
            int temp = contientPratique(x);
            this.retraitPratique(temp);
            return true;
        }
        else{ return false;}
    }

    public int ajoutElt(int x){
        if (this.deborde()){
            return -1;
        }
        if (this.contient(x)){
            return 0;
        }
        ajoutPratique(x);
        return 1;
    }

    public boolean estInclus(EE x){
        int count = 0;
        for (int i = 0; i < x.max; i++) {
            if (this.contient(x.ensTab[i])){
                count += 1;
            }
        }

        if (count==x.max) {
            return true;
        }
        else{ return false;}
    }

    public boolean estEgal(EE x){
        return this.estInclus(x) && x.estInclus(this);
    }

    public boolean estDisjoint(EE x){
        for (int i = 0; i < this.cardinal; i++) {
            if (x.contient(this.ensTab[i])) {
                return false;
            }
        }
        return true;
    }

    public EE intersection(EE ens){
        EE inter = new EE(Integer.min(this.cardinal, ens.cardinal));
        for (int i = 0; i < this.cardinal; i++) {
            if (ens.contient(this.ensTab[i])) {
                inter.ajoutElt(this.ensTab[i]);
            }
        }
        return inter;
    }

    public EE reunion(EE ens){
        EE union = new EE(this.cardinal+ens.cardinal);
        for (int i = 0; i < this.ensTab.length; i++) {
            union.ajoutElt(this.ensTab[i]);
        }
        for (int i = 0; i < ens.ensTab.length; i++) {
            union.ajoutElt(ens.ensTab[i]);
        }
        return union;
    }

    public EE difference(EE ens){
        EE diff = new EE(this);
        for (int i = 0; i < ens.cardinal; i++) {
            diff.retraitElt(ens.ensTab[i]);
        }
        return diff;
    }

    public static void main(String args[]){
        int[] x = {1,4,6,2,7,3,42};
        int[] y = {42,12};
        EE e1 = new EE(x, 10);
        EE e2 = new EE(y, 10);
        System.out.println("e1 = " + e1);
        System.out.println("le cardinal est: " + e1.getCardinal());
        System.out.println("a quel indice se situe 3 dans l'ensemble?  " + e1.contientPratique(3));
        System.out.println("a quel indice se situe 51 dans l'ensemble?  " + e1.contientPratique(51));
        System.out.println("l'ensemble contient 7?  " + e1.contient(7));
        System.out.println("l'ensemble contient 88748374?  " + e1.contient(88748374));
        System.out.println("e1 est inclus dans e2? " + e1.estInclus(e2));
        System.out.println("e1 est égal a e2? " + e1.estEgal(e2));
        System.out.println("e1 est disjoint de e2? " + e1.estDisjoint(e2));
        System.out.println("intersection de e1 et e2 = "+ e1.intersection(e2));
        System.out.println("union de e1 et e2 = "+ e1.reunion(e2));
        System.out.println("différence de e1 et e2 = "+ e1.difference(e2));
    }

}
