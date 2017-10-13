package ru.itis;
import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        double y0, y1, eps = 0.0001,x;
        int n = 1;
        System.out.println("Entering x");
        x = a.nextDouble();
        if (x >= 1){
            y0 = x / 3;
        }
        else {
            y0 = x;
        }
        y1 = y0 - (y0 - x /(y0 * y0)) / 3;
        while (Math.abs(y1 - y0) > eps) {
            y0 = y1;
            y1 = y0 - (y0 - x / (y0 * y0)) /3;
        }
        System.out.println(y0);
    }
}
