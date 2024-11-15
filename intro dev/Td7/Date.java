package Td7;

public class Date {

    private int jour;
    private int mois;
    private int annee;
    private static String[] nom_mois = {"apagnan","janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};
    private static String[] jour_semaine = {"Samedi", "Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi"};
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

    public String print_date(){
        return (this.jour + " " +nom_mois[this.mois] + " " + this.annee);
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

    public boolean is_before(Date d1, Date d2){
        if (d1.annee < d2.annee){
            return true;
        }
        else if ( d1.annee == d2.annee){
            if (d1.mois < d2.mois){
                return true;
            }
            else if (d1.mois == d2.mois){
                if (d1.jour < d2.jour){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean is_after(Date d1, Date d2){
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

    public int day_count(Date d1, Date d2){
        if (this.is_equal(d1, d2)){
            return 0;
        }

        if (this.is_before(d1, d2)){
            int count = 0;
            while (!this.is_equal(d1, d2)){
                d1.day_increment();
                count ++;
            }
            return count;
        }

        else{
            int count = 0;
            while (!this.is_equal(d1, d2)){
                d2.day_increment();
                count ++;
            }
            return count;
        }
    }

    public int week(){
        int jour = this.jour;
        int mois = this.mois;
        int annee = this.annee;

      if (this.mois == 1) {
         mois = 13;
         annee -= 1;
    } else if (this.mois == 2) {
         mois = 14;
         annee -= 1;
    }

    int q = jour;
    int m = mois;
    int K = annee % 100; // Les deux derniers chiffres de l'année
    int J = annee / 100; // Les deux premiers chiffres de l'année

    // formule de Zeller
    int f = q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J;
    int j_sem = ((f % 7) + 7) % 7; // Modulo 7 pour obtenir le jour de la semaine

    return j_sem;
    }

    public static void main(String args[]){

        System.out.println(" ");

        Date d = new Date(26,03,2005);
        System.out.println("date d1 = " + d.print_date());
        
        Date d2 = new Date(14,11,2024);
        System.out.println("date d2 = " + d2.print_date());

        System.out.println(" ");

        System.out.println("d1 est égal a d2? " + d.is_equal(d, d2));
        System.out.println("d1 est avant d2? " + d.is_before(d, d2));
        System.out.println("d1 est après d2? " + d.is_after(d, d2));

        System.out.println(" ");
        
        System.out.println("le " + d.print_date() +" est un " + Date.jour_semaine[d.week()]);

    }

}
