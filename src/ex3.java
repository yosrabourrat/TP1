import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la valeur de a : ");
        int a = sc.nextInt();
        System.out.print("Entrez la valeur de b : ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Après permutation :");
        System.out.println("a = " +a+ " et b = " +b);
    }
}