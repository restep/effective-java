package com.restep.item30;

/**
 * @author restep
 * @date 2019/3/19
 */
public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("1");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
