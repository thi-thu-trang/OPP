package Exercises_on_Classes_and_Instances.Exercises_1_4_The_MyCircle_Class;

import Exercises_on_Classes_and_Instances.Exercises_1_3_The_MyPoint_class.MyPoint;

public class TestCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(3, 5, 3);
        MyCircle circle2 = new MyCircle(new MyPoint(4, 2), 3);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle2);
        circle2.setRadius(5);
        circle2.setCenter(new MyPoint(5, 7));
        System.out.println(circle2.getCenter());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());


    }
}
