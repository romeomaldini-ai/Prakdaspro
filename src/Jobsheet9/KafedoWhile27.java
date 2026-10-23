package Jobsheet9;
//P=27
//P mod 5 = 2 *1000 + 10000 = 12000
//P mod 4 = 3 * 1000 + 5000 = 8000
// P mod 6 = 3 * 1000 + 15000 = 18000

import java.util.Scanner;

/**
 * KafedoWhile27
 */
public class KafedoWhile27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roti,kopi,teh;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 8000, hargaRoti = 18000;
        int totalHarga;
        do {
            System.out.println("Masukkan nama penlanggan (ketik 'Batal' untuk keluar) ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("Batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
                
            }
            System.out.println("Jumlah kopi:");
            kopi = input.nextInt();
            System.out.println("Jumlah teh: ");
            teh = input.nextInt();
            System.out.println("Jumlah roti: ");
            roti = input.nextInt();
            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Jumlah total harga anda dalah: " + totalHarga);
            input.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai");
    }

    
}