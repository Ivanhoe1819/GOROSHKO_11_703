package ru.itis;

public class Ex29 {//Б

    public static void main(String[] args) {

        double x0 = 0, x1, eps = 0.0001;
        int n = 1;
        x1 = Math.cos(x0);
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = Math.cos(x0);
            n++;
        }
        System.out.println(n);
    }
}