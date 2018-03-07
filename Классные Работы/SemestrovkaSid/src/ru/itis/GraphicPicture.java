package ru.itis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class GraphicPicture implements GraphicPic {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GraphicPicture)) return false;

        GraphicPicture that = (GraphicPicture) o;

        if (head != null ? !head.equals(that.head) : that.head != null) return false;
        return last != null ? last.equals(that.last) : that.last == null;
    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public GraphicPicture(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
            String[] fig;
            String str;
            if ((str = reader.readLine()) != null) {
                fig = str.split(" ");
                Figure temp = new Figure(
                        (fig[0]),
                        Integer.parseInt(fig[1]),
                        Integer.parseInt(fig[2]),
                        Integer.parseInt(fig[3]),
                        Integer.parseInt(fig[4]),
                        Integer.parseInt(fig[5])
                );
                head = new Node(temp);
                last = head;
                size++;
            }
            while ((str = reader.readLine()) != null) {
                fig = str.split(" ");
                Figure temp = new Figure(
                        (fig[0]),
                        Integer.parseInt(fig[1]),
                        Integer.parseInt(fig[2]),
                        Integer.parseInt(fig[3]),
                        Integer.parseInt(fig[4]),
                        Integer.parseInt(fig[5])
                );
            last.next = new Node(temp);
            last = last.next;
            size++;
        }
    }

    private Node head = null;
    private Node last = null;
    private int size;

    private class Node {
        private Figure figure;
        Node next;

        public Node(Figure f) {
            figure = f;
            next = null;
        }

        public Figure getFigure() {
            return figure;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public void show() {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            System.out.println("Фигура №" + count);
            System.out.println("Фигура  - " + temp.figure.getTypeOfElement());
            System.out.println("Верхний левый икс  - " + temp.figure.getLeftTopX());
            System.out.println("Верхний левый игрек  - " + temp.figure.getLeftTopY());
            System.out.println("Нижний правый икс  - " + temp.figure.getRightDownX());
            System.out.println("Нижний правый игрек  - " + temp.figure.getRightDownY());
            System.out.println("Какого цвета желтый снег  - " + temp.figure.getColour());
            System.out.println("");
            count++;
            temp = temp.next;
        }
    }

    @Override
    public void insert(Figure f) {
        if (head == null) {
            head = new Node(f);
            last = head;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.figure.getTypeOfElement().equals(f.getTypeOfElement()) && temp.figure.getLeftTopX() == f.getLeftTopX() && temp.figure.getLeftTopY() == f.getLeftTopY() && temp.figure.getRightDownX() == f.getRightDownX() && temp.figure.getRightDownY() == f.getRightDownY()) {
                temp.figure.setColour(f.getColour());
                return;
            }
            temp = temp.next;
        }
        last.next = new Node(f);
        last = last.next;
        size++;
    }

    @Override
    public void delete(String i) {
        Node temp = head;
        Node q;
        while (temp != null && temp.next != null) {
            if (temp.next.figure.getTypeOfElement().equals(i)) {
                if (temp.next.next == null) {
                    last = temp;
                }
                temp.next = temp.next.next;
            }
            q = temp;
            temp = temp.next;
        }
        if (head.figure.getTypeOfElement().equals(i)) {
            head = head.next;
        }
        size--;
    }

    private GraphicPicture() {
    }

    @Override
    public GraphicPic commonWith(Figure f) {
        GraphicPic t = new GraphicPicture();
//        Node q = new Node(new Figure("rectangle", 0, 0, 0, 0, 0));
//        Node l = q;
        Node temp = head;
        while (temp != null) {
            if ((temp.figure.getLeftTopY() == f.getLeftTopY() && temp.figure.getLeftTopX() == f.getLeftTopX()) ||
                    (temp.figure.getLeftTopX() == f.getRightDownY() && temp.figure.getLeftTopX() == f.getRightDownX()) ||
                    (temp.figure.getRightDownY() == f.getRightDownY() && temp.figure.getRightDownX() == f.getRightDownX()) ||
                    (temp.figure.getRightDownY() == f.getLeftTopY() && temp.figure.getRightDownX() == f.getLeftTopY())) {
//                l.next = new Node(temp.figure);
//                l = l.next;
                t.insert(temp.figure);
            }
            temp = temp.next;
        }

        return t;
    }

    @Override
    public GraphicPic hasSquareBuggerThanS(double s) {
        GraphicPic t = new GraphicPicture();
        Node temp = head;
        while (temp != null) {
            if (square(temp.getFigure()) > s) {
                t.insert(temp.figure);
            }
            temp = temp.next;
        }
        return t;
    }

    private double square(Figure chan){
        if (chan.getTypeOfElement().equals("rectangle")){
            return chan.getRightDownX() - chan.getLeftTopX();
        }
        if (chan.getTypeOfElement().equals("circle")){
            return  chan.getRightDownX() * chan.getRightDownX() * 3.14;
        }
        return 0;
    }
}
