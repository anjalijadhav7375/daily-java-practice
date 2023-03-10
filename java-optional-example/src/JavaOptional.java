import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args) {
        final String name = "Anjali"; //String literals

//        if (name != null && !name.isEmpty() && name.length() < 3) {
//            System.out.println("Length is greater than 3");
//        } else {
//            System.out.println("Name is either null or empty or less than 3");
//        }

        Optional<String> newName = Optional.ofNullable(name);// optional method
        //   Optional<String> newName =Optional.of(name);//null value is not present
        //  Optional<String> newName = Optional.empty();
        if (newName.isEmpty() && newName.get().length() < 3) {
            System.out.println("Length is greater than 3");
        } else {
            System.out.println("Name is either null or empty or less than 3");
        }

    }
}