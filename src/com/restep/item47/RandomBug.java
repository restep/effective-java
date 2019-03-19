package com.restep.item47;

import java.util.Random;

/**
 * @author restep
 * @date 2019/3/19
 */
public class RandomBug {
    private static final Random rnd = new Random();

    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if (random(n) < n / 2) {
                low++;
            }
        }

        System.out.println(low);
    }
}
