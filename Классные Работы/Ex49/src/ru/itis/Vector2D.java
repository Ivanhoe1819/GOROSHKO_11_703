package ru.itis;

public class Vector2D {
    double x, y;

    public Vector2D() {
        double x = 0;
        double y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D vector2D) {
        Vector2D vector = new Vector2D();
        double x, y;
        vector.x = vector2D.x + this.x;
        vector.y = vector2D.y + this.y;
        return vector;
    }

    public void add2(Vector2D vector2D) {
        this.x = this.x + vector2D.x;
        this.y = this.y + vector2D.y;
    }

    public Vector2D sub(Vector2D vector2D) {
        Vector2D vector = new Vector2D();
        vector.y = vector2D.y - this.y;
        vector.x = vector2D.x - this.x;
        return vector;
    }

    public void sub2(Vector2D vector2D) {
        this.x = this.x - vector2D.x;
        this.y = this.y - vector2D.y;
    }

    Vector2D mult(double a) {
        return new Vector2D(a * x, a * y);
    }

    void mult2(double a) {
        x = x * a;
        y = y * a;
    }

    public String toString() {
        return ("(" + x + ":" + y + ")");
    }

    double length() {
        return Math.sqrt(x * x + y * y);
    }

    double scalarProduct(Vector2D vector2D) {
        return (x * vector2D.x + y * vector2D.y);
    }

    double cos(Vector2D vector2D) {
        return (scalarProduct(vector2D) / (this.length() * vector2D.length()));
    }

    boolean equals(Vector2D vector2D) {
        return ((x == vector2D.x) && (y == vector2D.y) && (this.length() == vector2D.length()));
    }
}
