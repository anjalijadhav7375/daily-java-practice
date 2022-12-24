import java.util.concurrent.Callable;

public class CalDriver {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.num1 = 100;
        myCal.num2 = 200;
        int res = myCal.addition();
        System.out.println(res);
        int sub = myCal.subs();
        System.out.println(sub);
        int mul = myCal.mul();
        System.out.println(mul);
        int div = myCal.div();
        System.out.println(div);
        int modDivision = myCal.modDivision();
        System.out.println(modDivision);
        Calculator.name="calculator";
        Calculator.display();
    }
}
