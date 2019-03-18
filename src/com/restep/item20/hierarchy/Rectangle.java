package com.restep.item20.hierarchy;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
