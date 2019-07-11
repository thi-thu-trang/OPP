package Exercises_on_Classes_and_Instances.Exercises_1_5_The_Triangle_Class;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle tamgiac1 = new MyTriangle(3, 2, 1, 4, 2, 4);
        MyTriangle tamgiac2 = new MyTriangle(new MyPoint(3, 1), new MyPoint(3, 4), new MyPoint(4, 5));
        System.out.println(tamgiac1);
        System.out.println(tamgiac1.getPermeter());
        tamgiac1.printType();
        System.out.println(tamgiac2);
        System.out.println(tamgiac2.getPermeter());
        tamgiac2.printType();

    }
}
