package ru.itis;

public class ComplexNumber {
    private double x;
    private double i;

    public ComplexNumber() {
        double x = 0;
        double i = 0;
    }

    public ComplexNumber(double a, double b) {
        this.x = a;
        this.i = b;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        ComplexNumber cN = new ComplexNumber();
        double a, b;
        cN.x = complexNumber.x + this.x;
        cN.i = complexNumber.i + this.i;
        return cN;
    }

    public void add2(ComplexNumber complexNumber) {
        this.x += complexNumber.x;
        this.i += complexNumber.i;
    }

    public ComplexNumber multNumber(double x) {
        ComplexNumber r = new ComplexNumber();
        r.x *= x;
        r.i *= x;
        return r;
    }

    public void multNumber2(double k) {
        this.x *= k;
        this.i *= k;
    }

    public ComplexNumber mult(ComplexNumber complexNumber) {
        ComplexNumber r = new ComplexNumber();
        r.x = (complexNumber.x + complexNumber.x) * this.x;
        r.i = (complexNumber.i + complexNumber.i) * this.i;
        return r;
    }

    public void mult2(ComplexNumber complexNumber) {
        this.x *= complexNumber.x + complexNumber.i;
        this.i *= complexNumber.i + complexNumber.x;
    }

    public ComplexNumber div(ComplexNumber complexNumber) {
        ComplexNumber r = new ComplexNumber();
        r.x = complexNumber.x / this.x;
        r.i = complexNumber.i / this.i;
        return r;
    }

    public void div2(ComplexNumber complexNumber) {
        this.x /= complexNumber.x;
        this.i /= complexNumber.i;
    }

    public double lenght() {
        double lenght = Math.sqrt(this.x * this.x + this.i * this.i);
        return lenght();
    }

    public double arg() {
        double q = this.i / this.x;
        double z = Math.atan(q);
        return arg();
    }

    public ComplexNumber powe(double m) {
        double powe;
        double q = Math.sqrt(this.x * this.x + this.i * this.i);
        double z = Math.atan(q);
        powe = Math.pow(q, m) * (Math.cos(m * z) + Math.sin(m * z));
        return powe(m);
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(7,10);
        ComplexNumber b = new ComplexNumber(2, 9);
    }
}