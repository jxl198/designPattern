package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:17
 **/
public class OrangeDrink extends Drink{
    public OrangeDrink() {
        super("orange");
    }

    @Override
    public void prepare() {
        System.out.println("orange is prepared");

    }
}
