import java.util.Scanner;

public class RekapPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahRuang;
        int jumlahHari;

        int totalSeluruh = 0;
        int jumlahHariRamai = 0;

        int totalTertinggi = -1;
        int ruangTeramai = 0;

        System.out.print("Jumlah ruang baca: ");
        jumlahRuang = sc.nextInt();

        System.out.print("Jumlah hari: ");
        jumlahHari = sc.nextInt();

        if (jumlahRuang <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah ruang dan hari harus > 0.");

        } else {

            for (int ruang = 1; ruang <= jumlahRuang; ruang++) {

                int hari = 1;
                int totalRuang = 0;

                System.out.println("Ruang " + ruang);

                while (hari <= jumlahHari) {

                    int pengunjung;

                    do {
                        System.out.print("Pengunjung hari ke-" + hari + ": ");
                        pengunjung = sc.nextInt();

                        if (pengunjung < 0) {
                            System.out.println("Tidak boleh negatif!");
                        }

                    } while (pengunjung < 0);

                    totalRuang += pengunjung;
                    totalSeluruh += pengunjung;

                    if (pengunjung > 50) {
                        jumlahHariRamai++;
                    }

                    hari++;
                }

                double rataRata = (double) totalRuang / jumlahHari;

                System.out.println("Total ruang: " + totalRuang);
                System.out.println("Rata-rata: " + rataRata);

                if (totalRuang > totalTertinggi) {
                    totalTertinggi = totalRuang;
                    ruangTeramai = ruang;
                }
            }

            System.out.println("====================");
            System.out.println("Total seluruh pengunjung: " + totalSeluruh);
            System.out.println("Ruang paling ramai: " + ruangTeramai);
            System.out.println("Jumlah hari ramai: " + jumlahHariRamai);
        }

        sc.close();
    }
}