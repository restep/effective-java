package com.restep.item17;

import java.util.Date;

/**
 * @author restep
 * @date 2019/3/19
 */
public final class Sub extends Super {
    private final Date date;

    Sub() {
        date = new Date();
    }

    @Override
    public void overrideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
