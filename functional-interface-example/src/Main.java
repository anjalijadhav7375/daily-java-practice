public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample a = new A();
        FunctionalInterfaceExample b = new B();
        FunctionalInterfaceExample c = new C();

        a.printElements();
        a.sayHello();

        b.printElements();
        b.sayHello();

        c.printElements();
        c.sayHello();
    }
}