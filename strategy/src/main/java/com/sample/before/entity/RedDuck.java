package com.sample.before.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:08
 **/
public class RedDuck extends Duck {
    @Override
    public void display() {
        System.out.println("this is red duck");

    }

    @Override
    public void fly() {
        System.out.println("bad fly");
    }

    @Override
    public void quack() {
        System.out.println("no quack ");
    }
}
