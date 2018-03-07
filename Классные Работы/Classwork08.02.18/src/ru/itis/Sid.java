package ru.itis;

public class Sid {
    public int toArray(int number) {
        int countOfDigits = 0;
        int result[] = new int[10];
        while (number != 0) {
            result[countOfDigits] = number % 10;
            number = number / 10;
            countOfDigits++;
        }
        int copy[] = new int[countOfDigits];
        for (int i = 0; i < countOfDigits; i++) {
            copy[i] = result[i];
        }return 1;
    }
}

