package ru.itis;

public class Figure {
    public Figure(String typeOfElement, int leftTopX, int leftTopY, int rightDownX, int rightDownY, int colour) {
        this.typeOfElement = typeOfElement;
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.rightDownX = rightDownX;
        this.rightDownY = rightDownY;
        this.colour = colour;
    }

    private String typeOfElement;
    private int leftTopX;
    private int leftTopY;
    private int rightDownX;
    private int rightDownY;
    private int colour;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;

        Figure figure = (Figure) o;

        if (leftTopX != figure.leftTopX) return false;
        if (leftTopY != figure.leftTopY) return false;
        if (rightDownX != figure.rightDownX) return false;
        if (rightDownY != figure.rightDownY) return false;
        if (colour != figure.colour) return false;
        return typeOfElement.equals(figure.typeOfElement);
    }

    @Override
    public int hashCode() {
        int result = typeOfElement.hashCode();
        result = 31 * result + leftTopX;
        result = 31 * result + leftTopY;
        result = 31 * result + rightDownX;
        result = 31 * result + rightDownY;
        result = 31 * result + colour;
        return result;
    }

    public String getTypeOfElement() {
        return typeOfElement;
    }

    public void setTypeOfElement(String typeOfElement) {
        this.typeOfElement = typeOfElement;
    }

    public int getLeftTopX() {
        return leftTopX;
    }

    public void setLeftTopX(int leftTopX) {
        this.leftTopX = leftTopX;
    }

    public int getLeftTopY() {
        return leftTopY;
    }

    public void setLeftTopY(int leftTopY) {
        this.leftTopY = leftTopY;
    }

    public int getRightDownX() {
        return rightDownX;
    }

    public void setRightDownX(int rightDownX) {
        this.rightDownX = rightDownX;
    }

    public int getRightDownY() {
        return rightDownY;
    }

    public void setRightDownY(int rightDownY) {
        this.rightDownY = rightDownY;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    // TODO: добавить this



}
