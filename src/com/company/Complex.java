package com.company;

public class Complex {
    private double real;
    private double ima;

    public Complex(double r, double i){
        real = r;
        ima = i;
    }

    public Complex(double r){
        this(r,0);
    }

    public double abs(){
        double a = Math.pow(real,2.0);
        double b = Math.pow(ima,2.0);
        double x = Math.sqrt(a+b);
        return x;
    }

    public Complex add(Complex other){
        double r = real + other.real;
        double i = ima + other.ima;
        return(new Complex(r,i));
    }

    public Complex add(double other){
        double r = real + other;
        Complex Complex2 = new Complex(r);
        return Complex2;
    }

    public String toString(){
        return real + " + " + ima + "i";
    }

    public Complex multiply(Complex other) {
        double r = (real * other.real) - (ima * other.ima);
        double i = (real * other.ima) + (ima * other.real);
        Complex Complex3 = new Complex(r,i);
        return Complex3;
    }

    public Complex multiply (double other){
        double r = (real * other);
        double i = (ima * other);
        Complex Complex3 = new Complex(r,i);
        return Complex3;
    }

    public static void main(String[] args) {
        Complex x = new Complex(3,4);
        Complex y = new Complex(4,5);
        Complex z = new Complex(1.0,2.0);
        Complex a = new Complex(2.0,-4.5);
        Complex b = new Complex(6.0);
        Complex c = new Complex(3.0);

        System.out.println("abs: ");
        System.out.println(x.abs());
        System.out.println(y.abs());
        System.out.println(a.abs());
        System.out.println();
        System.out.println("add:" );
        System.out.println(y.add(x));
        System.out.println(z.add(5.0));
        System.out.println();
        System.out.println("multiply: ");
        System.out.println(x.multiply(y));
        System.out.println(b.multiply(x));
        System.out.println(c.multiply(4.0));
    }
}
