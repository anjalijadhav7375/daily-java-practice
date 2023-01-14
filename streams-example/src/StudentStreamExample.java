import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Student {
    String firstName;
    String lastName;
    int rollNumber;
    char division;

    public Student(String firstName, String lastName, int rollNumber, char division) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.division = division;
    }
}

public class StudentStreamExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anjali", "Jadhav", 1, 'A'));
        studentList.add(new Student("Rutuja", "Kamble", 10, 'B'));
        studentList.add(new Student("Pravin", "Tupe", 11, 'C'));
        studentList.add(new Student("Pratik", "Shinde", 12, 'D'));

        Stream<Student> studentStream = studentList.stream();
        Stream<Student> studentStream1 = studentStream.filter(student -> student.rollNumber > 10);
        studentStream1.forEach(student -> // forEach -> Terminal Operation which is close the Stream
                System.out.println("First Name: " + student.firstName + " Last Name: " + student.lastName + " Roll Number: " + student.rollNumber));

        Stream<Student> studentStream2 = studentList.stream();
        long numberOfElements = studentStream2.count();//Count -> Terminal Operation which is close the Stream
        System.out.println(numberOfElements);
    }
}
