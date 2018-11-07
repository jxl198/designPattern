package com.sample.after.behavior.impl;

import com.sample.after.behavior.FlyBehavior;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:37
 **/
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("bad fly");

    }
}
