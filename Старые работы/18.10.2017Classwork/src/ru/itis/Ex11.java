package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex11 { //      1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(10);
            b[n-1-i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}