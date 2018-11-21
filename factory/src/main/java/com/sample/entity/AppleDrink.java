package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:18
 **/
public class AppleDrink extends Drink {
    public AppleDrink() {
        super("apple");
    }

    @Override
    public void prepare() {
        System.out.println("apple is prepared");

    }
}
