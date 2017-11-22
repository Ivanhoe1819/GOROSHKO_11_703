package ru.itis;

import java.util.Scanner;

public class Ex14Home {//Б

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int k;
        double Sum = 0, t, eps = 0.0001, q, x, a;
        System.out.println("Entering X");
        x = h.nextDouble();
        System.out.println("Entering A");
        a = h.nextDouble();
        t = 1 / a;
        for (k = 1; t >= eps; k++) {
            q = t * Math.log(t * x);
            Sum = Sum + q;
            t = t / a;
        }
        System.out.println(Sum);
    }
}