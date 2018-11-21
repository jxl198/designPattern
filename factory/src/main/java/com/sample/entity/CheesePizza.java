package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-20 18:16
 **/
public class CheesePizza extends Pizza {

    public CheesePizza(){
        super("cheesePizza");
    }

    @Override
    public void prepare() {
        System.out.println(getName()+"is prepared");
    }
}
