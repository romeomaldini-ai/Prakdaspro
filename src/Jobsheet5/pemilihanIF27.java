package Jobsheet5;
import java.util.Scanner;

/**
 * pemilihanIF27
 */
public class pemilihanIF27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------Cetak KRS-----");
        System.out.print("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = input.nextBoolean();

        //String pesan = uktLunas ? "Pembayaran UKT terverifikasi,silahkan minta tanda tangan DPA":"Data tidak valid, Silahkan lunasi UKT dulu";
        //System.out.println(pesan);
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan minta tanda tangan DPA");
            
        } else {
            System.out.println("Registrasi ditolak,silahkan lunasi ukt dulu");
            
        }
        

            
        }
    }

    
