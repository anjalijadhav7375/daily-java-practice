import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        System.out.println("Enter The Number That U Want to Print Star: ");
        Scanner r=new Scanner(System.in);
        int row=r.nextInt();

        int i = 1, j = 1;
        while (i <= row) {
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}
