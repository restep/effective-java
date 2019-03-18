package com.restep.item18;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/**
 * @author restep
 * @date 2019/3/19
 */
public class IntArrays {
    static List<Integer> intArrayAsList(final int[] arr) {
        if (null == arr) {
            throw new NullPointerException();
        }

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int i) {
                return arr[i];
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldVal = arr[i];
                arr[i] = val;
                return oldVal;
            }

            @Override
            public int size() {
                return arr.length;
            }
        };
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        List<Integer> list = intArrayAsList(a);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
