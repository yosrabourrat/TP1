import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int int1 = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int int2 = sc.nextInt();
        // Calculs
        int somme = int1 + int2;
        int difference = int1 - int2;
        int produit = int1 * int2;
        double division = int1/int2;
        // Affichage des résultats
        System.out.println("Somme : " +somme);
        System.out.println("Différence : " +difference);
        System.out.println("Produit : " +produit);
        System.out.println("Quotient : " +division);
    }
}