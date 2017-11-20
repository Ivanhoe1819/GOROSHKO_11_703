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
    public Vector2D add(Vector2D vector2D){
        Vector2D vector = new Vector2D();
        double x,y;
        vector.x=vector.x+this.x;
        vector.y=vector.y+this.y;
        return vector;
    }
    
}