package jobsheet12;

import java.util.Scanner;

public class Pengolaannilaimahasiswa27Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilaiakhir = new int[jumlah];
        int total = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiakhir[i] = sc.nextInt();
            total += nilaiakhir[i];
        }

        double rataRata = (double) total / jumlah;
        int tertinggi = nilaiakhir[0];
        int terendah = nilaiakhir[0];

        for (int nilai : nilaiakhir) {
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("\n=== HASIL PENGELOLAAN NILAI ===");

        for (int i = 0; i < nilaiakhir.length; i++) {
            String status = (nilaiakhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiakhir[i] + " (" + status + ")");
        }

        System.out.println("\nTotal nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}