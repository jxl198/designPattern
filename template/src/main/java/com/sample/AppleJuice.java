package com.sample;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-28 15:49
 **/
public class AppleJuice extends Juice {
    @Override
    protected void prepare() {
        System.out.println("apple is prepared");
    }
}
