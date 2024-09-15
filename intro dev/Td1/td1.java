package Td1;

public class td1{
    public static void main(String[] args){
        System.out.println("ca arrive fort");
        exo7_2(); //nom de l'exo a lancer
    }

    static void exo4(){
        System.out.println("saisissez un entier:");
        int x = Ut.saisirEntier();
        for (int i = 0; i < 10; i++){
            x+=1;
            System.out.println(x);
        }
    }

    static void exo5_1(){
        System.out.println("Entrez le nombre d'entiers:");
        int n = Ut.saisirEntier();
        int z = 0;
        int somme = 0;
        while (z < n){
            z += 1;
            System.out.println("entrez l'entier n°"+z);
            int x = Ut.saisirEntier();
            somme += x;
        }
        System.out.println("Leur somme est de:"+somme);

    }

    static void exo5_2(){
        boolean val = true;
        int counter = 0;
        int somme = 0;

        while (val){
            System.out.println("Entrez un entier >= 0");
            int x = Ut.saisirEntier();
            if (x>0){
                counter += 1;
                somme += x;
            }
            else if (x<0){
                System.out.println("t con ou quoi chef");
            }
            if (x==0){
                val=false;
            }
        }

        System.out.println("Vous avez entré:"+counter+"entiers");
        System.out.println("leur somme est de:"+somme);
    }

    static void exo6(){
        System.out.println("entrez un nombre n de personnes:");
        int nbr = Ut.saisirEntier();
        int somme = 0;
        int count = 0;
        for (int i = 0; i<nbr; i++){
            System.out.println("entrez l'âge de la personne n°"+(i+1)+":");
            int age = Ut.saisirEntier();
            somme += age;
            count += 1;
        }
        System.out.println("La moyenne des âges est de:"+ (somme/count));
    }

    static void exo7_1(){
        System.out.println("entrez un entier >= 0: ");
        int n = Ut.saisirEntier();
        if (n <= 0) {
            System.out.println("L'entier doit être strictement positif.");
            return;
        }
        int U = 1;
        for (int i = 2; i<=n; i++){
            U = U + i;
        }
        System.out.println("U"+n+"="+U);
    }

    static void exo7_2(){
        System.out.println("entrez un entier >= 0: ");
        int n = Ut.saisirEntier();
        if (n <= 0) {
            System.out.println("L'entier doit être strictement positif.");
            return;
        }
        if (n == 1 || n == 2) {
            System.out.println("Le terme U" + n + " de la suite de Fibonacci est : 1");
            return;
        }
        int U1 = 1, U2 = 1;
        int Un = 0;

        for (int i = 3; i<=n; i++){
            Un = U1 + U2;
            U1 = U2;
            U2 = Un;
        }
        System.out.println("U"+n+"="+Un);
    }

}