public class MachineDriver {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.powerOn();
        laptop.dipalyDocument();
        laptop.powerOff();

        Printer printer = new Printer();
        printer.powerOn();
        printer.print();
        printer.powerOff();

        Machine machine=new Laptop();
        machine.powerOn();
        machine.powerOff();
    }
}
