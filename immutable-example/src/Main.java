public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anjali",1000,101,new Address("A-106",null,null,"Pune",412307));
        System.out.println(employee);
        employee.getAddress().setCity("mumbai");
        System.out.println(employee);

    }
}