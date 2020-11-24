package com.taoxp.study.policy.proxy.staticproxy;

/**
 * @author: taoxp
 * @create: 2020-11-24 10:20
 */
public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("dog voice: 汪汪～");
    }
}
