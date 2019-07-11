package Exercises_on_Classes_and_Instances.Exercises_1_6_The_MyComplex_Class;

public class TestMyComples {
    public static void main(String[] args) {
        System.out.println("Test My Comples: ");
        MyComples c1 = new MyComples(1, 2);
        System.out.println(c1);
        System.out.println(c1.isReal());
        System.out.println(c1.isImaginary());
        System.out.println(c1.equals(1, 2));
        System.out.println(c1.equals(0, 1));
        MyComples c2 = new MyComples(2, 4);
        System.out.println(c2);
        System.out.println(c2.argumentInDegrees());
        System.out.println(c2.argumentInRadians());
        System.out.println(c1.add(c2));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.subtract(c2));
        System.out.println(c1.divideBy(c2));

    }
}
