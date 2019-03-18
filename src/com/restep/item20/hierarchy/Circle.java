package com.restep.item20.hierarchy;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
