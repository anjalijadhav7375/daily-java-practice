public class StringExample {
    public static void main(String[] args) {

    String name1="Anjali";
    String name2="Anjali";
    String name3=new String("Anjali");
    String name4=name3.intern();

    if (name3 == name4){
        System.out.println("name1 and name2 are pointing the same object");
    }else {
        System.out.println("They holding different address");
    }
}
}