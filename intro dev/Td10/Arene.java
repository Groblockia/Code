package Td10;

public class Arene {
    private EO ensOrques;

    public Arene(int nbo){
        this.ensOrques = new EO(nbo);
        for (int i = 0; i < nbo; i++) {
            this.ensOrques.ajoutElt(new Orque());
        }
    }

    public void bataille(){
        System.out.println("début:" + ensOrques);
        System.out.println(" ");
        System.out.println("cardinal de début:" + ensOrques.getCardinal());
        int i = 1;
        while ((this.ensOrques.getCardinal()>1)){
            System.out.println("Tour N°"+i+" Cardinal:"+this.ensOrques.getCardinal());
            Orque orc1 = this.ensOrques.retraitEltAleatoirement();
            Orque orc2 = this.ensOrques.retraitEltAleatoirement();

            Orque gagnant = orc1.duel(orc2);
            this.ensOrques.ajoutElt(gagnant);
            i++;
        }
        System.out.println("fin:" + ensOrques);
        System.out.println("cardinal de fin:" + ensOrques.getCardinal());
        return;
    }

    public static void main(String[] args){
        Arene a = new Arene(10);
        a.bataille();
    }
}
