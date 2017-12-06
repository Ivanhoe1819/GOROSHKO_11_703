package ru.itis;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ex35 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String[] a = st.split(" ");
        int n = parseInt(a[0]);
        int min = el_length(n);
        int stat = 0;
        for (int i = 1; i < a.length; i++) {
            n = parseInt(a[i]);
            int q = el_length(n);
            if (q <= min) {
                min = q;
                stat = i;
            }
        }
        System.out.println("Элемент = " + a[stat]);
        System.out.println("Длина = " + min);
    }

    private static int el_length(int n) {
        int q = 0;
        while (n > 0) {
            n /= 10;
            q++;
        }
        return (q);

    }
}