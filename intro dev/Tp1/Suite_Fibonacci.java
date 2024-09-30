package Tp1;

public class Suite_Fibonacci {
    public static void main(String[] args){
        suiteOrOrdre(10);
    }

    static int U(int i){
        if (i<=2) {
            return 1;
        }
        else {
            int C = -100000;
            int procproc = 1;
            int proc = 1;
            for (int j = 3; j <= i; j++) {
                C = procproc + proc;
                procproc = proc;
                proc = C;
            }
            return C;
        }
    }

    static double V(int i){ 
        return (double)U(i)/U(i-1);
    }


    static void suiteOrOrdre(int n){
        if (n<=2) {
            System.out.println("Erreur, n ne peut être inférieur ou égal a 2");
            return;
        }

        for (int i = 2; i < n; i++) {
            System.out.print("//i = ");
            System.out.println(i);

            System.out.print("Ui = ");
            System.out.println(U(i));

            System.out.print("Vi = ");
            System.out.println(V(i));

            System.out.println("P(Vi) = " + ((V(i)*V(i))-V(i)-1));
            System.out.println(" ");
        }

    }


}