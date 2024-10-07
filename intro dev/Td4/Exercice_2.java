package Td4;

public class Exercice_2 {
    public static void main(String[] args){
        traiterTabEntiers();
    }

    static void afficherTabEntiers(int[] t){
        // affiche tout les éléments du tableau t
        for (int i = 0; i < t.length; i++) {
            System.out.println("valeur n° "+(i+1)+"= "+t[i]);
            //System.out.println(t[i]);
        }
        return;
    }

    static int[] saisirTabEntiers(int taille){
        int[] x = new int[taille];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Saisissez l'entier n°"+(i+1)+":");
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
        System.out.println("\\\\\\ SaisirTabEntiers ///");
        int[] tab = saisirTabEntiers(10);

        System.out.println(" ");
        System.out.println("\\\\\\ afficherTabEntiers ///");
        afficherTabEntiers(tab);

        System.out.println(" ");
        System.out.println("\\\\\\ moyenne ///");
        System.out.println(moyenne(tab));

        System.out.println(" ");
        System.out.println("\\\\\\ afficherTabEntiers+1 ///");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2 == 0){
                tab[i] = tab[i]+1;
            }
        }
        afficherTabEntiers(tab);
    }
}