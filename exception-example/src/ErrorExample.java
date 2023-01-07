public class ErrorExample {
    static int count;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main called " + count);
        Thread.sleep(10);
        count++;
        main(new String[]{});
    }
}