import feature.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.calculateArea(10.5f , 10.5f);
        circle.displayArea();
        rectangle.calculateArea(20.5f, 15.5f);
        rectangle.displayArea();
    }
}