package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int  k , n, q=0,w=0,x;
        double Sum = 0,z=1;
        System.out.println("Input n");
        n=a.nextInt();
        System.out.println("Input x");
        x=a.nextInt();
        for (k = 1; k <=2*n; k++) {
            if(k%2==1) {
                q = q+k;
                z = z * (x / q);
            }
            else{
                w = w+k;
                z = z * (x / w);
            }
            Sum = Sum +z;
        }
        System.out.println(Sum);
    }
}
