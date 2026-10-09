package jobsheet3;
import java.util.Scanner;
public class mahasiswa27 {
    public static void main(String[] args) {
        Scanner Rom = new Scanner (System.in); 
        int lembarDoc;
        int biayaCetakperlembar = 500;
        int biayaJilid = 5000;
        int totalBiaya, totalBiayalembar;
        System.out.println("Masukkan berapa lembar dokumen anda: ");
        lembarDoc = Rom.nextInt();
        totalBiayalembar = lembarDoc * biayaCetakperlembar;
        totalBiaya = totalBiayalembar + biayaJilid;
        System.out.println("Total biaya cetak perlembar anda adalah: " + totalBiayalembar);
        System.out.println("Total biaya jilid anda adalah: " + biayaJilid);
        System.out.println("Total biaya anda adalah: " + totalBiaya);



    }

    
}