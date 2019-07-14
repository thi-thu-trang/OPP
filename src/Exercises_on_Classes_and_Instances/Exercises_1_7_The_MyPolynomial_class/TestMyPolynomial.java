package Exercises_on_Classes_and_Instances.Exercises_1_7_The_MyPolynomial_class;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println(p1);
        System.out.println(p1.getDegree());
        System.out.println(p1.evaluate(5));//thay x=5 de bk gia tri cua da thuc
        System.out.println(p1.add(new MyPolynomial(3.0, 4.0, 5.0)));
    }
}
