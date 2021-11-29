package com.learning.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean isRemoved = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            isRemoved = true;
        }
        return isRemoved;
    }


    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }

    public String showFigures() {
        return shapeList.toString();
    }

    public int getShapesListQuantity() {
        return shapeList.size();
    }
}