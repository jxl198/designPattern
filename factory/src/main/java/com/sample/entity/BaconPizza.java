package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-20 18:16
 **/
public class BaconPizza extends Pizza {

    public BaconPizza(){
        super("baconPizza");
    }

    @Override
    public void prepare() {
        System.out.println(getName()+"is prepared");
    }
}
