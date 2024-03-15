import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la valeur de a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez la valeur de b : ");
        double b = sc.nextDouble();
        System.out.print("Entrez la valeur de c : ");
        double c = sc.nextDouble();

        // Calcul du discriminant
        double discriminant = b*b-4*a*c;

        if (a == 0) {
            System.out.println("Ce n'est pas une équation du second degré.");
        } else if (discriminant > 0) {
            double solu1 = (-b + Math.sqrt(discriminant) )/ (2 * a);
            double solu2 = (-b - Math.sqrt(discriminant) )/ (2 * a);
            System.out.println("L'équation a deux solutions réelles :");
            System.out.println("x1 = " +solu1);
            System.out.println("x2 = " +solu2);
        } else if (discriminant == 0) {
            double solution = -b / (2 * a);
            System.out.println("L'équation a une seule solution réelle : x = " +solution);
        } else {   // Cas du discriminant négatif
            System.out.println("L'équation n'a pas de solution réelle.");
        }
    }
}