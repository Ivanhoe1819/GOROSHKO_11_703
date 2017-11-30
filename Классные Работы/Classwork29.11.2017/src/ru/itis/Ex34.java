package ru.itis;
import java.lang.String;
import static java.lang.Integer.*;
import java.util.Scanner;
public class Ex34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();
        int t;
        int n = parseInt(q);
        int max = 0;
        while (n > 0) {
            t = n % 10;
            n = n / 10;
            if (t>max){
                max = t;
            }
        }
        System.out.println(" Максимум=" + max);
    }
}
