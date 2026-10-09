package Jobsheet5;
import java.util.Scanner;

/**
 * tugasAntrean27
 */
public class tugasAntrean27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. legalisir ijazah");
        System.out.println("2. Surat aktif kuliah");
        System.out.println("3. Pembayaran UKT");
        System.out.println("4. Pengajuan cuti akademik");
        System.out.println("Masukkan pilihan layanan anda (1/2/3/4): ");
        int layanan = input.nextInt();
        switch (layanan) {
            case 1:
                System.out.println("Untuk mengurus legalisir ijazah silahkan ke loket A");
                break;
            case 2:
                System.out.println("Untuk mengurus Surat aktif kuliah silahkan ke loket B");
                break;
            case 3:
                System.out.println("Untuk mengurus Pembayaran UKT silahkan ke loket C");
                break;
            case 4:
                System.out.println("Untuk mengurus Pengajuan cuti akademik silahkan ke loket D");
                break;
        
            default:
                System.out.println("Data input tidak valid");
                break;
        }
    }

    
}