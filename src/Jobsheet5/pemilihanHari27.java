package Jobsheet5;
import java.util.Scanner;

/**
 * pemilihanHari27
 */
public class pemilihanHari27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayName,dayType;
        System.out.println("Masukkan hari: ");
        dayName = input.nextLine();
        switch (dayName. toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekDay";
                
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
        
            default:
                dayType = "Invalid";
                break;
        }
        System.out.println(dayName + "is a" + dayType);
        
    }

    
}