//à compiler avec java >= 21 en faisant
//javac --release 21 --enable-preview SqueletteTD.java 
//java --enable-preview SqueletteTD
import java.util.Scanner; //import scanner


int suivant(int n){
    return n+1;
}

void main(){
    int x= 3;
    int y = suivant(x);
    System.out.println(y); //Ou Ut.afficher(y) si le fichier Ut.java est présent dans le même dossier que ce fichier
    
    //exemple input utilisateur
    Scanner input = new Scanner(System.in); //création objet scanner 
    System.out.print("entrez un entier"); 
    int number = input.nextInt(); //attribution valeur scanner a la variable
    System.out.println("vous avez entrez " + number);
    
}
