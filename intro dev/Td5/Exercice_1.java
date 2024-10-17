package Td5;

public class Exercice_1 {
    public static void main(String[] args){
        int[][] mat1 = { {1,10,100} , {1,10,100} };
        int[][] mat2 = { {1,10,100} , {1,10,100} };
        afficherMatrice(addition(mat1, mat2));
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
}