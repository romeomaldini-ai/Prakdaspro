package jobsheet10;
import java.util.Scanner;

/**
 * tugassatu27
 */
public class tugassatu27 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int total = 0;

        System.out.print("Masukkan nilai n = ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                total++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);

        input.close();
    }
}