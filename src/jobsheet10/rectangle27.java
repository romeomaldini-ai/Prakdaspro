package jobsheet10;
import java.util.Scanner;

/**
 * rectangle27
 */
public class rectangle27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris,kolom;
        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("masukkan kolom anda: ");
        kolom = input.nextInt();
    for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
            System.out.print("#");
            
        }
        System.out.println("#");
    }
    input.close();

    
}
}