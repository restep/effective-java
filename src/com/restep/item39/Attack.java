package com.restep.item39;

import java.util.Date;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Attack {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);
        System.out.println(p);

        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);
        System.out.println(p);
    }
}
