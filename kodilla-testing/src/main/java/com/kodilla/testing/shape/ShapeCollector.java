package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        return shapes.get(n);
    }
    public String showFigures() {
        System.out.println(shapes.toArray());

        return Arrays.toString(shapes.toArray());
    }
}
