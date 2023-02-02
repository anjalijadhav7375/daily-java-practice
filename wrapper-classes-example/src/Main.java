public class Main {
    public static void main(String[] args) {
        int x = 20;
        Integer y = Integer.valueOf(x);// primitive int to Wrapper Integer
        Integer z = 20;//primitive int getting converted to Wrapper Integer automatically. -->Auto-Boxing

        Integer a = 100;
        int b = a.intValue();// Wrapper Integer to primitive int.
        int c = a;//Wrapper Integer getting converted to primitive int automatically. -->Auto-Un-Boxing
    }
}