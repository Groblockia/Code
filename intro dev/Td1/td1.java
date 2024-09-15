package Td1;

public class td1{
    public static void main(String[] args){
        Ut.afficherSL("feur");
        exo6();
    }

    static void template(){
        Ut.afficherSL("jsp");
    }

    static void exo4(){
        Ut.afficherSL("saisissez un entier:");
        int x = Ut.saisirEntier();
        for (int i = 0; i < 10; i++){
            x+=1;
            Ut.afficherSL(x);
        }
    }

    static void exo5_1(){
        Ut.afficherSL("Entrez le nombre d'entiers:");
        int n = Ut.saisirEntier();
        int z = 0;
        int somme = 0;
        while (z < n){
            z += 1;
            Ut.afficher("entrez l'entier n°");
            Ut.afficherSL(z);
            int x = Ut.saisirEntier();
            somme += x;
        }
        Ut.afficher("leur somme est de:");
        Ut.afficherSL(somme);

    }

    static void exo5_2(){
        boolean val = true;
        int counter = 0;
        int somme = 0;

        while (val){
            Ut.afficherSL("Entrez un entier >= 0");
            int x = Ut.saisirEntier();
            if (x>0){
                counter += 1;
                somme += x;
            }
            else if (x<0){
                Ut.afficherSL("t con ou quoi chef");
            }
            if (x==0){
                val=false;
            }
        }

        Ut.afficher("vous avez entré :");
        Ut.afficher(counter);
        Ut.afficherSL(" entiers");

        Ut.afficher("leur somme est de :");
        Ut.afficherSL(somme);
    }

    static void exo6(){
        Ut.afficher("entrez un nombre n de personnes:");
        int nbr = Ut.saisirEntier();
        int somme = 0;
        int count = 0;
        for (int i = 0; i<nbr; i++){
            Ut.afficher("entrez l'age de la personne n°");
            Ut.afficher(i+1);
            Ut.afficher(":");
            int age = Ut.saisirEntier();
            somme += age;
            count += 1;
        }
        Ut.afficher("la moyennes des âges est de: ");
        Ut.afficherSL(somme/count);
    }

}