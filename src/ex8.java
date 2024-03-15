import java.util.Scanner;

public class ex8 {
    public static int PGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int int1 = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int int2 = sc.nextInt();
        // Appel de la fonction
        int resultat = PGCD(int1, int2);

        // Affichage
        System.out.println("Le PGCD de " + int1 + " et " + int2 + " est : " + resultat);
    }
}