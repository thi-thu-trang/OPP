package Exercises_on_Inheritance_2.Ex_2_1_The_Circle_And_Cyclider_Class;

//public class Cylinder {
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }


    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();

    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();

    }


    @Override
    public String toString() {
        return "Cylinder: subslass of " + super.toString() + " height= " + height;
    }
}

