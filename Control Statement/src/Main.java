import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        This program demos the use of switch cose
         */

        System.out.println("Enter any day of weak:");
        Scanner sc = new Scanner(System.in);
        String day = sc.next().toLowerCase();
        System.out.println("User input" + day);

        switch (day){
             case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "thursday":
                System.out.println("Today is Thursday");
                break;
            case "friday":
                System.out.println("Today is Friday");
                break;
            case "saturday":
                System.out.println("Today is Saturday");
                break;
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Wrong input provided by user");


        }

    }
}