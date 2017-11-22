package ru.itis;//-

import java.util.Random;
import java.util.Scanner;

public class Ex8_3 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int g, m;
        System.out.print("Entering M");
        m = q.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] b1 = new int[m];
        int[] b2 = new int[m];
        Random R = new Random();
        for (int k = 0; k < m; k++) {
            a[k] = R.nextInt(100);
            System.out.print(a[k] + " ");
        }

        System.out.println(' ');

        for (int k = 0; k < m; k++) {
            b[k] = R.nextInt(100);
            System.out.print(b[k] + " ");
        }
        System.out.println(' ');

        for (int k = 0; k < m; k++) {
            b2[k] = R.nextInt(2);
            System.out.print(b2[k] + " ");
        }
        System.out.println(' ');
        for (int k = 0; k < m; k++) {
            g = a[k];
            for (int i = 0; i < m; i++) {
                if (g == b[i]) {
                    b1[k] = 1;
                }
            }
            if (b1[k] == 1) ;
            System.out.print(b1[k] + " ");
        }
        for (int k = 0; k < m; k++) // Peresechenie
        {
            if (b1[k] == b2[k] && b1[k] == 1) {
                System.out.print(b1[k] + " ");
            } else {
                System.out.print("0"+ " ");
            }
        }
        System.out.println(" ");
        for (int k = 0; k < m; k++) //Ob'edinenie
        {
            if (b1[k] == 1 || b2[k] == 1) {
                System.out.print("1 ");
            } else {
                System.out.print("0"+ " ");
            }
        }
        System.out.println(" ");
        for (int k = 0; k < m; k++) //Raznost'
        {
            if (b1[k] == b2[k] && b1[k] == 1) {
                System.out.print("0"+ " ");
            }
        }
    }
}
