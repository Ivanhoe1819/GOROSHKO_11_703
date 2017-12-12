package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String words[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};

        for (String word : words) {
            System.out.println(isF(word));
        }
    }

    public static boolean isF(String t) {
        int i = 0;
        boolean flag = true;
        boolean is = false;
        int state = 0;
        char array[] = t.toCharArray();

        while (flag && i < array.length) {
            switch (state) {
                case 0:
                    if (array[i] != 'б') {
                        flag = false;
                    } else {
                        i++;
                        state = 1;
                    }
                    break;
                case 1:
                    if (array[i] != 'э') {
                        flag = false;
                    } else {
                        i++;
                        state = 2;
                    }
                    break;
                case 2:
                    if (array[i] == 'э') {
                        state = 2;
                        i++;
                    } else {
                        state = 3;
                    }
                    break;
                case 3:
                    if (array[i] != '!') {
                        flag = false;
                    }
                    i++;
                    is = true;
                    break;
            }
        }
        return is;
    }
}