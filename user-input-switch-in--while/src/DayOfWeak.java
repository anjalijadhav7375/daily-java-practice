import java.util.Scanner;

public class DayOfWeak {
    public static void main(String[] args) {
        while (true) {
            System.out.println("provided any input");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("invalid input provided");
            }
            System.out.println("Do you want try more");
            Scanner sc1 = new Scanner(System.in);
            String yesorno = sc1.next();
            if (yesorno.equals("no")) {
                break;
            } else if (yesorno.equals("yes")) {
                continue;
            }
        }
    }
}