package ru.itis;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ex38 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int n = parseInt(a);
        int q;
        while (n > 0){
            q = n%10;
            if ((q%2==0)||(q%3==0)){
                System.out.print("Есть");
                return;
            }
            n = n/10;
        }
        System.out.println("Нет");
    }
}