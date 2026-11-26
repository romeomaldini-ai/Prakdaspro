package coba;

import java.util.Scanner;

public class matdas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String input = sc.nextLine();

        int total = input.length();
        long hasil = faktorial(total);

        boolean[] sudahDihitung = new boolean[total];

        for (int i = 0; i < total; i++) {
            if (!sudahDihitung[i]) {
                int jumlah = 0;

                for (int j = 0; j < total; j++) {
                    if (input.charAt(i) == input.charAt(j)) {
                        jumlah++;
                        sudahDihitung[j] = true;
                    }
                }

                hasil = hasil / faktorial(jumlah);
            }
        }

        System.out.println("Jumlah string berbeda: " + hasil);

        sc.close();
    }

    static long faktorial(int n) {
        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        return hasil;
    }
}

