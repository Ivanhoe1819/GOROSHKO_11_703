package ru.itis;//  Д

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        double x0, y0, x1, y1, x2, y2, xk = 0, yk = 0, b, a, c, d, e, f, g, h;
        int k, n;
        Scanner q = new Scanner(System.in);
        System.out.println("Entering n");
        n = q.nextInt();
        System.out.println("Entering a");
        a = q.nextDouble();
        System.out.println("Entering b");
        b = q.nextDouble();
        System.out.println("Entering c");
        c = q.nextDouble();
        System.out.println("Entering c");
        d = q.nextDouble();
        System.out.println("Entering c");
        e = q.nextDouble();
        System.out.println("Entering c");
        f = q.nextDouble();
        System.out.println("Entering c");
        g = q.nextDouble();
        System.out.println("Entering c");
        h = q.nextDouble();
        x0 = a;
        y0 = a;
        x1 = c;
        y1 = c;
        x2 = c / b;
        y2 = c;
        for (k = 3; k <= n; k++) {
            xk = d * x2 + e * y1 + f * x0;
            yk = g * x2 + h * y1;
            y0 = y1;
            x0 = x1;
            x1 = x2;
            y1 = y2;
            x2 = xk;
            y2 = yk;
        }
        System.out.println(xk);
        System.out.println(yk);
    }
}