package ru.itis;
import java.util.Random;
public class GuitarForZad1 extends MusicInstrument{
    Random r = new Random();
    String name;
    String tone;
    int price;
    GuitarForZad1(String name,int price, String tone){
        this.name = name;
        this.tone = tone;
        this.price = price;
    }
}
