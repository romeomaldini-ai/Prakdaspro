package Jobsheet9;

//P=27
//PMOD5+8 = 10
//p mod 11 + 55 = 60
import java.util.Scanner;

/**
 * SiakadFor27
 */
public class SiakadFOR27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100, bataskelulusan;
        int batasnilailulus = 60;
        int jumlahlulus = 0;
        int jumlahtidaklulus = 0;


        for (int i = 1; i<=10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
                
            }
            if (nilai < terendah) {
                terendah =  nilai;
                
            }
            if (nilai>batasnilailulus) {
                jumlahlulus++;
                
            } else{
                jumlahtidaklulus++;
            }

            
            
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai terendah adalah: " + terendah);
        System.out.println("Jumlah siswa yang memiliki nilai di bawah kkm (<60) dan dinyatakan tidak lulus adalah: " + jumlahtidaklulus);
        System.out.println("Jumlah siswa yang nilainya melebihi kkm (>60) dinyatakan lulus adalah: " + jumlahlulus);
    }

    
}