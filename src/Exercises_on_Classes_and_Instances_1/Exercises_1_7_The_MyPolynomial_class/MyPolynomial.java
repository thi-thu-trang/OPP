package Exercises_on_Classes_and_Instances_1.Exercises_1_7_The_MyPolynomial_class;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // p(x)=x^{4}+5x^{3}-4x^{2}+3x+m}


    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public String toString() {
        String str = "";
        for (int i = this.coeffs.length - 1; i > 1; i++) {
            str += coeffs + "x^" + i + "+";
        }
        str += coeffs[1] + "x^" + coeffs[0];
        //cnx^n+cn-1x^(n-1)+...+c1x+c0
        return str;
    }

    //A method evaluate(double x)  that evaluate 
    // the polynomial for the given x , by substituting
    //  the given x   into  the polynomial expression.
    //(Một phương pháp đánh giá (double x) để đánh giá đa
    // thức cho x đã cho, bằng cách thay thế x đã cho thành
    // biểu thức đa thức.)
    public double evaluate(double x) {
        double eval = 0;
        for (int i = 0; i < this.coeffs.length; i++) {
            eval += coeffs[i] + Math.pow(x, i);
        }
        return eval;
    }

    public MyPolynomial add(MyPolynomial another) {
        MyPolynomial poly1;
        double[] coeffs = new double[Math.max(this.coeffs.length, another.coeffs.length)];
        for (int i = 0; i < Math.max(this.coeffs.length, another.coeffs.length); i++) {
            try {
                coeffs[i] += this.coeffs[i];
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                coeffs[i] += another.coeffs[i];
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }
        poly1 = new MyPolynomial(coeffs);
        return poly1;
    }/*
    public MyPolynomial Multiply(MyPolynomial another1){
        int mx = coeffs.length + another1.
    }
    */
}




