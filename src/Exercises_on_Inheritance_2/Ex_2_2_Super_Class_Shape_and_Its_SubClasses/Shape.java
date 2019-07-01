package Exercises_on_Inheritance_2.Ex_2_2_Super_Class_Shape_and_Its_SubClasses;

import java.util.Formatter;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // tạo một Builder trống với dung lượng capacity ban đầu là 16
        Formatter formatter = new Formatter(sb);
        formatter.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
        return sb.toString();
    }
}
