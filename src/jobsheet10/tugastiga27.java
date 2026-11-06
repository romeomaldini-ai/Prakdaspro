package jobsheet10;
import java.util.Scanner;

/**
 * tugastiga27
 */
public class tugastiga27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahToko;
        int totalPelanggan = 0;
        int totalBarangSemua = 0;

        int barangTerbanyak = -1;
        int tokoTerbanyak = 1;

        System.out.print("Masukkan jumlah toko: ");
        jumlahToko = input.nextInt();

        while (jumlahToko < 1) {
            System.out.print("Jumlah toko minimal 1, masukkan lagi: ");
            jumlahToko = input.nextInt();
        }

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;
            int totalBarangToko = 0;

            System.out.print("\nMasukkan jumlah pelanggan toko " + i + ": ");
            jumlahPelanggan = input.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.print("Jumlah pelanggan tidak boleh negatif, masukkan lagi: ");
                jumlahPelanggan = input.nextInt();
            }

            totalPelanggan = totalPelanggan + jumlahPelanggan;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;

                System.out.print("Pelanggan " + j + " membeli berapa barang? ");
                jumlahBarang = input.nextInt();

                while (jumlahBarang < 0) {
                    System.out.print("Jumlah barang tidak boleh negatif, masukkan lagi: ");
                    jumlahBarang = input.nextInt();
                }

                totalBarangToko = totalBarangToko + jumlahBarang;
            }

            totalBarangSemua = totalBarangSemua + totalBarangToko;

            System.out.println("Toko " + i + " - pelanggan: " 
                    + jumlahPelanggan + ", total barang: " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\nTotal pelanggan seluruh toko: " + totalPelanggan);
        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        input.close();
    }
}