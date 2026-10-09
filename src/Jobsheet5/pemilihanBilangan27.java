package Jobsheet5;
import java.util.Scanner;

/**
 * pemilihanBilangan27
 */
public class pemilihanBilangan27 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angka;
    System.out.println("Masukkan angka: ");
    angka = input.nextInt();
    if (angka % 2 == 0)
    {
        System.out.println("Angka" + angka + "Termasuk bilangan genap");
    }
    else
    {
        System.out.println("Angka" + angka + "Termasuk bilangan ganjil");
    }


}
    
}


    