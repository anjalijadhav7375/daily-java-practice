import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(new Employee("Anjali",1000));
        employeeList.add(new Employee("Rutuja",800));
        employeeList.add(new Employee("Pravin",1500));
        employeeList.add(new Employee("Pratik",2000));

        employeeList.forEach(employee -> System.out.println("Name: " + employee.name + "Salary: " + employee.salary));
        System.out.println("**************************");

        employeeList.stream().sorted(Comparator.comparing(employee -> employee.salary))
                .forEach(employee -> System.out.println("Name: " + employee.name + "Salary: " + employee.salary));
    }
}