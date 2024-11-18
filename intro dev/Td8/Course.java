package Td8;

public class Course {
    Voiture voit1;
    Voiture voit2;
    int longueur_piste;

    public Course (Voiture v1, Voiture v2, int long_piste){
        this.voit1 = v1;
        this.voit2 = v2;
        this.longueur_piste = long_piste;
    }

    public String toString(){
        return (this.voit1.toString() + this.voit2.toString());
    }

    public Voiture deroulement(){
        voit1.auDepart();
        voit2.auDepart();

        while ( !voit1.depasse(longueur_piste) && !voit2.depasse(longueur_piste)){
            if (Ut.randomMinMax(1, 2) == 1){ voit1.avance();}
            else { voit2.avance();}
            System.out.print(voit1.toString2());
            System.out.print(voit2.toString2());
            Ut.pause(250);
            Ut.clearConsole();
        }

        if (voit1.depasse(longueur_piste)){ return voit1;}
        else { return voit2;}
    }


    public static void main(String args[]){
        Voiture v1 = new Voiture("2mahdi", 4);
        Voiture v2 = new Voiture("1mateo", 4);
        Course c = new Course(v1,v2,50);
        System.out.println("le gagnant est: " +c.deroulement().leNom());
    }

}
