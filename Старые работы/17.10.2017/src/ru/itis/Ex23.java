package ru.itis;

import java.util.Scanner;

public class Ex23 { // A
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int k = 2;
        double Sum = 0, v1, v0, vk, x, a, b, t;
        System.out.println("Entering X");
        x = q.nextDouble();
        System.out.println("Entering A");
        a = q.nextDouble();
        System.out.println("Entering B");
        b = q.nextDouble();
        v0 = a;
        v1 = a;
        vk = v1 + v0;
        Sum = Math.log(vk * x) + Math.log(vk * x);
        while (a <= vk && vk <= b) {
            t = Math.log(vk * x);
            v0 = v1;
            v1 = vk;
            vk = v1 + v0;
            Sum = Sum + t;
            k++;
        }
        System.out.println(Sum);
    }
}