package com.restep.item77;

import java.io.Serializable;

/**
 * @author restep
 * @date 2019/3/19
 */
public class ElvisStealer implements Serializable {
    private static final long serialVersionUID = 0;

    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        impersonator = payload;

        return new String[]{"A Fool Such as I"};
    }
}
