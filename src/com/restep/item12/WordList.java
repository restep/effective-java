package com.restep.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author restep
 * @date 2019/3/18
 */
public class WordList {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);

        System.out.println(s);
    }
}
