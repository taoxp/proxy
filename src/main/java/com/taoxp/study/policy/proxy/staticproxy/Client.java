package com.taoxp.study.policy.proxy.staticproxy;

/**
 * @author: taoxp
 * @create: 2020-11-24 10:22
 */
public class Client {
    public static void main(String[] args) {
        Animal dogTarget=new Dog();
        Animal catTarget=new Cat();
        AnimalProxy proxy1=new AnimalProxy(dogTarget);
        proxy1.voice();
        AnimalProxy proxy2=new AnimalProxy(catTarget);
        proxy2.voice();
    }
}
