package Td3;

public class Exercice_3 {
    public static void main(String[] args){
        testPyramideElaboree();
    }

    static void afficheNombresCroissants(int nb1, int nb2){
      
            for (int i = nb1; i <= nb2; i++) {
                System.out.print(i%10);
                System.out.print(" ");
            }
    
    
    }

    static void afficheNombresDecroissants(int nb1, int nb2){
       
            for (int i = nb2; i >= nb1; i--) {
                System.out.print(i%10);
                System.out.print(" ");
            }  
      
    
    }

    static void pyramideElaboree(int h) {
        for (int i = 1; i <= h; i++) {
            int a = 2*(h-i);
            afficherEspace(a);
            afficheNombresCroissants(i, (2*i)-2);
            System.out.print( ((2*i-1)%10)+" ");
            afficheNombresDecroissants(i, (2*i)-2);
            System.out.println("");
        }
    }
    
    static void afficherEspace(int a){
        for (int i = 1; i <= a; i++) {
            System.out.print(" ");
        }
    }

    static void testPyramideElaboree() {
        pyramideElaboree(9);
    }

}