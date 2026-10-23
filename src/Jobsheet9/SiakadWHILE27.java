package Jobsheet9;
//P=27 MOD 10 + 15 =22
import java.util.Scanner;

/**
 * SiakadWHILE27
 */
public class SiakadWHILE27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai,jml,i=0;
        System.out.println("Masukkan jumlah mahasiswa" );
        jml = input.nextInt();
        


            
    
        while (i < jml) {
            System.out.println("Masukkan nilai mahasiswa ke " + (i+1) + ":");
            nilai = input.nextInt();

            if (nilai <0 || nilai >100) {
                System.out.println("Nilai tidak valid, masukkan ulang nilai");
                continue;
                
            }
            if (nilai > 85 && nilai <=100) {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah A");
                System.out.println("Bagus, pertahankan nilainya");
                
            }else if (nilai >73 && nilai<=85) {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah B+");
                
            }else if (nilai >65 && nilai <=73) {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah B");
            }else if (nilai >60 && nilai <=65) {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah C+");
                
            }else if (nilai >50 && nilai <=60) {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah C");
                
            }else if (nilai >39 && nilai <=50) {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah D");
                
            }else {
                System.out.println("Nilai mahasiswa ke " + (i+1) + "adalah E");
                
            }
            i++;

            
        }
    }

    
}
