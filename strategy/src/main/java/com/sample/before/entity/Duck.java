package com.sample.before.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:00
 **/
public abstract class Duck {

    public void fly() {
        System.out.println("duck fly");
    }

    public void quack() {
        System.out.println("duck quack");
    }

    public void swim() {
        System.out.println("i am swimming");
    }

    public abstract void  display();
}
