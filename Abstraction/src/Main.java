import feature.Shape;
import shapes.Cicle;
import shapes.Rectriangle;
import shapes.Square;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Cicle();
        Shape square = new Square();
        Shape rectriangle = new Rectriangle();
        Shape triangle = new Triangle();

        circle.displayArea(10,10);
        square.displayArea(10,10);
        rectriangle.displayArea(10,20);
        triangle.displayArea(10,20);
    }
}