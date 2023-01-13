import java.util.ArrayList;
import java.util.List;

/**
 * Functional interface
 */
interface FunctionalInterfaceExample{
    int display(int a);
}

/**
 * class implementing functional interface
 */
//class Test implements FunctionalInterfaceExample{
//    @Override
//    public int display(int a) {
//        return 0;
//    }
//}




public class Main {
    public static void main(String[] args) {
        //FunctionalInterfaceExample functionalInterfaceExample = a -> a*a;
        //lambda expression can be use for providing method implementation for functional interface
        FunctionalInterfaceExample functionalInterfaceExample= a -> {
            System.out.println("Inside display method");
            return a*a;
        };//this is implementation of display method
        int result = functionalInterfaceExample.display(10);
        System.out.println("Result from display method: " +result);

        //Another example of lambda expression
        List<String> guesList = new ArrayList<>();
        guesList.add("Anjali");
        guesList.add("Rutuja");
        guesList.add("Pravin");

        //Print all elements of guestList using for loop
        for(String guestName:guesList) {
            System.out.println(guesList);
        }
        //Print all elements of guestList using forEach loop and lambda Expression
        guesList.forEach(guestName-> System.out.println(guesList));
    }
}