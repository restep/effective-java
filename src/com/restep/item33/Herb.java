package com.restep.item33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Herb {
    public enum Type {
        ANNUAL,
        PERENNIAL,
        BIENNIAL
    }

    private final String name;
    private final Type type;

    Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Herb[] garden = {
                new Herb("Basil", Type.ANNUAL),
                new Herb("Carroway", Type.BIENNIAL),
                new Herb("Dill", Type.ANNUAL),
                new Herb("Lavendar", Type.PERENNIAL),
                new Herb("Parsley", Type.BIENNIAL),
                new Herb("Rosemary", Type.PERENNIAL)
        };

        Map<Type, Set<Herb>> herbsByType = new EnumMap<>(Herb.Type.class);
        for (Herb.Type t : Herb.Type.values()) {
            herbsByType.put(t, new HashSet<>());
        }

        for (Herb h : garden) {
            herbsByType.get(h.type).add(h);
        }

        System.out.println(herbsByType);
    }
}
