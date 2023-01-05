public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Anjali");
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder2 = stringBuilder1.append("Jadhav");
        System.out.println(stringBuilder1.insert(6," "));
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder2.length());

    }
}
