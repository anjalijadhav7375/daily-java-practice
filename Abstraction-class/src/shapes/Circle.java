package shapes;

import feature.Shape;

public class Circle extends Shape {

    public Circle() {
        super();
    }
    public void calArea(float radius){
        calculateArea(radius,radius);
    }

    @Override
    public void calculateArea(float x, float y) {
         area = Shape.PI*x*y;
    }
}
