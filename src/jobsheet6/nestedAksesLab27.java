package jobsheet6;
import java.util.Scanner;

/**
 * nestedAksesLab27
 */
public class nestedAksesLab27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDiSanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;
        System.out.println("Apakah anda mahasiswa aktif (true/false)");
        mahasiswaAktif = input.nextBoolean();
        System.out.println("Apakah anda sedang di sanksi (true/false)");
        sedangDiSanksi = input.nextBoolean();
        System.out.println("Apakah anda punya izin dosen (true/false)");
        punyaIzinDosen = input.nextBoolean();
        System.out.println("Apakah anda asisten lab (true/false)");
        asistenLab = input.nextBoolean();
        if (mahasiswaAktif && !sedangDiSanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses lab diberikan");
                
            } else {
                System.out.println("Akses ditolak memerlukan izin dosen atau status asisten lab");
                
            }
            
        } else {
            System.out.println("Akses ditolak status mahasiswa aktif tidak terpenuhi");
            
        }
    }

    
}