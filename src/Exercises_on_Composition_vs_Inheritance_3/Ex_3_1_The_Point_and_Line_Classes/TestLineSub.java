package Exercises_on_Composition_vs_Inheritance_3.Ex_3_1_The_Point_and_Line_Classes;

public class TestLineSub {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println("Line 1 length is " + l1.getLength());
        System.out.println("Line 1 gradient is " + l1.getGradient());
        Point p1 = new Point(7, 10);
        Point p2 = new Point(9, 5);
        Line l2 = new Line(p1, p2);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
