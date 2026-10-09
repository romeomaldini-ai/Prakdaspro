package jobsheet3;
import java.util.Scanner;
public class UmrKaryawan_27 {
    public static void main(String[] args) {
        Scanner rom = new Scanner(System.in);
        int gajiPokok;
        double bonus; 
        int totGaji;

        double tunjTransp = 600000;
        double tunjMkn = 400000;
        System.out.println("Masukkan gaji anda: " );

        gajiPokok = rom.nextInt();
        bonus= 0.05*gajiPokok;
        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1*gajiPokok));

        System.out.println("Bonus bulanan adalah: " + bonus);
        System.out.println("Gaji anda adalah: " + totGaji);
    }

    
}