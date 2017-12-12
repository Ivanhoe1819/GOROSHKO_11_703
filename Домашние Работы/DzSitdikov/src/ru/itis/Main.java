package ru.itis;

public class Main {
    public static void main(String[] args) {
        String s[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(isGoodWordBySwitch(s[i]));
        }
    }

    private static boolean isGoodWordBySwitch(String ar) {
        char l[] = ar.toCharArray();
        boolean f = true;
        int q = 0, i = 0;
        while (f && i < l.length) {
            switch (q) {
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
    }
}