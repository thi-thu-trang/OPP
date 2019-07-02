package Exercises_on_Classes_and_Instances_1.Exercises_1_4_The_MyCircle_Class;

import Exercises_on_Classes_and_Instances_1.Exercises_1_3_The_MyPoint_class.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;

    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public String toString() {
        return "Circle@(" + center.getX() + " " + center.getY() + ") radius = " + radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
