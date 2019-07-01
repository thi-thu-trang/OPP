package Exercises_on_Inheritance_2.Ex_2_2_Super_Class_Shape_and_Its_SubClasses;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        this.setWidth(side);
        this.setLength(side);

    }

    @Override
    public void setLength(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side: " + getSide() + ", which is a subclass of " + super.toString();
    }
}
