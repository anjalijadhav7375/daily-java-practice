public class Main {
    public static void main(String[] args) {
        Adress adress1 = Adress.getInstance();
        adress1.setFlatNumber("A-106");
        adress1.setSocietyName("Visita Vintage");
        adress1.setPinCode(412307);

        Employee employee = Employee.getInstance();
        employee.setName("Rob");
        employee.setAge(24);
        employee.setSalary(9000);
        employee.setAdress(adress1);
        System.out.println(employee);

        Adress adress2 =Adress.getInstance();
        adress2.setFlatNumber("B-103");
        adress2.setSocietyName("ShyamChandra Park");
        adress2.setPinCode(412307);
        Employee employee1 = Employee.getInstance();
        employee1.setName("Mike");
        employee1.setAge(10);
        employee1.setSalary(9000);
        employee1.setAdress(adress2);
        System.out.println(employee1);
    }
}