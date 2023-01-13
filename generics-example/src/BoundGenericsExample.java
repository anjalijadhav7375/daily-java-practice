class Machine{

}
class Mobile extends Machine{

}
class Computer extends Machine{

}
class Hadware<E> extends Machine{

}
public class BoundGenericsExample {
        Hadware<Machine> machineHadware = new Hadware<>();
        Hadware<Mobile> mobileHadware = new Hadware<>();
        Hadware<Computer> computerHadware = new Hadware<>();
    }

