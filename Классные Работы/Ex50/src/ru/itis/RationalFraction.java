package ru.itis;

public class RationalFraction {
    int x, y;

    RationalFraction() {
        x = 0;
        y = 1;
    }

    RationalFraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setA(int x) {
        this.x = x;
    }

    public void setB(int y) {
        this.y = y;
    }

    void reduce() {
        for (int i = 1; i <= Math.abs(x); i++) {
            if (x % i == 0) {
                if (y % i == 0) {
                    x = x / i;
                    y = y / i;
                }
            }
        }
    }

    RationalFraction add(RationalFraction rF) {
        RationalFraction a = new RationalFraction
                ((this.x * rF.y) + (rF.x * this.y), (this.x * rF.y));
        a.reduce();
        return a;
    }

    void add2(RationalFraction rF) {
        x = (x * rF.y) + (rF.x * y);
        y = y * rF.y;
        this.reduce();
    }

    RationalFraction sub(RationalFraction rF) {
        RationalFraction a = new RationalFraction
                ((this.x * rF.y) - (rF.x * this.y), (this.y * rF.y));
        a.reduce();
        return a;
    }

    void sub2(RationalFraction rF) {
        x = (x * rF.y) - (rF.x * y);
        x = x * rF.y;
        this.reduce();
    }

    RationalFraction mult(RationalFraction rF) {
        RationalFraction a = new RationalFraction
                ((this.x * rF.x), (this.y * rF.y));
        a.reduce();
        return a;
    }

    void mult2(RationalFraction rF) {
        x = x * rF.x;
        y = y * rF.y;
        this.reduce();
    }

    RationalFraction div(RationalFraction rF) {
        RationalFraction a = new RationalFraction
                ((this.x * rF.y), (this.y * rF.x));
        a.reduce();
        return a;
    }

    void div2(RationalFraction rF) {
        x = x * rF.y;
        y = y * rF.x;
        this.reduce();
    }

    public String toString() {
        return (x + " / " + y);
    }

    double value() {
        return ((double) x / y);
    }

    boolean equals(RationalFraction rF) {
        this.reduce();
        rF.reduce();
        return (x == rF.x) && (y == rF.y) && (this.value() == rF.value());
    }

    int numberPart() {
        return (x / y);
    }
}