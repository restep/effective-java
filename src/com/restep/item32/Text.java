package com.restep.item32;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author restep
 * @date 2019/3/19
 */
public class Text {
    public enum Style {
        BOLD,
        ITALIC,
        UNDERLINE,
        STRIKETHROUGH
    }

    public void applyStyles(Set<Style> styles) {
        for (Style ele : styles) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
