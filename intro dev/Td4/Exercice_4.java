package Td4;

public class Exercice_4 {
    public static void main(String[] args){
        System.out.println("");
        System.out.print("Saisissez un mot: ");
        estPalindrome(Ut.saisirChaine());
    }

    static boolean estPalindrome(String mot){
        int a = mot.length();

        // comapre caractères opposés
        for (int i = 0; i < a / 2; i++) {
            if (mot.charAt(i) != mot.charAt(a - i - 1)) {
                System.out.println(mot+" n'est pas un palindrome");
                return false; 
            }
        }
        System.out.println(mot+" est un palindrome");
        return true; 
    }
}