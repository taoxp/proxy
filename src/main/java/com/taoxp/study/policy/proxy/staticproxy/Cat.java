package com.taoxp.study.policy.proxy.staticproxy;

/**
 * @author: taoxp
 * @create: 2020-11-24 10:24
 */
public class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("cat voice: 喵喵～");
    }
}
