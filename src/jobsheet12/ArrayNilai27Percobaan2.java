package jobsheet12;

import java.util.Scanner;

public class ArrayNilai27Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiakhir = new int[10];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            nilaiakhir[i] = sc.nextInt();
        }

        for (int nilai : nilaiakhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Nilai: " + nilai + " (" + status + ")");

            if (nilai > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("\nJumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}