package Td5;

public class Exercice_1 {
    public static void main(String[] args){
        int[][] mat = { {1,-1,1} , {-2,2,2} };
        afficherMatrice(mat);
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
    static void addition(){
        return;
    }

}