package ru.itis;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int j, n;
        double b, a1, a2, a3, x, h, F, Fi = 100, NeFi = 0;
        System.out.println("Entering N");
        n = q.nextInt();
        double[] aS = new double[4];
        System.out.println("Entering B");
        b = q.nextDouble();
        System.out.println("Entering H");
        h = q.nextDouble();
        System.out.println("Entering A");
        for (int i = 1; i < 4; i++) {
            aS[i] = q.nextDouble();
        }
        double[] a = new double[n];
        for (int i = 1; i < 4; i++) {
            for (j = 1; j <= n; j++) {
                x = b + j * h;
                F = Math.sqrt(2 + Math.sin(aS[i] + x)) + Math.sqrt(2 - Math.cos(aS[i] + x));
                if(F<Fi) {
                    Fi = F;
                }
                NeFi = NeFi + F;
                System.out.print(F + " ");
                if(j==n){
                    System.out.println();
                    System.out.println("Fi "+ Fi);
                    System.out.println("NeFi "+ NeFi);
                }
            }

        }
    }
}