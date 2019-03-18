package com.restep.item27;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author restep
 * @date 2019/3/19
 */
public class RecursiveTypeBound {
    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        System.out.println(max(argList));
    }
}
