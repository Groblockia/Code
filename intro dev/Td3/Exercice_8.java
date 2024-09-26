package Td3;

public class Exercice_8 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.println(NbSyracusiensMaxOp(i,10));
        }

    }

    static int NbSyracusiens(int n){
        while (n>1){
            if (n%2==0){
                n= n/2;
            }
            else{
                n= (3*n) + 1;
            }
        }
        return n;
    }

    static boolean NbSyracusiensMaxOp(int n, int NbMaxOp){
        boolean x = false;
        while (n>1){
            if (n%2==0){
                n= n/2;
            }
            else{
                n= (3*n) + 1;
            }
            NbMaxOp -= 1;
            if (NbMaxOp==0) {
                System.out.println("fin: nombre d'opérations dépassé");
                return x;
            }
        }
        if (n==1){
            x = true;
            System.out.println("fin: super nickel");
            return x;
        }
        System.out.println("fin: il est pas syracusien");
        return x;
    }
}