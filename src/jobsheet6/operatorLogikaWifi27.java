package jobsheet6;
import java.util.Scanner;

/**
 * operatorLogikaWifi27
 */
public class operatorLogikaWifi27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiBlokir;
        System.out.println("Apakah anda mahasiswa (true/false)");
        mahasiswa = input.nextBoolean();
        System.out.println("Apakah pengguna dosen (true/false)");
        dosen = input.nextBoolean();
        System.out.println("Apakah akun anda diblokir (true/false)");
        akunDiBlokir = input.nextBoolean();
        if ((mahasiswa && dosen) && !akunDiBlokir) {
            System.out.println("Akses WIFI diberikan");
        }
        else {
            System.out.println("Akses WIFI ditolak");
        }
    }

    
}