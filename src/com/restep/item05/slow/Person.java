package com.restep.item05.slow;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author restep
 * @date 2019/3/18
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = new Date(birthDate.getTime());
    }

    /**
     * isBabyBoomer每次被调用的时候 都会新建一个Calendar 一个TimeZone 和两个Date实例
     * 这是不必要的
     * @return
     */
    public boolean isBabyBoomer() {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd)   <  0;
    }
}
