import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le rayon du cercle : ");
        double rayon = sc.nextDouble();
        double perimetre = 2 * Math.PI * rayon;
        double surface = Math.PI * Math.pow(rayon,2);
        //Affichage:
        System.out.println("Le périmètre du cercle est : " + perimetre);
        System.out.println("La surface du cercle est : " + surface);
    }
}