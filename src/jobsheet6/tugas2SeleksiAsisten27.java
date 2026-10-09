package jobsheet6;
import java.util.Scanner;

public class tugas2SeleksiAsisten27
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P = 27; //nomor absen
        int syaratDP = 75 + (P % 11);
        int syaratNilai_Interview = 70 + (P % 11);
        int nilaiDaspro, nilaiWawancara;
        boolean hukuman;
        boolean mahasiswaaktif; 
        boolean sertifikat;

        System.out.print("Apakah anda mahasiswa aktif: ");
        mahasiswaaktif = input.nextBoolean();
        System.out.print("Apakah mahasiswa sedang menjalani masa sanksi akademik (true/false): ");
        hukuman = input.nextBoolean();

        System.out.print("Silahkan input nilai Dasar Pemrograman: ");
        nilaiDaspro =input.nextInt();
        System.out.print("Apakah mahasiswa memiliki sertifikat kompetensi pemrograman? (true/false): ");
        sertifikat = input.nextBoolean();

        System.out.print("Masukkan nilai wawancara mahasiswa: ");
        nilaiWawancara = input.nextInt();

        if (mahasiswaaktif && !hukuman) {
            
        
            if (nilaiDaspro >= syaratDP || sertifikat) {
                if (nilaiWawancara >= syaratNilai_Interview) {
                    System.out.println("Anda diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal. Nilai wawancara anda kurang dari " +syaratNilai_Interview);
                }
            } else {
                System.out.println("Gagal. Nilai Dasar Pemrograman anda kurang dari " +syaratDP+ " dan anda tidak memiliki sertfikat kompetensi");
            }
        } else {
            System.out.println("Gagal. Mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik");
        }
        input.close();
    }
}
