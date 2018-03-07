package ru.itis;
import java.util.Scanner;
public class Compare {
    public static int compare(char a[], char b[]) {
        if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                if (a[i] != b[i]) {
                    if (a[i] > b[i]) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
            return 0;
        }else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    if (a[i] > b[i]) {
                        return 1;
                    }else {
                        return -1;
                    }
                }
            }return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String al = s.nextLine();
        String bl = s.nextLine();
        char[]a = al.toCharArray();
        char[]b = bl.toCharArray();
        System.out.println(compare(a,b));
    }
}
