package Exercises_on_Composition_vs_Inheritance_3.Ex_3_2_Circle_and_Cylinder_using_Composition;

public class Circle {
    //protected double radius;
    public double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return " Circle : radius = " + radius + " color = " + color;
    }
}
