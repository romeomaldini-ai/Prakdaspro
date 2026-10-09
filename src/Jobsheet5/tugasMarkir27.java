package Jobsheet5;
import java.util.Scanner;

/**
 * tugasMarkir27
 */
public class tugasMarkir27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lamaParkir;
        int lamaLebihan;
        int tarifDasar = 2000;
        int tarifLebih = 1000;
        int totalHarga;
        System.out.println("Masukkan lama parkir anda: ");
        lamaParkir = input.nextInt();
        if (lamaParkir <= 2) {
            System.out.println("Tarif parkir anda adalah: " + tarifDasar);
            
        } else {
            lamaLebihan = lamaParkir - 2;
            totalHarga = lamaLebihan * tarifLebih + tarifDasar;
            System.out.println("Tarif parkir anda adalah: " + totalHarga);
            
        }
    }

    
}