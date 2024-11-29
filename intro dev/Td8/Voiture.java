package Td8;

public class Voiture {

    private String nom;
    private int vitesse;
    public int position;
    private Boolean sens = true;
    private int count = 0;



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

    public boolean depasse(){
        if (sens){ 
            return this.position > Course.longueur_piste;
        }
        else {
            return this.position < 0;
        }
        
    }

    public void avance(){
        int longueur = Course.longueur_piste;
        int k = Course.k;
        if (sens){
            if ( (this.position + this.vitesse) > longueur ){
                this.count += 1;
                if (this.count == k){
                    this.position += this.vitesse;
                    return;
                }
                else{
                    int x = longueur -= this.position;
                    this.position += x;
                    this.position -= (this.vitesse - x);
                    this.sens = !this.sens;
                }
            }
            else{
                this.position += this.vitesse;
            }
        }
        else{
            if ( (this.position - this.vitesse) < 0 ){
                this.count += 1;
                if (this.count == k){
                    this.position -= this.vitesse;
                    return;
                }
                else{
                    int x = 0 + this.position;
                    this.position -= x;
                    this.position += (this.vitesse - x);
                    this.sens = !this.sens;
                }
            }
            else{
                this.position -= this.vitesse;
            }
        }

        


    }

    public void auDepart(){
        this.position = 0;
    }
    
}
