package ru.itis;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        int n = a.length();
        int m = b.length();
        int max = n;
        int min = m;
        if (m > max) {
            max = m;
            min = n;
            analysis(max, min, a, b);
        } else {
            analysis(max, min, b, a);
        }

    }

    private static void analysis(int max, int min, String s, String ss) {
        int q = 0;
        boolean f = false;
        for (int i = 0; i < max; i++) {
            for (int k = 0; k < min; k++) {
                if (s.charAt(k) == ss.charAt(i + k)) {
                    s.charAt(k);
                    ss.charAt(i);
                    q++;
                    if (q == min) {
                        f = true;
                        System.out.println(f);
                        return;
                    }
                } else {
                    q = 0;
                    break;
                }
            }
        }
        System.out.println(f);
    }
}