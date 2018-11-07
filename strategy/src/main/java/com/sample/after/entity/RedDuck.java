package com.sample.after.entity;

import com.sample.after.behavior.impl.BadFlyBehavior;
import com.sample.after.behavior.impl.NoQuackBehavior;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:44
 **/
public class RedDuck extends  Duck {
    public RedDuck(){
     super(new BadFlyBehavior(),new NoQuackBehavior());
    }
    @Override
    public void display() {
        System.out.println("this is a red duck");
    }
}
