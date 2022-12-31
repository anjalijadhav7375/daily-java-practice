package shapes;


import feature.Shape;


public class Circle extends Shape {
    float radius;

    public Circle(float radius) {
        this.radius=radius;
    }
    @Override
    public void calculateArea(){
      area=PI*this.radius*this.radius;
    }
}

