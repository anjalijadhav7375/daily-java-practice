public class Student {
    private String name;
    private int id;

    public Student(){
        this.name="Rutuja";
        this.id=200;
    }
    public Student(String name , int id){
        this.name=name;
       this.id=id;
    }
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
    }
    public void displayFields(){
        System.out.println("\nThe name of student is: "+ this.name);
        System.out.println("Tne id of the student is: "+ this.id);

    }
}
