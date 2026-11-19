package jobsheet10;

import java.util.Scanner;

/**
 * uji
 */
public class uji {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int jumlahMahasiswa;
        int nilai;
        double rataratanilai;
        double nilaitertinggi,nilaiterendah,jumlahmahasiswatuntas;
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        System.out.println("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();

        
        
        if (nilai <0 || nilai >100) {
            System.out.println("tidak valid");
        }
        for ( int i = 0; i < jumlahMahasiswa; i++) {
         
            do {
            
            
            } 
            while (nilai >0 || nilai <100);
            nilai ++;
           
            
            
            
        
            
            
        }


    }
    
}