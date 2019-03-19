package com.restep.item77.enums;

import java.util.Arrays;

/**
 * @author restep
 * @date 2019/3/19
 */
public enum Elvis {
    INSTANCE;

    private String[] favoriteSongs = {"Hound Dog", "Heartbreak Hotel"};

    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }
}