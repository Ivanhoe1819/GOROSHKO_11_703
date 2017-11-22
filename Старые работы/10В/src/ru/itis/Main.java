package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int  k , n, x, p;
        double Sum = 0,z=1;
        System.out.println("Input n");
        n=a.nextInt();
        System.out.println("Input x");
        x=a.nextInt();
        p = x*x;
            for (k = 1; k <= n; k++) {
                z=z*p*(2*k-1)/(2*k);
                Sum = Sum + z;
                p = p*x*x;
            }
        System.out.println(Sum);
    }
}
