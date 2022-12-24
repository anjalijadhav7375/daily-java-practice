public class Student {
    //fields
   private String name;
   private int id;
   private String collegeName;
    //fields getter
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getCollegeName(){
        return collegeName;
    }
    //fields seeter
    public void setId(int id) {
        this.id = id;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    //no-arg constructor
    public Student(){
        this.name="Mike";
        this.id=101;
        this.collegeName="Stanford";
    }
    //parameterized constructor
    //this is basically refrence for current object
    //basically this holds the adress for the object that called the constructor
    //different number of argument
    public Student(String name,int id,String collegeName){
        this.name=name;
        this.id=id;
        this.collegeName=collegeName;
    }
    //parametrized constructor with different sequence
    public Student(int id, String name,String collegeName){
        this.name=name;
        this.id=id;
        this.collegeName=collegeName;
    }
    //different type
    private Student (int id,String collegeName){
        this.id=id;
        this.collegeName=collegeName;
    }
    public Student(String name){
        this(1000,"COEP");
        this.name=name;
    }
    public Student(int id){
        this.id=id;
    }
    //copy constuctor
    public Student(Student student){
        this.name=student.name;
        this.id= student.id;
        this.collegeName=student.collegeName;
    }

    @Override
    public String toString() {
        return " Name: " + name + " Id: " + 102 + " College Name: " + collegeName;
    }
}
