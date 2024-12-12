package Td10;
public class Orque {
    private int id;
    private int score;

    public static int nextId = 0;
    public static Orque legende = new Orque();

    public Orque(){
        this.id = 0;
        this.score = 0;
        this.nextId = score ++;
    }

    public Orque duel(Orque o2){
        if (Ut.randomMinMax(0, 1) == 1){
            this.score += 1;
            if (o2.score > this.legende.score){
                this.legende = o2;
            }
            return this;
        }
        else{
            o2.score += 1;
            if (this.score > o2.legende.score){
                o2.legende = this;
            }
            return o2;
        }
    }



}
