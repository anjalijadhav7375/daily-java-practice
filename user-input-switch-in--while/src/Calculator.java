public class Calculator {
    /*
    num1: int
    num2: int
    //Properties or methods
    Addition():int
    Subs():int
    Mul(): int
    Div(): int
    ModDivision(): int
     */

    int num1;
    int num2;
    public static String name = "Calculator";
    int addition(){
        int result=num1+num2;
        return result;
    }
    int subs(){
        int result=num1-num2;
        return result;
    }
    int mul(){
        int result=num1*num2;
        return result;
    }
    int div(){
        int result=num1/num2;
        return result;
    }
    int modDivision(){
        int result=num1%num2;
        return result;
    }
    static void display(){
        System.out.println("Hello from static method "+name);
    }
}