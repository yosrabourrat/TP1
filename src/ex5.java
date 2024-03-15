import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {

        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nobmre entier: ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            fact *= i;
        }
        System.out.println("La factorielle de ce nombre est: " +fact);
    }
}