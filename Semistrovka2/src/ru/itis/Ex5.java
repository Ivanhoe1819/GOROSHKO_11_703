package ru.itis;
//ГГ

import java.util.Scanner;

public class Ex5 {

    public static double functionF(int i) {
        double f;
        return f = 3.5 * Math.sin(i + 1) * Math.sin(i + 1) - 2.7 * Math.sin(i + 1) + 1;
    }

    public static void functionY(double x, int n) {
        int[] xint = new int[n + 1];            // Чтобы считало при (I+1)
        for (int i = 0; i < xint.length; i++) {
            xint[i] = 2 * (i + 1);               // (I+1) так как условие задачи не подразумевает отсчет с 0 в массиве
        }
        double[] f = new double[n+1];
        for (int i = 0; i<f.length;i++){
            f[i]=Ex5.functionF(xint[i]);
        }
        double[] y = new double[n];
        for (int i = 0; i < y.length; i++) {
            if (xint[i] <= x && x < xint[i + 1]) {
                y[i] = (((x - xint[i + 1]) / (xint[i] - xint[i + 1])) *f[i]) + (((x - xint[i]) / (xint[i + 1] - xint[i])) * f[i+1]);
                System.out.print(y[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Entering N");
        n = s.nextInt();
        double[] x = new double[3];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Entering X");
            x[i] = s.nextDouble();
        }
        for (int i = 0; i < x.length; i++) {
            functionY(x[i], n);
            System.out.println();
        }
    }
}
