package Exercises_on_Classes_and_Instances_1.Exercises_1_1_The_Circle_Class;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        //System.out.println(c1.radius);
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(3.0, "green");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        System.out.println(" color " + c3.getColor());
        c3.setRadius(5.0);
        c3.setColor("yellow");
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        Circle c4 = new Circle(1.2, "black");
        System.out.println(c4.toString());
        System.out.println("Operator '+' invokes toString() too: " + c4);
    }
}
