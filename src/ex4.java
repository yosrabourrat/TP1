import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un réel x : ");
        double x = sc.nextDouble();
        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();
        double resultat = Math.pow(x,n);
        System.out.println(x+ " à la puissance " +n+ " est : " +resultat);
    }
}