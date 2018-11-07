package com.sample.before.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:05
 **/
public class GreenDuck extends Duck {
    @Override
    public void display() {
        System.out.println("this is a green duck");
    }

    @Override
    public void fly() {
        System.out.println("fly good");
    }

    @Override
    public void quack() {
        System.out.println("quack good");
    }
}
