package com.restep.item27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author restep
 * @date 2019/3/19
 */
public class GenericStaticFactory {
    public static <K,V> HashMap<K,V> newHashMap() {
        return new HashMap<K,V>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> anagrams = newHashMap();
    }
}
