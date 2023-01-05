import java.util.Locale;

public class StringMethods{
    public static void main(String[] args) {
       String name1 = "cat";
       String name2 = name1.toUpperCase();
        System.out.println(name2);
        System.out.println(name2.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.length());
        System.out.println(name2.charAt(2));
        System.out.println(name2.equals(name1));
        System.out.println(name2.equalsIgnoreCase(name1));
        String name3 = name2.concat(name1);
        System.out.println(name3);
        String name4 = name3.toLowerCase();
        System.out.println(name4.hashCode());

    }
}
