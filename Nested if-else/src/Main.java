import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
           This program demos the use of nested if-else
           x=20;
         */
        /*
        Take input from user (from console)
        Read from user
         */

        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 20){
            System.out.println("x > 20");
            if (x > 40){
                System.out.println("x > 40");
            }else {
                System.out.println("x < 40");
            }
        }else {
            System.out.println("x < 20");
        }
    }
}