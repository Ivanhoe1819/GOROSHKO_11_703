package ru.itis;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = 0, x;
        double t, S = 0, a = 1;
        System.out.println("Entering X");
        x = q.nextInt();
        while (x >= 1) {
            t = x % 10;
            x = x / 10;
            if (t % 2 == 1) {
                S = S + a * t;
                a = a * 10;
            }
            n++;
        }
        System.out.println(S);
    }
}