import java.util.Scanner;

/**
 * pemesanantiket
 */
public class pemesanantiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisKendaraan;
        String bis;
        String kereta;
        String pesawat;
        int hargaDasarBis = 50000;
        int hargaDasarKereta = 100000;
        int hargaDasarPesawat = 500000;
        int umur;
        double totalDiskon;
        double diskon;
        double totalHarga;

        
        System.out.println("Masukkan jenis tiket kendaraan anda: ");
        jenisKendaraan = input.nextLine();

        System.out.println("Masukkan umur anda: ");
        umur = input.nextInt();


        switch (jenisKendaraan.toLowerCase()) {
            case "bis":
                if (umur <=12 && umur >=0) {
                    diskon = 0.3;
                    totalDiskon = hargaDasarBis * diskon;
                    totalHarga = hargaDasarBis - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                    
                }
                else if (umur >=12 && umur <=59) {
                    diskon = 0;
                    totalDiskon = hargaDasarBis * diskon;
                    totalHarga = hargaDasarBis - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                }
                else {
                    diskon = 0.2;
                    totalDiskon = hargaDasarBis * diskon;
                    totalHarga = hargaDasarBis - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                }
                break;
            case "kereta":
                if (umur <=12 && umur >=0) {
                    diskon = 0.3;
                    totalDiskon = hargaDasarKereta * diskon;
                    totalHarga = hargaDasarKereta - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                    
                }
                else if (umur >=12 && umur <=59) {
                    diskon = 0;
                    totalDiskon = hargaDasarKereta * diskon;
                    totalHarga = hargaDasarKereta - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );

                    
                }
                else {
                    diskon = 0.2;
                    totalDiskon = hargaDasarKereta * diskon;
                    totalHarga = hargaDasarKereta - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                }
                break;
                case "pesawat":
                if (umur <=12 && umur >=0) {
                    diskon = 0.3;
                    totalDiskon = hargaDasarPesawat * diskon;
                    totalHarga = hargaDasarPesawat - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                    
                }
                else if (umur >=12 && umur <=59) {
                    diskon = 0;
                    totalDiskon = hargaDasarPesawat * diskon;
                    totalHarga = hargaDasarPesawat - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );

                    
                }
                else {
                    diskon = 0.2;
                    totalDiskon = hargaDasarPesawat * diskon;
                    totalHarga = hargaDasarPesawat - totalDiskon;
                    System.out.println("Total harga anda adalah: " + totalHarga + "Total diskon anda adalah: " + totalDiskon );
                }
                
                break;
        
            default:
                break;
        }
        

    }
}
        