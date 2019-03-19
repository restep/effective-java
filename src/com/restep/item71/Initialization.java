package com.restep.item71;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Initialization {
    private final FieldType field1 = computeFieldValue();

    private FieldType field2;

    synchronized FieldType getField2() {
        if (field2 == null) {
            field2 = computeFieldValue();
        }

        return field2;
    }

    private static class FieldHolder {
        static final FieldType field = computeFieldValue();
    }

    static FieldType getField3() {
        return FieldHolder.field;
    }


    private volatile FieldType field4;

    FieldType getField4() {
        FieldType result = field4;
        if (result == null) {
            synchronized (this) {
                result = field4;
                if (result == null) {
                    field4 = result = computeFieldValue();
                }
            }
        }

        return result;
    }

    private volatile FieldType field5;

    private FieldType getField5() {
        FieldType result = field5;
        if (result == null) {
            field5 = result = computeFieldValue();
        }

        return result;
    }

    private static FieldType computeFieldValue() {
        return new FieldType();
    }
}

class FieldType {

}
