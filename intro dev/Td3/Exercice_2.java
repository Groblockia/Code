package Td3;

public class Exercice_2 {
    public static void main(String[] args){
        testPyramideSimple();
    }

    static void repeteCarac(int nb, char car){
        for (int i=0; i<nb;i++){
            System.out.print(car);
        }
        System.out.println();
    }

    static void pyramideSimple(int h, char c){
        int z = 0;
        int s = h-1;
        for (int i=1;i<=h;i++){
            for (int w = s; w > 0; w--) {
                System.out.print(" ");
            }
            repeteCarac(i+z, c);
            z+=1;
            s--;
        }
    }

    static void testPyramideSimple(){
        System.out.print("saisissez le nombre de ligne: ");
        int x = Ut.saisirEntier();
        System.out.print("saisissez le charactère a utiliser: ");
        char c = Ut.saisirCaractere();
        pyramideSimple(x, c);
    }

}