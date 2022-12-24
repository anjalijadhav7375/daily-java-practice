import java.util.concurrent.Callable;

public class ComplexDriver {
    public static void main(String[] args) {
        Complex c1 = new Complex(10,15);
        Complex c2 = new Complex(c1);
        c1.displayComplexNumber();
        c2.displayComplexNumber();
    }
}
