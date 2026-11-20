package jobsheet12;

import java.util.Scanner;

public class Arrayratanilai27percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaimhs = new int[10];
        int total = 0;
        double ratarata;
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke " + (i+1));
            nilaimhs [i] = sc.nextInt();
            total += nilaimhs[i];
            
        }
        ratarata = (double) total / nilaimhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata rata: " + ratarata);
        int tertinggi = nilaimhs[0];
        int terendah = nilaimhs [0];
        for (int i = 0; i < nilaimhs.length; i++) {
            if (nilaimhs[i] > tertinggi) {
                tertinggi = nilaimhs[i];
            }
            if (nilaimhs[i] < terendah) {
                terendah = nilaimhs[i];
                
            }
        }
        System.out.println("Nilai Tertinggi adalah " + tertinggi);
        System.out.println("Nilai terendah adalah" + terendah);
        if (ratarata >= 85) {
            System.out.println("Sangat baik");
            
        }
        if (ratarata >= 70) {
            System.out.println("Baik");
            
        }
        if (ratarata <70) {
            System.out.println("Perlu pendampingan");
        }
    }
    
}
