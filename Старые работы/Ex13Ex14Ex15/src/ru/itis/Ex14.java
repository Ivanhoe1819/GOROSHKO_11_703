package ru.itis;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = 0, x;
        System.out.println("Entering X");
        x = q.nextInt();
        while (x >= 1) {
            x = x / 10;
            n++;
            System.out.println(n);
        }
        System.out.println(n);
    }
}
