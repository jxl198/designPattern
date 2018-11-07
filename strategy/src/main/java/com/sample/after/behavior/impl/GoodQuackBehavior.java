package com.sample.after.behavior.impl;

import com.sample.after.behavior.QuackBehavior;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:38
 **/
public class GoodQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("good quack");

    }
}
