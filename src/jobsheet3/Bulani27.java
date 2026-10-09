package jobsheet3;
import java.util.Scanner;

public class Bulani27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga;
        double diskon = 0.15;
        double besarDiskon;
        double totalHarga;
        System.out.println("Masukkan harga: ");
        harga = input.nextDouble();
        totalHarga = harga - besarDiskon;
        besarDiskon = diskon * harga;
        System.out.println("Total harga adalah: " + totalHarga);
        

    }
}