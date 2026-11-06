package jobsheet10;
//3+pmod 5 = 3 + 2 = 5
//9+pmod 5 = 9 + 2 = 11
import java.util.Scanner;

/**
 * Star27
 */
/**
 * star27
 */
public class star27 {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Masukkan nilai N = ");
        n = input.nextInt();
        for (i = 1; i < n; i+= 2) {
            System.out.print(i + "");
            
        }
        System.out.println();
        input.close();

    }

    
}