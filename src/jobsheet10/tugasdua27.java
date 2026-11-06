package jobsheet10;
import java.util.Scanner;

/**
 * tugasdua27
 */
public class tugasdua27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int hasil;
        int jumlah = 0;

        System.out.print("Masukkan nilai n = ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlah = jumlah + hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);

        input.close();
    }
}