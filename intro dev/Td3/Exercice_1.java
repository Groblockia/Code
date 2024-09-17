package Td3;

public class Exercice_1 {
    public static void main(String[] args){
        testMax();
    }

    static int max2(int a, int b ){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static int max3(int a, int b, int c){
        if (max2(a,b)<c){
            return c;
        }
        else{
            return max2(a,b);
        }
    }

    static void testMax(){
        System.out.println("vous devez saisir 2 nombres: ");
        System.out.print("Saisissez A:");
        int a = Ut.saisirEntier();
        System.out.print("Saisissez B:");
        int b = Ut.saisirEntier();
        //System.out.print("Saisissez C:");
        //int c = Ut.saisirEntier();
        System.out.print("Le plus grand entre ces deux nombres est: ");
        System.out.println(max2(a,b));

        System.out.println("vous devez saisir 3 nombres: ");
        System.out.print("Saisissez A:");
        a = Ut.saisirEntier();
        System.out.print("Saisissez B:");
        b = Ut.saisirEntier();
        System.out.print("Saisissez C:");
        int c = Ut.saisirEntier();
        System.out.print("Le plus grand entre ces trois nombres est: ");
        System.out.println(max3(a,b,c));
    }   
}