package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-20 18:17
 **/
public class PepperPizza extends Pizza {

    public PepperPizza(){
        super("pepperPizza");
    }

    @Override
    public void prepare() {
        System.out.println(getName()+"is prepared");
    }
}
