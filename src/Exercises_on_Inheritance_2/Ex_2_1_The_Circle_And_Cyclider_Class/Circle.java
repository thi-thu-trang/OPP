package Exercises_on_Inheritance_2.Ex_2_1_The_Circle_And_Cyclider_Class;

public class Circle {
    private double radius;
    //public double radius;
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

    /* public  void setRadius(double r){
         radius = r;
     }


     public  void  setColor(String c){
         color = c;
     }

     */
    public String toString() {
        return " Circle : radius = " + radius + " color = " + color;
    }
}
