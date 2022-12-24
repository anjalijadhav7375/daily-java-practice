public class Employee {
    private String name;
    private int salary;
    private int age;
    private Adress adress;

    private Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
            return age;
    }
    public void setAge(int age) {
        if (age > 14){
            this.age =age;
        }else {
            this.age = 22;
        }
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public static Employee getInstance(){
        return new Employee();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", adress=" + adress.toString() +
                '}';
    }
}
