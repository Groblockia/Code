package Tp1;
//jsp
public class Suite_Fibonacci {
    public static void main(String[] args){
        suiteOrEpsilon(0.8);
    }
    //Nombre d'or

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

            System.out.print("Vi = ");
            System.out.println(V(i));

            System.out.println("P(Vi) = " + ((V(i)*V(i))-V(i)-1));
            System.out.println(" ");
        }

    }

    static void suiteOrEpsilon(double e){
        double Nbor = (1+Math.sqrt(5))/2;

        int i = 2;
        while (e > Math.abs(V(i)-Nbor) ){

            System.out.print("//i = ");
            System.out.println(i);

            System.out.print("Vi = ");
            System.out.println(V(i));

            System.out.println("P(Vi) = " + ((V(i)*V(i))-V(i)-1));
            System.out.println(" ");
        }

    }

}