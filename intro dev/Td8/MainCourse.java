package Td8;

public class MainCourse {


    public MainCourse(String v1_nom, int v1_vitesse, String v2_nom, int v2_vitesse){
        Voiture v1 = new Voiture(v1_nom, v1_vitesse);
        Voiture v2 = new Voiture(v2_nom, v2_vitesse);
        Course c1 = new Course(v1, v2, 50,1);
    }

    public static void main(String args[]){
        Voiture v1 = new Voiture("1Voiture 1", 6);
        Voiture v2 = new Voiture("2Voitrue 2", 6);
        Course c = new Course(v1,v2,50,3);
        System.out.println("le gagnant est: " +c.deroulement().leNom());
    }

}
