package Exercises_on_Inheritance_2.Ex_2_1_The_Circle_And_Cyclider_Class;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder: " + "radius = " + c1.getRadius() + " height = " + c1.getHeight() + " base area = " + c1.getArea() + " volume = " + c1.getVolume());
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder: " + " radius = " + c2.getRadius() + " height = " + c2.getHeight() + " base area = " + c2.getArea() + " volume = " + c2.getVolume());
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: " + " radius = " + c3.getRadius() + " height = " + c3.getHeight() + " base area = " + c3.getArea() + " volume = " + c3.getVolume());

    }
}
