package Jobsheet9;
//P mod 6= 3 *2000 + 40000 = 46.000 
import java.util.Scanner;

/**
 * BioskopFOR27
 */
public class BioskopFOR27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 46000;
        double tiket,totalHargatiket = 0,pelanggan,totalsemuatiket = 0;
        double diskon,hargadiskon;
        System.out.println("Masukkan jumlah pelanggan: ");
        pelanggan = input.nextInt();
        for (int i = 1; i <= pelanggan; i++) {
            tiket = 0;
            System.out.println("Pelanggan ke " + i + " ");
            System.out.println("Masukkan jumlah tiket anda: ");
            tiket = input.nextInt();
           if (tiket >3 && tiket <=11) {
            diskon =0.1;
            hargadiskon = hargaTiket * diskon;
            totalHargatiket = tiket*hargaTiket-hargadiskon; 
            System.out.println("Selamat mendapatkan diskon 10%");
           } else if (tiket >11) {
            diskon = 0.18;
            hargadiskon = hargaTiket * diskon;
            totalHargatiket = tiket*hargaTiket-hargadiskon;
            System.out.println("Selamat mendapatkan diskon 18%");
            
           }else if (tiket <0) {
            System.out.println("Input tidak valid silahkan input lagi");
            break;
           } 
            
           

         
        }
        
        System.out.println("Total harga anda adalah: " + totalHargatiket);
        System.out.println("Total harga tiket hari ini adalah: " + totalHargatiket*pelanggan);
    }   

    
}
