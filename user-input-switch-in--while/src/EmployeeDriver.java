public class EmployeeDriver {
    public static void main(String[] args) {
        Employee Vikram = new Employee();
        Employee Suraj = new Employee();

        Vikram.name ="Vikram";
        Suraj.name = "Suraj";
        Vikram.id = 100;
        Suraj.id = 200;
        Vikram.department = "RND";
        Suraj.department = "sales";
        Vikram.designation = "SSE";
        Suraj.designation = "CM";

        Vikram.doAttendMeetings();
        Vikram.Commute();
        Vikram.displayCount();
        Suraj.doAttendMeetings();
        Suraj.Commute();
        Suraj.displayCount();
    }
}