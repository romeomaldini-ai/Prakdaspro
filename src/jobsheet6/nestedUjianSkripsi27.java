package jobsheet6;
import java.util.Scanner;

/**
 * nestedUjianSkripsi27
 */
// P1 = 6 + ( 27 % 5 ) = 2 + 6 = 8
// P2 = 3 + ( 27 % 3) = 0 + 3 = 3
public class nestedUjianSkripsi27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pesan;
        System.out.println("Apakah mahasiswa bebas kompen? (ya/tidak)");
        String bebasKompen = input.nextLine().trim();
        System.out.println(" Masukkan jumlah log bimbingan dengan dospem 1");
        int bimbinganP1 = input.nextInt();
        System.out.println("Masukkan jumlah log bimbingan dengan dospem 2");
        int bimbinganP2 = input.nextInt();
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >=8 && bimbinganP2 >=3) {
                pesan = "Semua Syarat terpenuhi Mahasiswa boleh menendaftar ujian skripsi";

                
            } else if (bimbinganP1 < 8 && bimbinganP2 < 3){
                pesan = "Gagal! log bimbingan 1 kurang dari 8 kali dan bimbingan 2 kurang dar 3 kali";
                
            }
              else if (bimbinganP1 < 8) {
                pesan = "Gagal bimbingan 1 belum mencapai 8 kali";
            
              }
              else {
                pesan = "Gagal LOg karena bimbingan 2 belum 3 kali";
              }
            
        } else {
            pesan = "Gagal mahasiswa masih memiliki kompen";
            
        }

        System.out.println( pesan );
    }

    
} 