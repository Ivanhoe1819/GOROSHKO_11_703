package ru.itis;

public class Main {

    public static void main(String[] args) {
        String zeros = "\u0000\u0000";
        String hello = "Hello";
        String specialChars = "\r\n\t\"\\";
        String unicodeEscapes = "\u0101\u2134\u03ff";
        System.out.println(zeros);
        System.out.println(specialChars);
        System.out.println(hello);
        System.out.println(unicodeEscapes);

        char[] charArray = {'a', 'b', 'c'};
        String string = new String(charArray);
        System.out.println(string);
        System.out.println();

        String s1 = "xyz";
        String s2 = "xyz";
        String s3 = new String("xyz");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s2));
    }

    public static void addon(String[] args) {
        String str = "Randomnaya fignya";
        System.out.println(str);
        System.out.println(str.length());
    }
}