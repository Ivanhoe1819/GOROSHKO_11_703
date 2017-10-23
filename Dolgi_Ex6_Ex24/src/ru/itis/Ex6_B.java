package ru.itis;

public class Ex6_B {
    public static void main(String[] args) {
        int p = -1, n = 1;
        double G, t, eps = 0.0001;
        t = 1 / ((2 * n - 1) * (2 * n - 1));
        G = t;
        while (t > eps) {
            t = p * t / ((2 * n - 1) * (2 * n - 1));
            G = G + t;
            p = -p;
            n++;
        }
        System.out.println(G);
    }
}
