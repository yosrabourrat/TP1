import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la valeur de a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez la valeur de b : ");
        double b = sc.nextDouble();
        // Déterminer le nombre de solutions
        if (a == 0) {
            if (b == 0) {
                System.out.println("L'équation a une infinité de solutions.");
            } else {
                System.out.println("L'équation n'a pas de solution.");
            }
        } else {
            // Calculer la valeur de x
            double x = -b/a;
            System.out.println("L'équation a une seule solution : x = " +x);
        }
    }
}