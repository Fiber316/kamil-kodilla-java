package com.kodilla.testing.shape;

class Square implements Shape{

    public double side;

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return side * side;
    }
}
