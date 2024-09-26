package Td3;

public class Exercice_7 {
    public static void main(String[] args){
        System.out.print("saissez un entier:");
        System.out.print("On a "+NbTrianglesRectangles(Ut.saisirEntier())+" triangles rectangles");
    }

    static int NbTrianglesRectangles(int p){
        double z = 0;
        int counter = 0;
        for (double x = 0; x < p; x++) {
            for (double y = 0; y < p; y++) {
                z = Math.sqrt(((x*x)+(y*y)));
                if ( x+y+z < p && ( x%1==0 && y%1==0 && z%1==0 )) {
                    if ( (x>0&&y>0&&z>0) && (x>y)){
                        counter+=1;
                        System.out.println("le triangle de cotés a:"+x+" b:"+y+" h:"+z+" est un triangle rectangle entier");
                    }
                }
            }
        }
        return counter;
    }

}