package ru.itis;

public class Main {
    public static void main(String[] args) {
        Ship yamato = new Warship();
        Ship independence = new Warship();
        Warship kirov = new Warship();
        AircraftCarrier langley = new AircraftCarrier();
        kirov.status();
        yamato.yearOfEstablishment();
        independence.launchedOnTheWater();
        independence.yearOfEstablishment();
        langley.draft();
        langley.length();
        langley.status();
    }
}

