import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        int n;
        int i,j,k;      //* i=row,j=columns,k=space
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();
        i =1;
        while (i<=n){
           k=1;
           while (k<=(i-1)){
               System.out.print(" ");
               k++;
           }
           j=i;
           while (j<=n){
               System.out.print("*");
               j++;
           }
            System.out.println();
           i++;
        }

    }
}
