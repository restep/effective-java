package com.restep.item39;

import java.util.Date;

/**
 * @author restep
 * @date 2019/3/19
 */
public final class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }

        this.start = start;
        this.end = end;
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }
}
