package Exercises_on_Classes_and_Instances.Exercises_1_6_The_MyComplex_Class;

public class MyComples {
    private double real;
    private double imag;

    public MyComples(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;

    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public void setReal(double real) {
        this.real = real;

    }

    public boolean isImaginary() {
        return real == 0;

    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComples another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    // |z| = sqrt(x*x+y*y);
    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);

    }

    //Các Math.atan2()chức năng trả về góc trong mặt phẳng (theo radian)
    public double argumentInRadians() {
        return Math.atan2(this.imag, this.real);
    }

    public int argumentInDegrees() {
        return (int) (Math.atan2(this.imag, this.real) * 180 / Math.PI);
    }

    // z= 3+2i số phức liên hợp z= 3-2i;
    public MyComples conjugate() {
        return new MyComples(this.real, -this.imag);
    }

    public MyComples add(MyComples another) {
        return new MyComples(this.real + another.real, this.imag + another.imag);

    }

    // substract : trừ
    public MyComples subtract(MyComples another) {
        return new MyComples(this.real - another.real, this.imag - another.imag);
    }

    //multiply : nhân
    // z*z'= (aa'-bb')+(ab'+a'b)i;
    public MyComples multiply(MyComples another) {
        return new MyComples(((this.real * another.real) - (this.imag * another.imag)), ((this.real * another.imag) + (this.imag * another.real)));

    }

    public MyComples divideBy(MyComples another) {
        return new MyComples(this.multiply(another.conjugate()).getReal() / (Math.pow(another.getImag(), 2) + Math.pow(another.getImag(), 2)), this.multiply(another.conjugate()).getImag() / (Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2)));
    }


}
