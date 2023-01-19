public class Main {
    static void swap(int a , int b){
        int tem = a;
        a=b;
        b=tem;
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swap:" + "\n x = " + x + " y = " + y );//x(reference or pointer) holds address of "X" object
        swap(x,y);//values of x and y pass to swap method
        System.out.println("After swap: " + " \nx = " + x + " y = " + y);//y(reference or pointer) also holds address of "Y" object
    }
}