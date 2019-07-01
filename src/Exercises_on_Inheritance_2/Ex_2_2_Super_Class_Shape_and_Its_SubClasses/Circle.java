package Exercises_on_Inheritance_2.Ex_2_2_Super_Class_Shape_and_Its_SubClasses;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;

    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    //c=2*radius*3,14;
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius : " + radius + "  a subclass of: " + super.toString();
    }
}

