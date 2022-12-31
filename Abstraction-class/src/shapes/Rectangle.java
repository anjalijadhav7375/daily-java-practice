package shapes;

import feature.Shape;

public class Rectangle extends Shape {
    float length;
    float breath;
    public Rectangle(float length,float breath) {
        this.length=length;
        this.breath=breath;
    }

    @Override
    public void calculateArea() {
        area = this.length*this.breath;
    }
}
