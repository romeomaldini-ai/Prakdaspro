package jobsheet3;
import java.util.Scanner;

public class LapanganBola27 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double panjang;
        double lebar;
        double luas;
        System.out.println("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar: ");
        lebar = input.nextInt();
        luas = panjang*lebar;
        System.out.println("Luas lapangan: " + luas);
    }
}