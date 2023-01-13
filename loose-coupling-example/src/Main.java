interface Person{
    void display();
    default void display2(){
        System.out.println("Default method called");
    }
}
class Employee implements Person{
    String name;
    int age;
    @Override
    public void display() {
        System.out.println("Employee display called");
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Student implements Person{
    String name;
    int id;

    @Override
    public void display() {
        System.out.println("Student display called");
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
         Person employee = new Employee("Anjali",21);
         employee.display();
         employee.display2();

         Person student = new Student("Rutuja",21);
         student.display();
         student.display2();
    }
}