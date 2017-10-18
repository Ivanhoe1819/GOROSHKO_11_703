package ru.itis;
import java.util.Scanner;
public class Ex14 {//A

    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int k = 1, p =1;
    double Sum = 0, t = 1, eps = 0.0001, q , x;
    System.out.println("Entering X");
    x = a.nextDouble();
            for (k=1; t >= eps; k++) {
                q = p * t * Math.sin(t * x) * Math.sin(t * x);
                p = -p;
                Sum = Sum + q;
                t = t / k;
            }
    System.out.println(Sum);
    }
}