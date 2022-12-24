public class Fruits {
    int price;
    String name;

    public Fruits(){
        this.price = 400;
        this.name ="Apple";
    }

    public Fruits(Fruits fruits){
        this.price = fruits.price;
        this.name = fruits.name;
    }
    public void displayFruits(){
        System.out.println("\nThe Fruit name is: "+this.name);
        System.out.println("The Fruit price is: "+this.price);
    }
}
