package ru.itis;
import java.lang.String;
import static java.lang.Integer.*;
import java.util.Scanner;
import java.util.Random;

public class Ex35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Entering N");
        int n = s.nextInt();
        int[] a = new int[n];

        //String [] a = new String[n];
        for (int i = 0; i < n; i++) {
            String g = s.nextLine();
            a[i] = parseInt(g);
        }
       // for (int i = 0; i < n; i++) {
        //    q[i] = parseInt(a[i]);
        //}
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum="+min);
    }
}
