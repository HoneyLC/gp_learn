package com.edu.proxypattern.dynamicproxy.jdkproxy;

/**
 * @ClassName Customer
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 10:15
 */
public class Customer implements Person {

    public void findlove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6块腹肌");
    }
}
