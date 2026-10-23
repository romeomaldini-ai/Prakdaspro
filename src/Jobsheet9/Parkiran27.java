//P Mod 6 = 3 * 250 + 2500 = 3.250
//P mod 6 = 3 *250 +1500 =2.250
package Jobsheet9;

import java.util.Scanner;

public class Parkiran27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Input jenis kendaraan (1: mobil, 2: motor, 0: keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Input durasi parkir (jam): ");
                durasi = input.nextInt();

                
                if (jenis == 1) {
                    total += durasi * 3250; 
                } else {
                    total += durasi * 2250; 
                }
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);

        input.close();
    }
}
