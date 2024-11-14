package Td7;

public class Date {

    private int jour;
    private int mois;
    private int annee;
    private String[] nom_mois = {"apagnan","janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};

    public Date ( int d ,int m,int y) {
        this.jour = d;
        this.mois = m;
        this.annee = y;
        }

    public void day_increment(){
        this.jour += 1;
        if (this.jour > this.longueur_mois()){
            this.mois += 1;
            this.jour = 1;
        }
        if (this.mois > 12){
            this.mois = 1;
            this.annee += 1;
            this.jour = 1;
        }
    }

    public int longueur_mois(){
        if ((this.mois == 2)){
            if (Ut.estBissextile(this.annee)){
                return 29;
            }
            else {
                return 28;
            }
        }
        if (this.mois == 1 || this.mois == 3 || this.mois == 5 || this.mois == 7 || this.mois == 8 || this.mois == 10 || this.mois == 12){
            return 31;
        }
        else { 
            return 30;
        }
    }

    public boolean is_equal(Date d1, Date d2){
        if (d1.jour != d2.jour){
            return false;
        }
        if (d1.mois != d2.mois){
            return false;
        }
        if (d1.annee != d2.annee){
            return false;
        }
        return true;
    }

    public boolean precede(Date d1, Date d2){
        if (d1.annee > d2.annee){
            return true;
        }
        else if ( d1.annee == d2.annee){
            if (d1.mois > d2.mois){
                return true;
            }
            else if (d1.mois == d2.mois){
                if (d1.jour > d2.jour){
                    return true;
                }
            }
        }
        return false;
    }

    public void print_date(){
        System.out.println(this.jour + " " +nom_mois[this.mois] + " " + this.annee);
    }

    public static void main(String args []){
        Date d = new Date(1,1,2025);
        Date d2 = new Date(31,12,2024);
        System.out.println(d.precede(d, d2));
    }

}
