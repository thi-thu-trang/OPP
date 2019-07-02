package Exercises_on_Classes_and_Instances_1.Exercises_1_3_The_MyPoint_class;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));


        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
    }
}
