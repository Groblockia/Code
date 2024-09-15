package Td2;

public class td2{
    public static void main(String[] args){
        exo7_1();
    }
    static void exo7_1(){
        double a= 9;
        double b=13;
        double c= 2;
    
        double D = (Math.pow(b,2))-(4*a*c);
    
        if (D<0){
            Ut.afficherSL("pas de solution possible");
        }
        else{
            Ut.afficherSL("Voici les solutions");
            Ut.afficherSL( (-b + Math.sqrt(D))/2 );
            Ut.afficherSL( (-b - Math.sqrt(D))/2 );
        }
    }
}