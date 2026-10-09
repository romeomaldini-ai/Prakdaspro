package jobsheet3;
import java.util.Scanner;
public class utangAli27 {
    public static void main(String[] args) {
        Scanner Rom = new Scanner (System.in);
        int hargaLaptop, uanglunas, bulan;
        double hargaSisa;
        double bunga = 0.02;
        double jumlahCicilan;
        double totalBunga;
        double jumlahCicilanBulanan;
        System.out.println("Masukkan harga laptop anda: ");
        hargaLaptop = Rom.nextInt();
        System.out.println("Masukkan uang yang anda bayarkan: ");
        uanglunas = Rom.nextInt();
        System.out.println("Masukkan lama bulan: ");
        bulan = Rom.nextInt();

        

        hargaSisa = hargaLaptop - uanglunas;
        totalBunga = bunga * hargaSisa;
        jumlahCicilan = hargaSisa /bulan;
        jumlahCicilanBulanan = jumlahCicilan + totalBunga;
        

        System.out.println("jumlah cicilan anda: " + jumlahCicilan);
        System.out.println("Jumlah cicilan perbulan anda adalah: " +jumlahCicilanBulanan);



        
    }

    
}