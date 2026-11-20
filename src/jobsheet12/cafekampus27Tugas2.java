package jobsheet12;

import java.util.Scanner;

public class cafekampus27Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            boolean ditemukan = false;

            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            String key = sc.nextLine();

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(key)) {
                    pesanan[i] = menu[j];
                    total += harga[j];

                    System.out.println("Menu ditemukan. Harga: Rp" + harga[j]);
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Menu tidak tersedia. Silakan input ulang.");
                i--;
            }
        }

        System.out.println("\n===== STRUK PEMESANAN =====");

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }

        System.out.println("---------------------------");
        System.out.println("Total biaya: Rp" + total);
        System.out.println("===========================");
    }
}