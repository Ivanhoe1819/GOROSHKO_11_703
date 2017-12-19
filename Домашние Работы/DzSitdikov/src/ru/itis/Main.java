package ru.itis;

import java.lang.String;


public class Main {
    public static void main(String[] args) {
        String s[] = {"0112", "0", "", "01111112", "01", "3"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(isGoodWordBySwitch(s[i]));
        }
    }

    private static boolean isGoodWordBySwitch(String ar) {
        char l[] = ar.toCharArray();
        boolean f = true;
        int q = 0, i = 0;
        int[][] m = {{1, 4, 4},
                {4, 2, 4},
                {4, 2, 3},
                {4, 4, 4},
                {4, 4, 4}};
        int a = ar.length();
        if (a < 3) {
            System.out.println("Все плохо");
            f = false;
        }
        while (i < 1 && f) {
            int t = l[i]-'0';
            q = m[q][t];
            i++;
            if (q == 4) {
                f = false;
            }
        }
        if (q == 3) {
            System.out.println("Все ок");
        }
        return f;
            /*switch (q) {
                case 0:
                    if (l[i] == 'б') {
                        q++;
                        i++;
                    } else {
                        f = false;
                    }
                    break;
                case 1:
                    if (l[i] == 'э') {
                        q++;
                        i++;
                    } else {
                        f = false;
                    }
                    break;
                case 2:
                    if (l[i] == 'э') {
                        q++;
                        i++;
                    } else {
                        f = false;
                    }
                    break;
                case 3:
                    if (l[i] == 'э') i++;
                    else {
                        q++;
                        i++;
                    }
                    break;
                case 4:
                    if (l[i] == '!' && i == l.length - 1) i++;
                    else {
                        f = false;
                    }
                    break;
            }
        }
        if (q != 4) f = false;
        return f;
    }*/
    }
}