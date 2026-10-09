package jobsheet6;
import java.util.Scanner;

public class tugas1DiskonBuku27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P = 27; //Nomor Absen
        double diskon;
        String jenisBuku;
        int jumlah;

        System.out.print("Input buku yang ingin anda akan beli(kamus/novel/lain): ");
        jenisBuku = input.nextLine().toLowerCase();

        System.out.print("Jumlah buku yang anda beli ");
        jumlah = input.nextInt();

        if (jenisBuku.equals("kamus")) {
            diskon = 8 + (P % 5);
            if(jumlah > (2+(P % 2))){
                diskon +=2;
            }
        } else {
            if (jenisBuku.equals("novel")) {
                diskon = 5 + (P % 4);

                if (jumlah > (3+ (P % 2))) {
                    diskon +=2;
                } else {
                    diskon +=1;
                }
            } else {
                if (jumlah > (3+(P % 2))) {
                    diskon = 3 + (P % 4);
                } else {
                    diskon = 0;
                }
            }
        }
        System.out.println("Jenis buku yang anda beli adalah: " +jenisBuku);
        System.out.println("Jumlah buku yang anda beli adalah: " +jumlah);
        System.out.println("Diskon yang anda dapatkan adalah: " +diskon+ "%");

        input.close();
    }
}
