package com.restep.item35;

import java.util.ArrayList;
import java.util.List;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {

    }

    @ExceptionTest({IndexOutOfBoundsException.class, NullPointerException.class})
    public static void doublyBad() {
        List<String> list = new ArrayList<String>();

        list.addAll(5, null);
    }
}
