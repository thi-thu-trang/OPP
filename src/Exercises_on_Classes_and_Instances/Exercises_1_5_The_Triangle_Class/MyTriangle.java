package Exercises_on_Classes_and_Instances.Exercises_1_5_The_Triangle_Class;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Triangle@ (" + " (" + v1.getX() + "," + v2.getY() + ")" + ", (" + v2.getX() + "," + v2.getY() + ") , (" + v3.getX() + "," + v3.getY() + "))";
    }

    public double getPermeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public void printType() {
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)) {
            System.out.println("equilateral");
        } else if (v1.distance(v2) == v3.distance(v1) || v2.distance(v3) == v3.distance(v1) || v2.distance(v3) == v1.distance(v2)) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
