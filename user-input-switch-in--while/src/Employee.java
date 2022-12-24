public  class Employee {
    String name;
    int id;
    String department;
    String designation;
    public static int count;

    void doAttendMeetings(){
        System.out.println("Employee "+name+" is doing meetings");
    }void Commute(){
        System.out.println("Employee "+name+" is doing commute");
    }void displayCount(){
        System.out.println("Employee "+name+ count);
    }
}