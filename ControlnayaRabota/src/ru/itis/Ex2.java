package ru.itis;

public class Ex2 {

    public static void main(String[] args) {
        int n = 2;
        double x1 = 1, y1 = 1, xi, yi, eps = 2;
        xi = x1 + (y1 / n * n);
        yi = y1 + (x1 / n);
        n++;
        while (xi <= eps) {
            x1=xi;
            y1=yi;
            xi = x1 + (y1 / n * n);
            yi = y1 + (x1 / n);
            n++;
        }
        System.out.println(yi);
    }
}
