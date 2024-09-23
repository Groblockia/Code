package Td3;

public class Exercice_4 {
    public static void main(String[] args){
        System.out.print("saissez un entier: ");
        int x = Ut.saisirEntier();
        System.out.println("le nombre de chiffres est:"+nbChiffres(x));
        System.out.println("le nombre de chiffres du carré est:"+nbChiffresCarre(x));
    }

    static int nbChiffres(int x){
        int count = 0;
        while (x>0){
            x = x/10;
            count +=1;
            //System.out.println("x="+x);
        }
        return count;
    }

    static int nbChiffresCarre(int x){
        int count = 0;
        x = x*x;
        while (x>0){
            x = x/10;
            count +=1;
            //System.out.println("x="+x);
        }
        return count;
    }

}