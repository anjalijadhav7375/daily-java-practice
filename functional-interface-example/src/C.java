public class C implements FunctionalInterfaceExample{
    @Override
    public void printElements() {
        System.out.println("C");
    }

    @Override
    public void sayHello() {
        FunctionalInterfaceExample.super.sayHello();
    }
}
