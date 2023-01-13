public class UncheckedExceptionExample {
    public static void main(String[] args) {
        printArray();

        // try {
        //   printArray();
        //}catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
        //   System.out.println("Array index is out of bounds");
        //}finally {
        //  System.out.println("Finally block always gets executed");
    }

    //static void printArray() throws ArrayIndexOutOfBoundsException{
    //  String arr[] = new String[]{"Anjali","Rutuja","Pravin"};
    //for ( int i=0; i<arr.length; i++) {
    //  System.out.println(arr[i]);
    // }
    //System.out.println(arr[3]);

    static void printArray(){
        try {
            String arr[] = new String[]{"Anjali","Rutuja","Pravin"};
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println(arr[3]);
            }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Array index is out of bounds");
        }
        }
}


