package Td8;

public class Voiture {

    private String nom;
    private int vitesse;
    public int position;



    public Voiture(String n, int v){
        this.nom = n;
        this.vitesse = v;
        this.position = 0;
    }

    public String print_position(){
        return "" + this.position;
    }

    public String toString(){
        return ("La voiture " + nom + " a une vitesse de: " + vitesse);
    }

    public String toString2(){
        String espace = "";
        for (int i = 0; i < this.position; i++) {
            espace += " ";
        }
        return espace + this.nom.charAt(0) + "\n";
    }

    public String leNom(){
        return this.nom;
    }

    public boolean depasse(int limite){
        return this.position >= limite;
    }

    public void avance(){
        this.position += this.vitesse;
    }

    public void auDepart(){
        this.position = 0;
    }
    
}
