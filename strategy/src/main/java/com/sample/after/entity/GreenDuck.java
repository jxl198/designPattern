package com.sample.after.entity;

import com.sample.after.behavior.impl.GoodFlyBeihavior;
import com.sample.after.behavior.impl.GoodQuackBehavior;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:43
 **/
public class GreenDuck extends Duck {
   public  GreenDuck(){
       super(new GoodFlyBeihavior(),new GoodQuackBehavior());
   }
    @Override
    public void display() {
        System.out.println("this is a green duck");
    }
}
