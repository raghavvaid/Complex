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

    public String toString(){
        return real + " + " + ima + "i";
    }

//    public Complex multiply(Complex other) {
//
//    }

    public static void main(String[] args) {
        Complex x = new Complex(3,4);
        Complex y = new Complex(4,5);
        System.out.println(x.abs());
        System.out.println(y.abs());
        System.out.println(x.add(y));
        System.out.println(y.add(x));
    }
}
