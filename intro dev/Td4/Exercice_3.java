package Td4;

public class Exercice_3 {
    public static void main(String[] args){
        System.out.println("\\\\\\ frequenceChiffres ///");
        afficherTabEntiers(frequenceChiffres(1223345));
        System.out.println(" ");
        System.out.println("\\\\\\ aChiffresTousDifferents ///");
        System.out.println(aChiffresTousDifferents(1223345));
    }

    static void afficherTabEntiers(int[] t){
        // affiche tout les éléments du tableau t
        for (int i = 0; i < t.length; i++) {
            System.out.println("on a "+(t[i])+" fois le nombre "+i);
            //System.out.println(t[i]);
        }
        return;
    }

    static int[] frequenceChiffres(int n){
        int[] x = new int[10];
        while (n>0){
            int r = n%10;
            n = n/10;
            x[r] +=1;
        }

        return x;
    }

    static boolean aChiffresTousDifferents(int n){
            int[] x = frequenceChiffres(n);
            for (int i = 0; i < x.length; i++) {
                if (x[i]>1){ return false;}
            }
            return true;
    }

    static boolean aChiffresTousDifferentsBis(int[] x){
        return true;
    }
}