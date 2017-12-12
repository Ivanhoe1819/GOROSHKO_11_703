package ru.itis;
import java.util.Random;
class Obuvka {
    Random r = new Random();
    void size(int a) {
        a = r.nextInt();
        System.out.println(a);
    }
}
class Tapki extends Obuvka {
    void size(int b) {
        b = r.nextInt();
        System.out.println(b);
    }
}
class Uggi extends Obuvka {
    void size(int c) {
        c = r.nextInt();
        System.out.println(c);
    }
}