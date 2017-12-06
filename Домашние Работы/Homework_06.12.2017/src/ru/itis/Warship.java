package ru.itis;

import java.util.Scanner;

public class Warship implements Ship {
    Scanner s = new Scanner(System.in);

    @Override
    public int yearOfEstablishment() {
        return s.nextInt();
    }

    @Override
    public int launchedOnTheWater() {
        return s.nextInt();
    }

    @Override
    public double length() {
        return s.nextDouble();
    }

    @Override
    public double draft() {
        return s.nextDouble();
    }

    @Override
    public String status() {
        return s.nextLine();
    }
}
