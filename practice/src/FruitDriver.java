public class FruitDriver {
    public static void main(String[] args) {
        Fruits f1 = new Fruits();
        Fruits f2 = new Fruits(f1);
        f1.displayFruits();
        f2.displayFruits();
    }
}
