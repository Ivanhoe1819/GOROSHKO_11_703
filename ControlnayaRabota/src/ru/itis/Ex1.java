package ru.itis;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int m;
        double x, S = 0, t, p = -1, k = 1;
        System.out.println("Entering M");
        m = q.nextInt();
        System.out.println("Entering X");
        x = q.nextInt();
        t = (2 * k + 1) / (2 * k * 6 * 6);
        S = S + t;
        for (k = 2; k <= m; k++) {
            t = t * (p * x / ((2 * k) * (2 * k - 1) * 6));
            S = S + t;
            p = -p;
        }
        System.out.println(S);
    }
}
