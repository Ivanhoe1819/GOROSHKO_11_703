package ru.itis;

public class Ex32Home {// A

    public static void main(String[] args) {
        double x0, x1, eps = 0.0001, a = 0;
        int n = 0;
        x0 = a;
        x1 = -Math.log(x0 + 3);
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = -Math.log(x0 + 3);
            n++;
        }
        System.out.println(x0);
    }
}