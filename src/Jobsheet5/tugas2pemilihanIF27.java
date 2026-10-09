package Jobsheet5;
import java.util.Scanner;

/**
 * tugas2pemilihanIF27
 */
public class tugas2pemilihanIF27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah sks anda: ");
        int jumlahSKS = input.nextInt();
        if (jumlahSKS > 24) {
            System.out.println("Melebihi batas");
            
        } 
        else {
            System.out.println("SKS valid");
            
        }
        
            
        }
    }

    
