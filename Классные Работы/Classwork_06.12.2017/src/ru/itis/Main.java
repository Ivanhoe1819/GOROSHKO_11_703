package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int z = 1;
        boolean f = true;
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        switch (4) {
            case 1:
                chtoto(a.charAt(z), z, s.next());
        }
    }


    public static void chtoto(char a, int z, char e) {
        if (e == a) {
            z++;
        } else {
            System.out.println("С овощами общаться не возможно");
            return;
        }

    }
}

