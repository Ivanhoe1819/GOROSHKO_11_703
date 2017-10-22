package ru.itis;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        double S=1, eps = 0.001, Pi = 3.1415269;
        while (Math.abs(S - (Pi / 2)) > eps) {
            n++;
            S = S * (2.0 * n / (2.0 * n - 1.0)) * (2.0 * n / (2.0 * n + 1.0));
        }
        System.out.println(n);
    }
}