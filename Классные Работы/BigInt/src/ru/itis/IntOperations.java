package ru.itis;

import ru.itis.ALOperation;

import java.util.ArrayList;

public class IntOperations {


    private static boolean isNum(String s) {
        char[] num = s.toCharArray();
        for (int count = 0; count < num.length; count++) {
            if ('0' <= num[count] && '9' >= num[count]) continue;
            else return false;
        }
        return true;
    }

    public static String totalSum(String term1, String term2) {
        int cross;
        int plus = 0;
        int count;
        char[] min;
        int length;
        ArrayList<Integer> total;

        if (!isNum(term1) && !isNum(term2)) {
            System.err.println("Вводить надо числа");
            return null;
        }

        if (term1.length() > term2.length()) {
            total = ALOperation.stringToAL(term1);
            length = term2.length();
            min = term2.toCharArray();
        } else {
            total = ALOperation.stringToAL(term2);
            length = term1.length();
            min = term1.toCharArray();
        }

        for (count = 1; count <= length; count++) {
            cross = total.get(total.size() - count) + min[length - count] - '0';
            if (plus > 0) {
                cross += plus;
                plus = 0;
            }

            if (cross > 9) {
                total.set(total.size() - count, cross % 10);
                plus = cross / 10;
            } else total.set(total.size() - count, cross);
        }

        while (plus != 0 && count <= total.size()) {
            total.set(total.size() - count, total.get(total.size() - count) + plus);
            if (total.get(total.size() - count) > 9) {
                plus = total.get(total.size() - count) / 10;
                total.set(count, total.get(total.size() - count) % 10);
                count++;
            } else plus = 0;
        }

        if (plus != 0) {
            total.add(0, 1);
        }
        return ALOperation.ALtoString(total);
    }
}
