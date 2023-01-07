import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the second value");
        int b = scanner1.nextInt();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException caught");
        }
        System.out.println("after dividing a/b");
    }
}
