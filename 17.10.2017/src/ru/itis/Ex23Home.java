package ru.itis;

import java.util.Scanner;

public class Ex23Home {// Б

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int k = 2, p = 1;
        double Sum, v1, v0, vk, x, a, b, t, z = 8;
        System.out.println("Entering X");
        x = q.nextDouble();
        System.out.println("Entering A");
        a = q.nextDouble();
        System.out.println("Entering B");
        b = q.nextDouble();
        v0 = a;
        v1 = a;
        vk = v1 + v0;
        Sum = (vk * Math.cos(vk * x) * Math.cos(vk * x) / 2) + ((-1) * vk * Math.cos(vk * x) * Math.cos(vk * x) / 4);
        while (a <= vk && vk <= b) {
            t = p * vk * Math.cos(vk * x) * Math.cos(vk * x) / z;
            v0 = v1;
            v1 = vk;
            vk = v1 + v0;
            z = z * 2;
            p = -p;
            Sum = Sum + t;
            k++;
        }
        System.out.println(Sum);
    }
}