package Td4;

public class Exercice_2 {
    public static void main(String[] args){
        saisirTabEntiers(10);
    }

    static void afficherTabEntiers(int[] t){
        // affiche tout les éléments du tableau t
        for (int i = 0; i < t.length; i++) {
            System.out.print("valeur n°"+i+"= a"+t[i]);
            System.out.println(t[i]);
        }
        return;
    }

    static int[] saisirTabEntiers(int taille){
        int[] x = new int[taille];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Saisissez l'entier n°"+i+":");
            x[i] = Ut.saisirEntier();
        }
        return x;
    }

    static double moyenne(int[] t){
        int count = 0;
        int somme = 0;
        for (int i = 0; i < t.length; i++) {
            count += 1;
            somme += t[i];
        }
        return somme/count;
    }

    static void traiterTabEntiers(){
        int[] tab = saisirTabEntiers(10);
        afficherTabEntiers(tab);
        System.out.println(moyenne(tab));
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2 == 0){
                tab[i]+=1;
            }
        }
        afficherTabEntiers(tab);
    }
}