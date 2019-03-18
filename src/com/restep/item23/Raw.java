package com.restep.item23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Raw {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        unsafeAdd(strList, new Integer(42));
        String s = strList.get(0);
        System.out.println(s);
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    static int rawNumElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }

        return result;
    }

    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }

        return result;
    }
}
