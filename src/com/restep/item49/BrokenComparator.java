package com.restep.item49;

import java.util.Comparator;

/**
 * @author restep
 * @date 2019/3/19
 */
public class BrokenComparator {
    public static void main(String[] args) {

        Comparator<Integer> naturalOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first < second ? -1 : (first == second ? 0 : 1);
            }
        };


        int result = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result);
    }
}
