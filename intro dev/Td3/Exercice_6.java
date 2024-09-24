package Td3;

public class Exercice_6 {
    public void main(String[] args){
        System.out.println(angleDroit(1,63));
    }

    int racineParfaite(int c){
        int n = racinecarreeint(c);
        if (c==n*n){
            System.out.println("Est une racine parfaite");
            return n;
        }
        else{
            System.out.println("N'est pas une racine parfaite");
            return -1;
        }
    }

    boolean estCarreeParfait(int n){
        // commence par le nombre impair 1
        int impair = 1;
    
        // boucle jusqu'à ce que la valeur soit 0 ou négative
        while (n > 0)
        {
            // soustrait le nombre impair suivant de `n`
            n = n - impair;
    
            // prend le nombre impair suivant pour la prochaine itération
            impair = impair + 2;
        }
    
        // seul un carré parfait atteindra la valeur 0
    return n == 0;
    }

    boolean angleDroit(int a, int b){
        int c = racinecarreeint((a*a)+(b*b));
        return c == Math.floor(c);
    }

    int racinecarreeint(int c){
        if (c == 0 || c == 1){return c;}
        int i = 1, result = 1;
        while (result <= c) {
            i++;
            result = i * i;
        }
        result = i-1;
        return result;
    }

}