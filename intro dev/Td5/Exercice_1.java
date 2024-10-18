package Td5;

public class Exercice_1 {
    public static void main(String[] args){
        int[][] mat1 = { {1,10,100} , {1,10,100}, {1,10,100} };
        int[][] mat2 = { {1,10,100} , {1,10,100}, {1,10,100}  };
        sommeDiagos(mat1);
    }

    static void afficherMatrice(int[][] mat){
        System.out.println(" taille du tableau =  " + mat.length);
        for (int i = 0; i < mat.length; i++) {
            System.out.print("Ligne "+(i+1)+" = ");
            for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    static int[][] addition(int[][] mat1, int[][] mat2){
        int[][] somme = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < somme.length; i++) {
            for (int j = 0; j < somme[0].length; j++) {
                somme[i][j] += mat1[i][j] + mat2[i][j]; 
            }
        }
        return somme;
    }

    static int sommeDiagos(int[][] mat){
        int diagoBas = 0;
        int diagoHaut = 0;
        for (int i = 0; i < mat.length; i++) {
                diagoBas += mat[i][i];
//
        }

        //a finir
        for (int i = mat.length; i >= 0; i--) {
            diagoHaut += mat[i][i];
            System.out.println(mat[i][i]);
            System.out.println("diagoBas = "+ diagoHaut);
        }

        int[] somme = {diagoBas,diagoHaut};
        System.out.println("la somme de la diagonale de haut gauche a bas droite =" + somme[0]);
        System.out.println("la somme de la diagonale de bas droite a haut gauche =" + somme[1]);
        return somme[0]+somme[1];
    }
}