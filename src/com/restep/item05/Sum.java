package com.restep.item05;

/**
 * @author restep
 * @date 2019/3/18
 */
public class Sum {
    public static void main(String[] args) {
        //优先使用基本类型而不是装箱基本类型 避免无意识的自动装箱
        Long sum = 0L;

        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
