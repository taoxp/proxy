package com.taoxp.study.policy.proxy.staticproxy;

/**
 * @author: taoxp
 * @create: 2020-11-24 10:21
 */
public class AnimalProxy implements Animal {

    private Animal animal;

    public AnimalProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void voice() {
        System.out.println("受到惊吓！");
        animal.voice();
        System.out.println("逃走！");
    }
}
